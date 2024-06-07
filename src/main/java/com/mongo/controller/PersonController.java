package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.entity.Person;
import com.mongo.service.PersonService;
@RequestMapping("/persons")
@RestController
public class PersonController {

	private PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}

	@GetMapping("/{id}")
	public Person getPersonById(@PathVariable Integer id) {
		return personService.getPersonById(id);
	}

	@PostMapping
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}

	@PutMapping("/{id}")
	public Person updatePerson(@PathVariable Integer id, @RequestBody Person person) {
		return personService.updatePerson(id, person);
	}

	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable Integer id) {
		personService.deletePerson(id);
	}
}