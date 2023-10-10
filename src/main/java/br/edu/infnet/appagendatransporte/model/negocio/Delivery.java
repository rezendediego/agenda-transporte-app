package br.edu.infnet.appagendatransporte.model.negocio;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoCorrida;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoProduto;

@Entity
@Table(name="TDelivery")
public class Delivery extends Corrida {
	private TipoProduto tipoProduto;
	private Boolean seguroProduto;
	private String responsavelRecebimento;
	
	public Delivery() {
		super();
	}
	
	public Delivery(String codigo,
					LocalDateTime dataAgendada, 
					Endereco enderecoOrigem,
					Endereco enderecoDestino,
					int quantidadePassageiros,
					TipoProduto tipoProduto,
					Boolean seguroProduto,
					String responsavelRecebimento) {
		super(codigo, dataAgendada, TipoCorrida.DELIVERY, enderecoOrigem, enderecoDestino, quantidadePassageiros);
		this.tipoProduto = tipoProduto;
		this.seguroProduto = seguroProduto;
		this.responsavelRecebimento = responsavelRecebimento;
	}
	
	@Override
	public String toString() {
		return "{ Corrida Delivery: " + super.toString() + 
				"tipoProduto: " + tipoProduto + " " +
				"seguroProduto: " + seguroProduto + " " +
				"responsavelRecebimento: " + responsavelRecebimento  + " " + " }";
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Boolean getSeguroProduto() {
		return seguroProduto;
	}

	public void setSeguroProduto(Boolean seguroProduto) {
		this.seguroProduto = seguroProduto;
	}

	public String getResponsavelRecebimento() {
		return responsavelRecebimento;
	}

	public void setResponsavelRecebimento(String responsavelRecebimento) {
		this.responsavelRecebimento = responsavelRecebimento;
	}
	
	
	
}
