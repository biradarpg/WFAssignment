package com.retail;

import java.util.Scanner;

public class Items {
	
	public static void main(String[] args) {
		
		int itemID;
		String imported;
		double itemPrice;
		String itemDescription;
		int itemQuantity;
		String ch = "Y";

		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();

		do {
			System.out.println("Menu:");
			System.out.println("0) Exit " + "\n" + "1) Add 'Book' in shopping cart" + "\n"
					+ "2) Add 'Cosmatic' in shopping cart" + "\n" + "3) Add 'CD' in shopping car");
			ch = sc.next();

			switch (ch) {
			case "0":
				System.out.println("\n" + "Good bye!");
				break;

			case "1":
				System.out.println("Enter Book ID: ");
				itemID = sc.nextInt();

				System.out.println("Enter Book price: ");
				itemPrice = sc.nextDouble();

				System.out.println("How many: ");
				itemQuantity = sc.nextInt();

				System.out.println("Enter short description of book: ");
				itemDescription = sc.next();

				Book book = new Book(itemID, itemPrice, itemQuantity, itemDescription);
				cart.add(book);

				break;

			case "2":
				System.out.println("Enter cosmatic ID: ");
				itemID = sc.nextInt();

				System.out.println("Enter cosmatic price: ");
				itemPrice = sc.nextDouble();

				System.out.println("How many you want to by: ");
				itemQuantity = sc.nextInt();

				System.out.println("Enter short description of item: ");
				itemDescription = sc.next();

				Cosmatic cosmatic = new Cosmatic(itemID, itemPrice, itemQuantity, itemDescription);
				cart.add(cosmatic);

				break;
			case "3":

				System.out.println("Enter CD ID: ");
				itemID = sc.nextInt();

				System.out.println("Enter CD price: ");
				itemPrice = sc.nextDouble();

				System.out.println("How many you want to by:");
				itemQuantity = sc.nextInt();

				System.out.println("Enter short description of CD: ");
				itemDescription = sc.next();

				System.out.println("Is CD imported ? Y/N");
				imported = sc.next();

				if (imported.equals("y") || imported.equals("Y")) {
					CD cd = new CD(itemID, itemPrice, itemQuantity, itemDescription, true);
					cart.add(cd);
					
				} else {
					CD cd = new CD(itemID, itemPrice, itemQuantity, itemDescription, false);
					cart.add(cd);
					
				}

			default:
				System.out.println("Enter the valid option");
				break;

			}

		} while (!ch.equals("0"));

		cart.display();

	}

}
