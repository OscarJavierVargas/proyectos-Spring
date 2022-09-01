package com.example.primerservicio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.primerservicio.dto.JugadorDto;
import com.example.primerservicio.dto.Persona;



@RequestMapping (value="/jugador")

public class JugadorRestController {
	
	@Autowired
	@GetMapping (value="/peticion/{cod}/{nombre}/{edad}/{num1}")
	ResponseEntity<?> getJugador(@PathVariable int cod, @PathVariable String nombre,
		                       	@PathVariable int edad,	@PathVariable int num1){
		
		
		JugadorDto valores= new JugadorDto();
		
		valores.setCod(cod);
		valores.setNombre(nombre);
		valores.setEdad(edad);
		valores.setNum1(num1);
		
		List<JugadorDto> listaJ = new ArrayList<JugadorDto>();			
		
	
		
		
		return ResponseEntity.ok(listaJ) ;
		
		
		
	

	
}
}