package com.acme.sales.customer;    //this whole code is basically the equivalent of a model in C#

//import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name="customers")             //Entity is a class, so when you import them, you need to have the correct 
@Table(uniqueConstraints=@UniqueConstraint(name="UIDX_code", columnNames={"code"})) //UDIX is abbr. for unique index
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=30, nullable=false)
	private String code;
	
	@Column(length=30, nullable=false)
	private String name;
	
	private double sales;
	
	public Customer() {}    					//Best practice to manually add a default constructor
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}

}
