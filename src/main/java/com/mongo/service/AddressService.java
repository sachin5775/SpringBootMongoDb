package com.mongo.service;

import org.springframework.stereotype.Service;

import com.mongo.entity.Address;
import com.mongo.repo.AddressRepository;

@Service
public class AddressService {
	AddressRepository addressRepository;

	public AddressService(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	public Address addAddresss(Address address) {
		return addressRepository.insert(address);

	}
}
