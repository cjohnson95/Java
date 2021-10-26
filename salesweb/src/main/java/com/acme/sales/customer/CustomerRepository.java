package com.acme.sales.customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	Optional<Customer> findByCodeAndName(String code, String name); 		//this method now gets passed into my controller, don't have to
																			// do anything extra for this result in our controllers.
																			//this kind of method typically written into the repo.
																			//this methods returns data by the name and Id
}
