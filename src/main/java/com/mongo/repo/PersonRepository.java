package com.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.entity.Person;

public interface PersonRepository extends MongoRepository<Person, Integer>  {

}
