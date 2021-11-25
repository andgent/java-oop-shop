package it.shop;

public class Main {

	public static void main(String[] args) {

		
		Prodotto prodotto1 = new Prodotto ("iPhone", 499, "Telefono Apple");
		
		prodotto1.stampaInfo();
		
		Prodotto prodotto2 = new Prodotto ("Galaxy S49", 349, "Telefono Samsung");
		
		prodotto2.stampaInfo();
		
		Prodotto prodotto3 = new Prodotto ("Xperia X10", 299, "Telefono Sony");
		
		prodotto3.stampaInfo();
	}
}
