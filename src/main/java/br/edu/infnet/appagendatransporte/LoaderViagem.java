package br.edu.infnet.appagendatransporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.negocio.Viagem;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.DistanciaViagem;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.service.ViagemService;

@Component
public class LoaderViagem implements ApplicationRunner {
	@Autowired
	private ViagemService viagemService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("d,M,yyyy,H,m");

		FileReader file = new FileReader("./arquivos/viagem.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");
			Viagem viagem = new Viagem(campos[0],LocalDateTime.parse(campos[1], formatadorDataHora),
					new Endereco(campos[2], Integer.valueOf(campos[3]), campos[4]),
					new Endereco(campos[5], Integer.valueOf(campos[6]), campos[7]), Integer.valueOf(campos[8]),
					Boolean.valueOf(campos[9]), Boolean.valueOf(campos[10]), DistanciaViagem.valueOf(campos[11]));

			viagem.setUsuario(new Usuario(Integer.valueOf(campos[12])));
			viagemService.incluir(viagem);
			linha = leitura.readLine();
		}
		leitura.close();
	}
}
