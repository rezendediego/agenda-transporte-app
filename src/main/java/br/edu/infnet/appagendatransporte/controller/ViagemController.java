package br.edu.infnet.appagendatransporte.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appagendatransporte.model.negocio.Viagem;


@Controller
public class ViagemController {
	
	private Map<String,Viagem> mapaViagem = new HashMap<String,Viagem>(); 
	
	public Collection<Viagem> obterViagens(){
		return mapaViagem.values();
	}

	
	public void incluir(Viagem viagem){
		mapaViagem.put(viagem.getCodigo(), viagem);
		System.out.println(">>>: [Viagem] Inclusão realizada com sucesso: " + viagem);
	}
	
	public void excluir(String codigo){
		mapaViagem.remove(codigo);
	}
	
	@GetMapping(value = "/viagem/lista")
	public String telaViagem(Model model) {		
		model.addAttribute("listaViagem", obterViagens());
		return "viagem/lista";
	}
	
	@GetMapping(value = "/viagem/{codigo}/excluir")
	public String exclusao(@PathVariable String codigo) {
		excluir(codigo);
		return "redirect:/viagem/lista";
	}
}
