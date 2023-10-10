package br.edu.infnet.appagendatransporte;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.service.UsuarioService;

@Order(1)
@Component
public class LoaderUsuario implements ApplicationRunner {
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("./arquivos/usuario.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");
			Usuario usuario = new Usuario();
			usuario.setEmail(campos[0]);
			usuario.setNomeUsuario(campos[1]);
			usuario.setSenha(campos[2]);

			usuarioService.incluir(usuario);
			linha = leitura.readLine();
		}

		leitura.close();
	}

}
