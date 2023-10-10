package br.edu.infnet.appagendatransporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagendatransporte.controller.PetController;
import br.edu.infnet.appagendatransporte.model.negocio.Pet;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoAnimal;

@Order(4)
@Component
public class LoaderPet implements ApplicationRunner{
	@Autowired
	private PetController petController;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {		
		DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("d,M,yyyy,H,mm");
		
		FileReader file = new FileReader("./arquivos/pet.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[]campos = null;
		
		
		while(linha!=null) {
			campos = linha.split(";");
			
			Pet pet = new Pet(campos[0], 
					Optional.of(LocalDateTime.parse(campos[1], formatadorDataHora)),
					new Endereco(campos[2], Integer.valueOf(campos[3]), campos[4]),
					new Endereco(campos[5], Integer.valueOf(campos[6]), campos[7]), 
					Integer.valueOf(campos[8]),
					TipoAnimal.valueOf(campos[9]),
					Boolean.valueOf(campos[10]),
					Boolean.valueOf(campos[11]));
			
			petController.incluir(pet);
			
			linha = leitura.readLine();
		}
		leitura.close();
	}
}
