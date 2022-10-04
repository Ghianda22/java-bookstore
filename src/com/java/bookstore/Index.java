package com.java.bookstore;

public class Index {
	public static void main(String[] args) {
		String title = "Il titolo del libro";
		float price = 13.99f;
		boolean discount  = true;
		int discountPercentage = 15;
		float finalPrice = price - price*discountPercentage/100;
		
		System.out.println("Titolo: " + title);
		System.out.println("Prezzo: " + price);
		System.out.println("Sconto: " + discountPercentage + "%");
		System.out.println("Prezzo finale: " + finalPrice);
	}
}
