package com.prady.pattern.observer;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class ObserverPattern 
{
    public static void main( String[] args )
    {
        
    	Manufacturer manufacturer = new Manufacturer();
    	Distributer distributer = new Distributer();
    	WholeSaler wholeSaler = new WholeSaler();
    	Retailer retailer = new Retailer();
    	
    	manufacturer.addObserver(distributer);
    	manufacturer.addObserver(wholeSaler);
    	manufacturer.addObserver(retailer);
    	System.out.println("adding product : ");
    	Product product1 = new Product(1,"product1", new BigDecimal(100));
    	manufacturer.addProdcut(product1);
    	Product product2 = new Product(2,"product2", new BigDecimal(200));
    	manufacturer.addProdcut(product2);
    	Product product3 = new Product(3,"product3", new BigDecimal(300));
    	manufacturer.addProdcut(product3);
    	
    }
}
