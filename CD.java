package com.retail;

public class CD  {
	
	int id;
	double price;
	int quantity;
	String itemDescription;
	
	private boolean isTaxed = true;
    private boolean isImported;
    
    public CD(int id,double price,int quantity,String itemDescription, boolean isImported){
		this.id=id;
		this.price=price;
		this.quantity=quantity;
		this.itemDescription=itemDescription;
		this.isImported=isImported;
	}
    
TaxCalculator taxCal=new TaxCalculator();
	
	public double getTotalPrice() {
		double tax=taxCal.getCalculatedTax(isTaxed, isImported, price);
		
		return (price+tax)*quantity ;
	}
	

}
