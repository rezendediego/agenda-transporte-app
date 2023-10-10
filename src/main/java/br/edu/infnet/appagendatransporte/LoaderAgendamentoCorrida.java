package br.edu.infnet.appagendatransporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagendatransporte.controller.AgendamentoCorridaController;
import br.edu.infnet.appagendatransporte.model.negocio.AgendamentoCorrida;
import br.edu.infnet.appagendatransporte.model.negocio.Corrida;
import br.edu.infnet.appagendatransporte.model.negocio.Delivery;
import br.edu.infnet.appagendatransporte.model.negocio.Motorista;
import br.edu.infnet.appagendatransporte.model.negocio.Pet;
import br.edu.infnet.appagendatransporte.model.negocio.Viagem;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.DistanciaViagem;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoAnimal;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoProduto;

@Order(5)
@Component
public class LoaderAgendamentoCorrida implements ApplicationRunner{
	@Autowired
	private AgendamentoCorridaController agendamentoCorridaController;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {	
		DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("d,M,yyyy,H,m");
		FileReader file = new FileReader("./arquivos/agendamentocorrida.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[]campos = null;
		
		AgendamentoCorrida agendamentoCorrida = null;
		
		while(linha!=null) {
			campos = linha.split(";");
			switch(campos[0]) {
			case "A":
				agendamentoCorrida = new AgendamentoCorrida(
						new Motorista(Float.valueOf(campos[1]),campos[2],campos[3],campos[4],campos[5]),
						new ArrayList<Corrida>()
						);
				
				agendamentoCorridaController.incluir(agendamentoCorrida);
				break;
			
			case "D":
				Delivery delivery =  new Delivery(campos[1],
						Optional.of(LocalDateTime.parse(campos[2],formatadorDataHora)),
						new Endereco(campos[3], Integer.valueOf(campos[4]), campos[5]), 
						new Endereco(campos[6], Integer.valueOf(campos[7]), campos[8]), 
						Integer.valueOf(campos[9]), 
						TipoProduto.valueOf(campos[10]), 
						Boolean.valueOf(campos[11]), 
						campos[12]);
				
				agendamentoCorrida.getListaCorridaAgendada().add(delivery);
				break;
				
			case "P":				
				Pet pet = new Pet(campos[1],
						Optional.of(LocalDateTime.parse(campos[2],formatadorDataHora)),
						new Endereco(campos[3], Integer.valueOf(campos[4]), campos[5]), 
						new Endereco(campos[6], Integer.valueOf(campos[7]), campos[8]), 
						Integer.valueOf(campos[9]), 
				 		TipoAnimal.valueOf(campos[10]),
				 		Boolean.valueOf(campos[11]),
				 		Boolean.valueOf(campos[12]));
				
				agendamentoCorrida.getListaCorridaAgendada().add(pet);
				break;
				
			case "V":
				Viagem viagem = new Viagem(campos[1],
						Optional.of(LocalDateTime.parse(campos[2],formatadorDataHora)),
						new Endereco(campos[3], Integer.valueOf(campos[4]), campos[5]), 
						new Endereco(campos[6], Integer.valueOf(campos[7]), campos[8]), 
						Integer.valueOf(campos[9]), 
						Boolean.valueOf(campos[10]),
						Boolean.valueOf(campos[11]),
						DistanciaViagem.valueOf(campos[12]));
				
				agendamentoCorrida.getListaCorridaAgendada().add(viagem);
				break;
		
			default:
				break;		
			}
			
			linha = leitura.readLine();
		}
		
		leitura.close();
	}

}
