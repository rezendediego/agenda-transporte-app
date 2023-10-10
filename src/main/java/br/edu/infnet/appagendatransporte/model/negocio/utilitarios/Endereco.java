package br.edu.infnet.appagendatransporte.model.negocio.utilitarios;

public class Endereco {
	String nomeRua;
	Integer numeroResidencia;
	String cep;
	
	public Endereco(String nomeRua,	Integer numeroResidencia, String cep) {
		this.nomeRua = nomeRua;
		this.numeroResidencia = numeroResidencia;
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return String.format("Endereço: %s, %d, %s", 
				nomeRua, 
				numeroResidencia, 
				cep);
	}
}