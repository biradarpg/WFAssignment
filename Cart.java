package com.retail;

import java.util.ArrayList;

public class Cart {
	
	ArrayList<Book> books=new ArrayList<Book>();
	ArrayList<Cosmatic> cosmatics=new ArrayList<Cosmatic>();
	ArrayList<CD> cds=new ArrayList<CD>();
	
	public void add(Book b) {
		books.add(b);
		
	}
	
	public void add(Cosmatic cos) {
		cosmatics.add(cos);
		
	}
	
	public void add(CD cd) {
		cds.add(cd);
		
	}
	
	public double getTotalBookAmount() {
		double amount=0.0;
		for (Book book : books) {
			amount+=book.getTotalPrice();				
		}
		return amount;
	}
	
	public double getTotalCosmaticAmount() {
		double amount=0.0;
		for (Cosmatic cosmatics : cosmatics) {
			amount=cosmatics.getTotalPrice();
		}
		return amount;
	}
	
	public double getTotalCDAmount() {
		double amount=0.0;
		for (CD cd : cds) {
			amount=cd.getTotalPrice();
		}
		return amount;
	}
	public double totalOfAllGoods() {
		
								
		double grandTotal =getTotalBookAmount()+getTotalCosmaticAmount()+getTotalCDAmount();
		return grandTotal;
	}
public void display() {
		
		System.out.println("The Shping Details ...................");
		System.out.println("total Amount of Books "+getTotalBookAmount());
		System.out.println("total Amount of Cosmatics "+getTotalCosmaticAmount());
		System.out.println("total Amount of CD "+getTotalCDAmount());
		System.out.println("Grand total Amount of All product "+totalOfAllGoods());
		
	}

}
