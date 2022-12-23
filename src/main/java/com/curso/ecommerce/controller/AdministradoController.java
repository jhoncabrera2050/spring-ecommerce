package com.curso.ecommerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// lo que esta haciendo es mapear
@RequestMapping("/administrador")

public class AdministradoController {
	// se usa eso para redireccionar  hacia la home
	@GetMapping("")
	public String home() {
		return "administrador/home";
	}
}
