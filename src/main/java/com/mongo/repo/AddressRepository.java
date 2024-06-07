package com.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.entity.Address;

public interface AddressRepository extends MongoRepository<Address, Integer>{

}
