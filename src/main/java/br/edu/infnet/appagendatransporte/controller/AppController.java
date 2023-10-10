package br.edu.infnet.appagendatransporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.appagendatransporte.model.app.Projeto;

import javax.servlet.http.HttpSession;



@Controller
public class AppController {
	
	private Projeto projeto;
	
	public void incluir(Projeto projeto) {
		this.projeto = projeto;
		
	}	
	
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping(value = "/")
	public String telaHome() {
		return "home";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@GetMapping(value = "/logout")
	public String telaLogout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("usuariodisplay");
		return "redirect:/";
	}
	
	@GetMapping(value = "/sobre")
	public String telaSobre(Model model) {
		model.addAttribute("projeto",projeto);
		return "sobre";
	}


	
}
