package com.example.demo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Empleados;


@Controller
public class EjemploController {
	
	@GetMapping("/detalles_info")
	
	
	public String info(Model model) {
		
		Empleados empleado1 = new Empleados("Eros", "Bianchini", "Riccio 142", "QA Analist", 24, 37835647, 001);
		model.addAttribute("Empleado", empleado1);
		
		return "detalles_info"; 
		
	}
	
}
