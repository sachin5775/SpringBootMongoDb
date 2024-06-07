package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.entity.Student;
import com.mongo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService studentService;
	

	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		Student save = studentService.addStudent(student);
		return ResponseEntity.ok(save);
	}

	@GetMapping("/")
	public ResponseEntity<?> getStudents() {
		List<Student> findAll = studentService.getall();
		return ResponseEntity.ok(findAll);
	}
}
