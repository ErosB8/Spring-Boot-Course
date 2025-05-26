package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Empleados;


@RestController
@RequestMapping("/api")

public class EjemploRestController {
	
	@GetMapping(path = "/detalles_info2")
	
	
	public Map<String, Object> detalles_info2() {
		
		Empleados empleado1 = new Empleados("Eros", "Bianchini", "Riccio 142", "QA Analist", 24, 37835647, 001);
		
		Map<String, Object> respuesta = new HashMap<>();
		respuesta.put("Empleado", "Información del empleado");
		respuesta.put("Datos_Empleado", empleado1);
		

		return respuesta; 
		
	}
	
}
