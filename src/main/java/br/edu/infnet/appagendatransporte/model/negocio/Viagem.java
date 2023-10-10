package br.edu.infnet.appagendatransporte.model.negocio;

import java.time.LocalDateTime;
import java.util.Optional;

import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.DistanciaViagem;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoCorrida;

public class Viagem extends Corrida {
	private Boolean areaDeRisco; 
	private Boolean possuiBagagem;
	private DistanciaViagem distanciaViagem;  
	
	public Viagem() {
		super();
	}
	
	public Viagem(String codigo,
			Optional<LocalDateTime> dataAgendada, 
			Endereco enderecoOrigem,
			Endereco enderecoDestino,
			int quantidadePassageiros,
			Boolean areaDeRisco, 
			Boolean possuiBagagem,
			DistanciaViagem distanciaViagem) {
		
		super(codigo,dataAgendada,TipoCorrida.VIAGEM,enderecoOrigem,enderecoDestino,quantidadePassageiros);
		this.areaDeRisco = areaDeRisco;
		this.possuiBagagem = possuiBagagem;
		this.distanciaViagem = distanciaViagem;
	}
	
	@Override
	public String toString() {
		return "{ Corrida Viagem: " + super.toString() + 
				"areaDeRisco: " + areaDeRisco + " " +
				"possuiBagagem: " + possuiBagagem + " " +
				"distanciaViagem: " + distanciaViagem  + " " + " }";
	}

	public Boolean getAreaDeRisco() {
		return areaDeRisco;
	}

	public void setAreaDeRisco(Boolean areaDeRisco) {
		this.areaDeRisco = areaDeRisco;
	}

	public Boolean getPossuiBagagem() {
		return possuiBagagem;
	}

	public void setPossuiBagagem(Boolean possuiBagagem) {
		this.possuiBagagem = possuiBagagem;
	}

	public DistanciaViagem getDistanciaViagem() {
		return distanciaViagem;
	}

	public void setDistanciaViagem(DistanciaViagem distanciaViagem) {
		this.distanciaViagem = distanciaViagem;
	}
	
	
}
