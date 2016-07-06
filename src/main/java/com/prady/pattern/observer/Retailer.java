package com.prady.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Retailer implements Observer{
	
	List<Product> productList = new ArrayList<>();

	@Override
	public void update(Observable o, Object arg) {
		Product product = (Product) arg;
		productList.add(product);
		System.out.println("Retailer product list : "+productList);
	}

}
