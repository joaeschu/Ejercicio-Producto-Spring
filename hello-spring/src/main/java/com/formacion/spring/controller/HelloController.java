package com.formacion.spring.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacion.spring.model.Person;

@RestController
public class HelloController {
	/*
	@Autowired
	private Person person;
	*/
	
	//metodo http de tipo get
	@GetMapping("hello")
	public String hello() {
		return "hola mundo spring rest";
	}
	
	@GetMapping("personas")
	public ArrayList<Person> index() {
		/*
		Person objPersona1 = new Person("Rolando","Lopez","rlopez@email.com",654578);
		Person objPersona2 = new Person("Maria","Gomez","mgomez@email.com",654578);
		Person objPersona3 = new Person("Juan","Romero","jr@email.com",654578);
		Person objPersona4 = new Person("Luis","Perez","lp@email.com",654578);
		ArrayList<Person> personas = new ArrayList<>();
		
		personas.add(objPersona1);
		personas.add(objPersona2);
		personas.add(objPersona3);
		personas.add(objPersona4);
		*/
		/*
		 * ejemplo de inyeccion
		 
		ArrayList<Person> personas = new ArrayList<>();
		person.setNombre("juan");
		person.setApellido("Gomez");
		person.setEmail("jgomez@emal.com");
		person.setTelefono(654545);
		
		
		personas.add(person);
		
		person.setNombre("Pepe");
		person.setApellido("Ojeda");
		person.setEmail("jgomez@emal.com");
		person.setTelefono(654545);
		
		personas.add(person);*/
		ArrayList<Person> personas = new ArrayList<>();
		return personas;
	}
}
