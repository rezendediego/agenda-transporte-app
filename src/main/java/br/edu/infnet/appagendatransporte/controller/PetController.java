package br.edu.infnet.appagendatransporte.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appagendatransporte.model.negocio.Pet;


@Controller
public class PetController {
	
	private Map<String,Pet> mapaPet = new HashMap<String,Pet>(); 
	
	public Collection<Pet> obterPets(){
		return mapaPet.values();
	}

	
	public void incluir(Pet pet){
		mapaPet.put(pet.getCodigo(), pet);
		System.out.println(">>>: [Pet] Inclusão realizada com sucesso: " + pet);
	}
	
	public void excluir(String codigo){
		mapaPet.remove(codigo);
	}
	
	@GetMapping(value = "/pet/lista")
	public String telaPet(Model model) {
		
		model.addAttribute("listaPet", obterPets());
		return "pet/lista";
	}
	
	@GetMapping(value = "/pet/{codigo}/excluir")
	public String exclusao(@PathVariable String codigo) {
		excluir(codigo);
		return "redirect:/pet/lista";
	}
}
