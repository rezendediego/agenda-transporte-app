package br.edu.infnet.appagendatransporte.model.negocio;

import java.time.LocalDateTime;
import java.util.Optional;

import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoCorrida;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoProduto;

public class Delivery extends Corrida {
	private TipoProduto tipoProduto;
	private Boolean seguroProduto;
	private String responsavelRecebimento;
	
	public Delivery() {
		super();
	}
	
	public Delivery(String codigo,
					Optional<LocalDateTime> dataAgendada, 
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
