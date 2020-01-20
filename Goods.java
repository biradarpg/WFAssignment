package com.retail;

public abstract class Goods {
	
	int id;
	double price;
	int quantity;
	String itemDescription;
	
	public Goods(int id,double price,int quantity,String itemDescription ){
		this.id=id;
		this.price=price;
		this.quantity=quantity;
		this.itemDescription=itemDescription;
	}
	
	protected abstract boolean isTaxed(); // abstract method

    protected abstract boolean isImported();

}
