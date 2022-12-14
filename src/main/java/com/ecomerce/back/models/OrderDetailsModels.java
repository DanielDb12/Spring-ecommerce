package com.ecomerce.back.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "orderdetail")
public class OrderDetailsModels {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String name;
	private double amount;
	private double price;
	private double total;
	
	
	
	
	
	public OrderDetailsModels() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public OrderDetailsModels(Integer id, String name, double amount, double price, double total) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.total = total;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "OrderDetailsModels [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price
				+ ", total=" + total + "]";
	}

	
	

}
