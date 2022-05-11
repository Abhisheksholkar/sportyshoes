package com.tek.sportyshoes.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
	
	@Id
	private  Integer productid;
	
	private  Integer price;
	
	private String category;
	
	private  Integer size;
	public Product()
	{
		
	}

	public Product(Integer productid) {
		super();
		this.productid = productid;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productid + ", price=" + price + ", category=" + category + ", size=" + size
				+ "]";
	}

	
	

}
