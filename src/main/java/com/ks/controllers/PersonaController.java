package com.ks.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ks.modelo.entities.Persona;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@RequestMapping(path = "",method = RequestMethod.GET)
	public List<Persona> getPersonas(){
		final Persona persona1=new Persona();
		persona1.setId(101L);
		persona1.setNombre("Jon Ander");
		persona1.setApellido1("Aguinaco");
		final Persona persona2=new Persona();
		persona2.setId(101L);
		persona2.setNombre("Miranda Amaia");
		persona2.setApellido1("Aguinaco Meléndez");
		
		final List<Persona> personas=new ArrayList<Persona>();
		personas.add(persona1);
		personas.add(persona2);
		return personas;
	}
}
