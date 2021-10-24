package com.acme.sales.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	Customer findByCode(String Code); 				//this method now gets passed into my controller, don't have to
													// do anything extra for this result in our controllers.
													//this kind of method typically written into the repo.
}
