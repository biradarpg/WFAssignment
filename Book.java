package com.retail;

public class Book  {
	int id;
	double price;
	int quantity;
	String itemDescription;
	
	private boolean isTaxed = false;
    private boolean isImported = false;
	
	public Book(int id,double price,int quantity,String itemDescription ){
		this.id=id;
		this.price=price;
		this.quantity=quantity;
		this.itemDescription=itemDescription;
	}
	
	TaxCalculator taxCal=new TaxCalculator();
	
	public double getTotalPrice() {
		double tax=taxCal.getCalculatedTax(isTaxed, isImported, price);
		
		return (price+tax)*quantity ;
	}
	
	 public boolean isTaxed(){
		 return isTaxed;
	 }
	public boolean isImported() {
		return isImported;
	}
	
	
	

}
