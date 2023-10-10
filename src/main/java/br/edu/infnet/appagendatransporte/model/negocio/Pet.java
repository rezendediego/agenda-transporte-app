package br.edu.infnet.appagendatransporte.model.negocio;

import java.time.LocalDateTime;
import java.util.Optional;

import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoAnimal;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoCorrida;

public class Pet extends Corrida {
	private TipoAnimal tipoAnimal; 
	private Boolean acompanhanteHumano; 
	private Boolean aguardarConsulta; 
	
	public Pet() {
		super();
	}
	
	public Pet(String codigo,
			Optional<LocalDateTime> dataAgendada,
			Endereco enderecoOrigem,
			Endereco enderecoDestino,
			int quantidadePassageiros,
			TipoAnimal tipoAnimal,
			Boolean acompanhanteHumano,
			Boolean aguardarConsulta) {
		super(codigo,dataAgendada,TipoCorrida.PET,enderecoOrigem,enderecoDestino,quantidadePassageiros);
		this.tipoAnimal = tipoAnimal;
		this.acompanhanteHumano = acompanhanteHumano;
		this.aguardarConsulta = aguardarConsulta;
	}
	
	@Override
	public String toString() {
		return "{ Corrida Pet: " + super.toString() + 
				"tipoAnimal: " + tipoAnimal + " " +
				"acompanhanteHumano: " + acompanhanteHumano + " " +
				"aguardarConsulta: " + aguardarConsulta  + " " + " }";
	}

	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public Boolean getAcompanhanteHumano() {
		return acompanhanteHumano;
	}

	public void setAcompanhanteHumano(Boolean acompanhanteHumano) {
		this.acompanhanteHumano = acompanhanteHumano;
	}

	public Boolean getAguardarConsulta() {
		return aguardarConsulta;
	}

	public void setAguardarConsulta(Boolean aguardarConsulta) {
		this.aguardarConsulta = aguardarConsulta;
	}
	
	
}
