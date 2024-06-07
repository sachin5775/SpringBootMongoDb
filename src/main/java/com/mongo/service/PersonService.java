package com.mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongo.entity.Person;
import com.mongo.repo.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	public Person getPersonById(Integer id) {
		return personRepository.findById(id).orElse(null);
	}

	public Person addPerson(Person person) {
		return personRepository.save(person);
	}

	public Person updatePerson(Integer id, Person person) {
		if (personRepository.existsById(id)) {
			person.setId(id);
			return personRepository.save(person);
		}
		return null;
	}

	public void deletePerson(Integer id) {
		personRepository.deleteById(id);
	}
}
