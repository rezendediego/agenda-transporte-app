package br.edu.infnet.appagendatransporte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appagendatransporte.model.negocio.Motorista;
import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.service.MotoristaService;

@Controller
public class MotoristaController {
	@Autowired
	private MotoristaService motoristaService;
	
	@GetMapping(value = "/motorista/lista")
	public String telaLista(Model model, @SessionAttribute("usuariodisplay") Usuario usuario) {		
		model.addAttribute("listaMotorista", motoristaService.obterMotoristas(usuario));
		return "motorista/lista";
	}
	
	@GetMapping(value = "/motorista/cadastro")
	public String telaCadastro() {
		return "motorista/cadastro";
	}
	
	@PostMapping(value="/motorista/incluir")
	public String incluir(Motorista motorista, @SessionAttribute("usuariodisplay") Usuario usuario) {
		motorista.setUsuario(usuario);
		motoristaService.incluir(motorista);
		return "redirect:/motorista/lista";
	}
	
	@GetMapping(value = "/motorista/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		motoristaService.excluir(id);
		return "redirect:/motorista/lista";
	}
}
