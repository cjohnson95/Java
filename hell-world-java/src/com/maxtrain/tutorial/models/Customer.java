package com.maxtrain.tutorial.models;

public class Customer {
	
	private int id = 0;						//property. The name typically starts with lowercase letters (id). Because private,
	private String name = "fred";					//not anyone can just change data. To make it readable, create method (public int getId())				
	private double sales;  					//return id is the body of the method.
	
	
	public void Print() throws Exception {		// this method throws an exception and you have to declare it in the method
												//to do so.
		
		var trueOrfalse = true;
		if(!trueOrfalse) {
			throw new Exception();
		}
	}
	
	public void Debug() {
		try {
			Print();
		} catch (Exception ex) {}
		
	}
			
		
		
		
		public Customer(String name) {
			this.setName(name);
		}
		
		public Customer(String name, double sales) {          //constructor for a customer
			this(name);											//because we already have the cust. above this.setName(name), we don't have to repeat params  
			this.setSales(sales);								//for other constructors with the same property. That's why line 34 is this(name);
		}
	
	public int getId() {				
		return id;						 
	}
	
	private void setId(int id) {         //setter of the code. Above is the getter.
		this.id = id;
	}

	public String getName() {				//lines 15-20 are generated getters and setters, accessed by right clicking on a 
		return name;						//an open space in the text editor or line, going to source>generate getters/setters
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		if(sales < 0) {
			//do something here and return
		}
		this.sales = sales;
	}
	
	public Customer() {							//this is a constructor
		this.id = 1;
	}
}
