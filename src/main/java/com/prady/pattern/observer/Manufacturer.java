package com.prady.pattern.observer;

import java.util.Observable;

public class Manufacturer extends Observable {
	
	
	public void addProdcut(Product product){
		
		setChanged();
		
		notifyObservers(product);
		
	}

}
