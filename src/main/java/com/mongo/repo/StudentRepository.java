package com.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.entity.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
