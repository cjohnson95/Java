package com.maxtrain.tutorial;								//package is like name space in  C#

import com.maxtrain.tutorial.models.Customer;         //like a using name in C#, but points to the class in Java
														//import com.maxtrain.tutorial.models.*;
import com.maxtrain.tutorial.models.PrimeCustomer;

//System.out.println("Customer:  "+ id + " | "+ name + " | " + sales"); this is just putting the variables w/o getters/ setters

public class HellWorldJava {

	public static void main(String[] args) {
		
		var primeCustomer2 = new PrimeCustomer("ABC", 1000);
		var primeCustomer = new PrimeCustomer("MAX");				//these are properties with added attributes
															
		
	
		var customer = new Customer();						
		customer.setName("Fred Inc.");
		customer.setSales(1000);           //adding 1000 dollars worth of sales
		
		customer.setSales(customer.getSales() + 1000); // this is adding 1000 dollars worth of sales
		
		var message = String.format("Customer: %d | %s | %f ", 
										customer.getId(),
										customer.getName(),
										customer.getSales());
		System.out.println(message);							//*similar to console write line in C# (System.out.println)
	}

}
