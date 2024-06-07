package com.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;
import com.mongo.entity.Student;
import com.mongo.repo.StudentRepository;

@Service
public class StudentService {
	StudentRepository studentRepository;
	AddressService addressService;

	public StudentService(StudentRepository studentRepository, AddressService addressService) {
		super();
		this.studentRepository = studentRepository;
		this.addressService = addressService;
	}

	
	public List<Student> getall() {
		return studentRepository.findAll();
	}
	
	public Student addStudent(Student student) {
		if(student.getAddress()!=null && student.getAddress().getId()!=null ) {
			addressService.addAddresss(student.getAddress());
		}
		return studentRepository.insert(student);

	}
}
