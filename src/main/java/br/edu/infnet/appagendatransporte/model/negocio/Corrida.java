package br.edu.infnet.appagendatransporte.model.negocio;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoCorrida;

public abstract class Corrida {
	private UUID idCorrida;
	private String codigo;
	private Optional<LocalDateTime> dataAgendada;
	private TipoCorrida tipoCorrida;
	private Endereco enderecoOrigem;
	private Endereco enderecoDestino;
	private int quantidadePassageiros;
	private BigDecimal precoMinimo;
	
	public Corrida() {
		
	}
	
	
	public Corrida(String codigo, Optional<LocalDateTime> dataAgendada, TipoCorrida tipoCorrida, Endereco enderecoOrigem, Endereco enderecoDestino, int quantidadePassageiros) {
		this.idCorrida = UUID.randomUUID();
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
		switch(tipoCorrida) {
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
	
	
	public UUID getIdCorrida() {
		return idCorrida;
	}

		
	public String getCodigo() {
		return codigo;
	}


	public Optional<LocalDateTime> getDataAgendada() {
		return dataAgendada;
	}


	public void setDataAgendada(Optional<LocalDateTime> dataAgendada) {
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

	@Override
	public String toString() {
		return "idCorrida: " + idCorrida.toString() + " " +
			   "codigo corrida: " + codigo + " " + 
			   "dataAgendada: " + dataAgendada + " " +
			   "tipoCorrida: " + tipoCorrida + " " +
			   "enderecoOrigem: " + enderecoOrigem + " " +
			   "enderecoDestino: " + enderecoDestino + " " +
			   "quantidadePassageiros: " + quantidadePassageiros + " " +
			   "precoMinimo: " + precoMinimo + " ";
		}

}
