package br.edu.infnet.appagendatransporte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.negocio.Viagem;
import br.edu.infnet.appagendatransporte.model.service.ViagemService;

@Controller
public class ViagemController {
	@Autowired
	private ViagemService viagemService;
	
	@GetMapping(value = "/viagem/lista")
	public String telaLista(Model model, @SessionAttribute("usuariodisplay") Usuario usuario) {		
		model.addAttribute("listaViagem", viagemService.obterLista(usuario));
		return "viagem/lista";
	}
	
	@GetMapping(value = "/viagem/cadastro")
	public String telaCadastro() {
		return "viagem/cadastro";
	}
	
	@PostMapping(value="/viagem/incluir")
	public String incluir(Viagem viagem, @SessionAttribute("usuariodisplay") Usuario usuario) {
		viagem.setUsuario(usuario);
		viagemService.incluir(viagem);
		return "redirect:/viagem/lista";
	}
	
	@GetMapping(value = "/viagem/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		viagemService.excluir(id);
		return "redirect:/viagem/lista";
	}
}
