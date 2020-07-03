package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

	List<Contact> findByNameIgnoreCase(String name);
	
	List<Contact> findByEmailIgnoreCase(String email);
}
