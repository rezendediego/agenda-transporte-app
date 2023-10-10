package br.edu.infnet.appagendatransporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appagendatransporte.model.negocio.Delivery;
import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.Endereco;
import br.edu.infnet.appagendatransporte.model.negocio.utilitarios.TipoProduto;
import br.edu.infnet.appagendatransporte.model.service.DeliveryService;

@Order(3)
@Component
public class LoaderDelivery implements ApplicationRunner {
	@Autowired
	private DeliveryService deliveryService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("d,M,yyyy,H,m");

		FileReader file = new FileReader("./arquivos/delivery.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");
			Delivery delivery = new Delivery(campos[0], LocalDateTime.parse(campos[1], formatadorDataHora),
					new Endereco(campos[2], Integer.valueOf(campos[3]), campos[4]),
					new Endereco(campos[5], Integer.valueOf(campos[6]), campos[7]), Integer.valueOf(campos[8]),
					TipoProduto.valueOf(campos[9]), Boolean.valueOf(campos[10]), campos[11]);
			
			delivery.setUsuario(new Usuario(Integer.valueOf(campos[12])));
			deliveryService.incluir(delivery);

			linha = leitura.readLine();

		}
		leitura.close();
	}
}
