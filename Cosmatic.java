package com.retail;

public class Cosmatic {
	int id;
	double price;
	int quantity;
	double tax;
	String itemDescription;
	
	private boolean isTaxed = true;
    private boolean isImported = false;
	
    public Cosmatic(int id,double price,int quantity,String itemDescription ){
		this.id=id;
		this.price=price;
		this.quantity=quantity;
		this.itemDescription=itemDescription;
	}	
}
