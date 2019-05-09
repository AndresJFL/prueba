package com.sp.formulario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlador {
	@GetMapping("/")
	public String index() {
		return("index");
	}
	@GetMapping("/login")
	public String login() {
		return ("login");
	}
	
	@PostMapping("/login")
	public String loginForm(Model modelo ,User usuario) {
		String resultado="";
		if(usuario.getUser().isEmpty() || usuario.getPass().isEmpty()) {
			resultado="Los dos campos tienen que estar rellenos";
		}else {
			resultado="Correcto";
		}
		modelo.addAttribute("resultado",resultado);
		return ("menu");
	}
	
}
