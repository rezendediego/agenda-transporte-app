package br.edu.infnet.appagendatransporte.model.negocio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoCorrida;

@Entity
@Table(name = "TCorrida")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Corrida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String codigo;
	@Transient
	private LocalDateTime dataAgendada;
	private TipoCorrida tipoCorrida;
	@Transient
	private Endereco enderecoOrigem;
	@Transient
	private Endereco enderecoDestino;
	private int quantidadePassageiros;
	private BigDecimal precoMinimo;

	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public Corrida() {

	}

	public Corrida(String codigo, LocalDateTime dataAgendada, TipoCorrida tipoCorrida, Endereco enderecoOrigem,
			Endereco enderecoDestino, int quantidadePassageiros) {
		this.codigo = codigo;
		this.dataAgendada = dataAgendada;
		this.tipoCorrida = tipoCorrida;
		this.enderecoOrigem = enderecoOrigem;
		this.enderecoDestino = enderecoDestino;
		this.quantidadePassageiros = quantidadePassageiros;
		this.precoMinimo = calcularPrecoMinimo(this.tipoCorrida);
	}

	private BigDecimal calcularPrecoMinimo(TipoCorrida tipoCorrida) {
		BigDecimal precoMinimo = null;
		switch (tipoCorrida) {
		case DELIVERY:
			precoMinimo = new BigDecimal("10");
			break;
		case PET:
			precoMinimo = new BigDecimal("30");
			break;
		case VIAGEM:
			precoMinimo = new BigDecimal("15");
			break;
		default:
			break;
		}
		return precoMinimo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setPrecoMinimo(BigDecimal precoMinimo) {
		this.precoMinimo = precoMinimo;
	}

	public String getCodigo() {
		return codigo;
	}

	public LocalDateTime getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(LocalDateTime dataAgendada) {
		this.dataAgendada = dataAgendada;
	}

	public TipoCorrida getTipoCorrida() {
		return tipoCorrida;
	}

	public void setTipoCorrida(TipoCorrida tipoCorrida) {
		this.tipoCorrida = tipoCorrida;
	}

	public Endereco getEnderecoOrigem() {
		return enderecoOrigem;
	}

	public void setEnderecoOrigem(Endereco enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}

	public Endereco getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(Endereco enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}

	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}

	public BigDecimal getPrecoMinimo() {
		return precoMinimo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "idCorrida: " + id + " " + "codigo corrida: " + codigo + " " + "dataAgendada: " + dataAgendada + " "
				+ "tipoCorrida: " + tipoCorrida + " " + "enderecoOrigem: " + enderecoOrigem + " " + "enderecoDestino: "
				+ enderecoDestino + " " + "quantidadePassageiros: " + quantidadePassageiros + " " + "precoMinimo: "
				+ precoMinimo + " ";
	}

}
