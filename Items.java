package com.retail;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {
	 static ArrayList<Book> books=new ArrayList<Book>();
	 static ArrayList<Cosmatic> cosmatics=new ArrayList<Cosmatic>();
	 static ArrayList<CD> cds=new ArrayList<CD>();
	 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Items item = new Items();
	    int itemID;
	    String imported;
	    double itemPrice;
	    String itemDescription;
	    int itemQuantity;
	    int ch = 'Y';


	    do {
	        System.out.println("Menu:");
	        System.out.println("0) Exit " + "\n"
	                + "1) Add 'Book' in shopping cart" + "\n"
	                + "2) Add 'Cosmatic' in shopping cart"+"\n"
	                +"3) Add 'CD' in shopping car");
	        ch = sc.nextInt();

	        switch (ch) {
	        case 0:
	            System.out.println("\n" + "Good bye!");
	            break;

	        case 1:
	            System.out.println("Enter Book ID: ");
	            itemID = sc.nextInt();

	            System.out.println("Enter Book price: ");
	            itemPrice = sc.nextDouble();
	            
	            System.out.println("How many: ");
	            itemQuantity = sc.nextInt();

	            System.out.println("Enter short description of book: ");
	            itemDescription = sc.next();          
	            
	            Book book=new Book(itemID,itemPrice,itemQuantity,itemDescription);
	            books.add(book);
	            
	            break;

	        case 2:
	        	System.out.println("Enter cosmatic ID: ");
	            itemID = sc.nextInt();

	            System.out.println("Enter cosmatic price: ");
	            itemPrice = sc.nextDouble();
	            
	            System.out.println("How many you want to by: ");
	            itemQuantity = sc.nextInt();

	            System.out.println("Enter short description of item: ");
	            itemDescription = sc.next();
	            
	            Cosmatic cosmatic=new Cosmatic(itemID, itemPrice, itemQuantity, itemDescription);
	            cosmatics.add(cosmatic);

	            break;
	        case 3: 
	        	
	        	System.out.println("Enter CD ID: ");
	            itemID = sc.nextInt();

	            System.out.println("Enter CD price: ");
	            itemPrice = sc.nextDouble();
	            
	            System.out.println("How many you want to by:");
	            itemQuantity = sc.nextInt();

	            System.out.println("Enter short description of CD: ");
	            itemDescription = sc.next();
	            
	        	System.out.println("Is CD imported ? Y/N");
	        	imported=sc.next();        	
	        	
	        	if(imported.equals("y")||imported.equals("Y")) {
	        		CD cd=new CD(itemID, itemPrice, itemQuantity, itemDescription, true);
	        		cds.add(cd);    		
	        	}else {
	        		CD cd=new CD(itemID, itemPrice, itemQuantity, itemDescription, false);
	        		cds.add(cd);
	        	}
	        		
	        }
			
		} while (ch!=0);
	    item.display();
	    
	    
	}
	
	public void display() {
		
		System.out.println("The Shping Details ...................");
		System.out.println("total Amount of Books "+getTotalBookAmount());
		System.out.println("total Amount of Cosmatics "+getTotalCosmaticAmount());
		System.out.println("total Amount of CD "+getTotalCDAmount());
		System.out.println("Grand total Amount of All product "+totalOfAllGoods());
		
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


}
