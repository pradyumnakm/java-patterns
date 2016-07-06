package com.prady.pattern.observer;

import java.math.BigDecimal;

public class Product {
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int prouctId, String productName, BigDecimal price){
		
		this.prouctId = prouctId;
		this.productName=productName;
		this.price = price;
	}
	
	private int prouctId;
	
	private String productName ;
	
	private BigDecimal price;
	
	

	public int getProuctId() {
		return prouctId;
	}

	public void setProuctId(int prouctId) {
		this.prouctId = prouctId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prouctId=" + prouctId + ", productName=" + productName + ", price=" + price + "]";
	}

}
