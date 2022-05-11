package com.tek.sportyshoes.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reports {

	
	private String date;
	
	private String category;
	
	private Integer amount;
	
	private  String name;
	
	private Integer quantity;
	@Id
	private Integer productid;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	@Override
	public String toString() {
		return "Reports [date=" + date + ", category=" + category + ", amount=" + amount + ", name=" + name
				+ ", quantity=" + quantity + ", productid=" + productid + "]";
	}
	
}
