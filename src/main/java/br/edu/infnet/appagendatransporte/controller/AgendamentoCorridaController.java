package br.edu.infnet.appagendatransporte.controller;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appagendatransporte.model.negocio.AgendamentoCorrida;


@Controller
public class AgendamentoCorridaController {
	
	private Map<LocalDateTime,AgendamentoCorrida> mapaAgendamentoCorrida = new HashMap<LocalDateTime,AgendamentoCorrida>(); 
	long counter = 0;
	
	
	public Collection<AgendamentoCorrida> obterAgendamentoCorrida(){
		return mapaAgendamentoCorrida.values();
	}

	
	public void incluir(AgendamentoCorrida agendamentoCorrida){
		mapaAgendamentoCorrida.put(LocalDateTime.now().plusSeconds(counter), agendamentoCorrida);
		counter++;
		System.out.println(">>>: [Agendamento Corrida] Inclusão realizada com sucesso: " + agendamentoCorrida);
	}
	
	public void excluir(LocalDateTime dataAgendamento){
		mapaAgendamentoCorrida.remove(dataAgendamento);
	}
	
	@GetMapping(value = "/agendamentocorrida/lista")
	public String telaDelivery(Model model) {
		
		model.addAttribute("listaAgendamentoCorrida", obterAgendamentoCorrida());
		return "agendamentocorrida/lista";
	}
	
	@GetMapping(value = "/agendamentocorrida/{codigo}/excluir")
	public String exclusao(@PathVariable LocalDateTime dataAgendamento) {
		excluir(dataAgendamento);
		return "redirect:/agendamentocorrida/lista";
	}
}
