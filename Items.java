package com.retail;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<Item> cart = new ArrayList<Item>();

	    Item item;
	    int itemID;
	    String itemName;
	    double itemPrice;
	    String itemDescription;
	    int itemQuantity;
	    double itemTax;
	    int ch;
	    String choice;

	    Cart shoppingCart = new Cart();

	    while (true) {
	        System.out.println("Menu:");
	        System.out.println("0) Exit " + "\n"
	                + "1) Add 'Book' in shopping cart" + "\n"
	                + "2) Add 'Cosmatic' in shopping cart"+"\n"
	                +"3) Add 'CD' in shopping car");
	        ch = sc.nextInt();

	        switch (ch) {
	        case 0:
	            System.out.println("\n" + "Good bye!");
	            System.exit(0);

	        case 1:
	            System.out.println("Enter item ID: ");
	            itemID = sc.nextInt();

	            System.out.println("Enter item price: ");
	            itemPrice = sc.nextDouble();
	            
	            System.out.println("Enter quantity: ");
	            itemQuantity = sc.nextInt();

	            System.out.println("Enter short description of item: ");
	            itemDescription = sc.next();          
	            
	            Book book=new Book(itemID,itemPrice,itemQuantity,itemDescription);
	            
	            shoppingCart.add(itemID, itemName, itemPrice, itemDescription, itemQuantity,itemTax);

	            break;

	        case 2:
	            System.out.println("Enter name of the item that you would like to remove: ");
	            choice = sc.next();
	            shoppingCart.remove(choice);

	            break;
	        }

	    }
	}


}
