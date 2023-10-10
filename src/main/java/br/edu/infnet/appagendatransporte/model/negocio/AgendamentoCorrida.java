package br.edu.infnet.appagendatransporte.model.negocio;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class AgendamentoCorrida {
	private UUID idAgendamentoCorrida;
	private LocalDateTime dataAgendamento; 	
	private Boolean confirmacaoMotorista;
	private Motorista motorista;
	private List<Corrida> listaCorridaAgendada;
	private String nomeCliente;
	
	public AgendamentoCorrida() {
		this.idAgendamentoCorrida = UUID.randomUUID();
		this.dataAgendamento = LocalDateTime.now();
		this.confirmacaoMotorista= true;
		this.nomeCliente= "Anonimo";
	}
	
	public AgendamentoCorrida(Motorista motorista, List<Corrida> listaCorridaAgendada) {		
		this();
		this.listaCorridaAgendada= listaCorridaAgendada;		
		this.motorista= motorista;	

	}
	
	
	
	@Override
	public String toString() {
		
		return "{ Corrida Agendada: " + 
					"idAgendamentoCorrida: "+ idAgendamentoCorrida + " , " +
					"dataAgendamento: " + dataAgendamento + " , " +					
					"confirmacaoMotorista: " + confirmacaoMotorista + " , " +
					"motorista: " + motorista + " , " +
					"numero de corridas agendadas: " + listaCorridaAgendada.size() + " , " +
					"listaCorridaAgendada: " + listaCorridaAgendada + " , " +
					"nomeCliente: " + nomeCliente; 
	}

	public Boolean getConfirmacaoMotorista() {
		return confirmacaoMotorista;
	}

	public void setConfirmacaoMotorista(Boolean confirmacaoMotorista) {
		this.confirmacaoMotorista = confirmacaoMotorista;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public List<Corrida> getListaCorridaAgendada() {
		return listaCorridaAgendada;
	}

	public void setListaCorridaAgendada(List<Corrida> listaCorridaAgendada) {
		this.listaCorridaAgendada = listaCorridaAgendada;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public UUID getIdAgendamentoCorrida() {
		return idAgendamentoCorrida;
	}

	public LocalDateTime getDataAgendamento() {
		return dataAgendamento;
	}
	
	

}
