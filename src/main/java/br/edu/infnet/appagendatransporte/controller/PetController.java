package br.edu.infnet.appagendatransporte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appagendatransporte.model.negocio.Pet;
import br.edu.infnet.appagendatransporte.model.negocio.Usuario;
import br.edu.infnet.appagendatransporte.model.service.PetService;

@Controller
public class PetController {
	@Autowired
	private PetService petService;
	
	@GetMapping(value = "/pet/lista")
	public String telaLista(Model model, @SessionAttribute("usuariodisplay") Usuario usuario) {		
		model.addAttribute("listaPet", petService.obterLista(usuario));
		return "pet/lista";
	}
	
	@GetMapping(value = "/pet/cadastro")
	public String telaCadastro() {
		return "pet/cadastro";
	}
	
	@PostMapping(value="/pet/incluir")
	public String incluir(Pet pet, @SessionAttribute("usuariodisplay") Usuario usuario) {
		pet.setUsuario(usuario);
		petService.incluir(pet);
		return "redirect:/pet/lista";
	}
	
	@GetMapping(value = "/pet/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		petService.excluir(id);
		return "redirect:/pet/lista";
	}
}
