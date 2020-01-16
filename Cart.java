package com.retail;

import java.util.Scanner;

public class Cart {

	private int itemCount;
	private double totalPrice;
	private static int capacity;
	private static Item[] cart = new Item[capacity];

	public Cart() {
		itemCount = 10;
		totalPrice = 0.0;
		capacity = 0;
	}

	public void add(int itemID, String itemName, double itemPrice, String itemDescription, int itemQuantity,
			double itemTax) {
		Item item = new Item(itemID, itemName, itemPrice, itemDescription, itemQuantity, itemTax);
		totalPrice += (itemPrice * itemQuantity);
		cart[itemCount] = item;
		itemCount += 1;
		if (itemCount == capacity) {
			increaseSize();
		}
	}

	public static void remove(String itemName) {
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < cart.length; i++) {
			Item remove = (Item) cart.get(i);
			if (itemName.equals(remove.getName())) {
				cart.remove(i);

			}
		}
		System.out.println("\n" + "Item " + itemName + " wasn't found.");
	}

	private void increaseSize() {
		Item[] item = new Item[capacity + 5];
		for (int i = 0; i < capacity; i++) {
			item[i] = cart[i];
		}
		cart = item;
		item = null;
		capacity = cart.length;
	}

	public static void prLine(int itemID, String itemName, int itemQuantity, double itemPrice, double total,
			double itemTax) {
		System.out.printf("\n%-10.10d %30s %10.2f %10d %10.2f", itemID, itemName, itemPrice, itemQuantity, itemTax,
				total);
	}

	public static void prTitles() {
		System.out.printf("\n%-10s 30% %10s %10s %10s %10s", "ID", "Item", "Price", "Quantity", "Tax", "Total");
	}

}
