package br.edu.infnet.appagendatransporte.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appagendatransporte.model.negocio.Delivery;


@Controller
public class DeliveryController {
	
	private Map<String,Delivery> mapaDelivery = new HashMap<String,Delivery>(); 
	
	public Collection<Delivery> obterDeliveries(){
		return mapaDelivery.values();
	}

	
	public void incluir(Delivery delivery){
		mapaDelivery.put(delivery.getCodigo(), delivery);
		System.out.println(">>>: [Delivery] Inclusão realizada com sucesso: " + delivery);
	}
	
	public void excluir(String codigo){
		mapaDelivery.remove(codigo);
	}
	
	@GetMapping(value = "/delivery/lista")
	public String telaDelivery(Model model) {
		
		model.addAttribute("listaDelivery", obterDeliveries());
		return "delivery/lista";
	}
	
	@GetMapping(value = "/delivery/{codigo}/excluir")
	public String exclusao(@PathVariable String codigo) {
		excluir(codigo);
		return "redirect:/delivery/lista";
	}
}
