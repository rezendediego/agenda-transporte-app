package br.edu.infnet.appagendatransporte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appagendatransporte.model.negocio.Delivery;
import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.service.DeliveryService;

@Controller
public class DeliveryController {
	@Autowired
	private DeliveryService deliveryService;
	
	@GetMapping(value = "/delivery/lista")
	public String telaLista(Model model, @SessionAttribute("usuariodisplay") Usuario usuario) {		
		model.addAttribute("listaDelivery", deliveryService.obterLista(usuario));
		return "delivery/lista";
	}
	
	@GetMapping(value = "/delivery/cadastro")
	public String telaCadastro() {
		return "delivery/cadastro";
	}
	
	@PostMapping(value="/delivery/incluir")
	public String incluir(Delivery delivery, @SessionAttribute("usuariodisplay") Usuario usuario) {
		delivery.setUsuario(usuario);
		deliveryService.incluir(delivery);
		return "redirect:/delivery/lista";
	}
	
	@GetMapping(value = "/delivery/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		deliveryService.excluir(id);
		return "redirect:/delivery/lista";
	}
}
