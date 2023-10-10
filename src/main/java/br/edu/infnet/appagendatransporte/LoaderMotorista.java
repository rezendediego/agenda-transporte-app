package br.edu.infnet.appagendatransporte;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagendatransporte.model.negocio.Motorista;
import br.edu.infnet.appagendatransporte.model.service.MotoristaService;

@Order(1)
@Component
public class LoaderMotorista implements ApplicationRunner{	
	@Autowired
	private MotoristaService motoristaService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		FileReader file = new FileReader("./arquivos/motorista.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");
			Motorista motorista = new Motorista(Float.valueOf(campos[0]),
					campos[1],
					campos[2],
					campos[3],
					campos[4]);

			motoristaService.incluir(motorista);
			linha = leitura.readLine();
		}
		
		
		leitura.close();
	}

}
