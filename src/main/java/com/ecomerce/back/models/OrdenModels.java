package com.ecomerce.back.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "order")
public class OrdenModels {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String number;
	private Date createDate;
	private Date receiveDate;
	
	private double total;
	
	public OrdenModels() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public OrdenModels(Integer id, String number, Date createDate, Date receiveDate, double total) {
		super();
		this.id = id;
		this.number = number;
		this.createDate = createDate;
		this.receiveDate = receiveDate;
		this.total = total;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}



	@Override
	public String toString() {
		return "OrdenModels [id=" + id + ", number=" + number + ", createDate=" + createDate + ", receiveDate="
				+ receiveDate + ", total=" + total + "]";
	}



}
