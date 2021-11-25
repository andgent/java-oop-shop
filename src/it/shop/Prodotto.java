package it.shop;

import java.util.Random;
import java.util.Scanner;


public class Prodotto {
	private String nome;
	private String descrizione;
	private int codice;
	private double prezzo;
	private double prezzoIva;
	
	
	public Prodotto(String nome, double prezzo, String descrizione) {
		this.codice = generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.prezzoIva = generaPrezzoIva();
		
		}


	public double generaPrezzoIva() {
		double prezzoIva = prezzo + ((prezzo*22)/100);
		return prezzoIva;
	}


	private int generaCodice(){
		Random random = new Random();
		return random.nextInt(1000);
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getCodice() {
		return codice;
	}
		public double getPrezzoIva() {
		return prezzoIva;
	}

	public void setPrezzoIva(double prezzoIva) {
		this.prezzoIva = prezzoIva;
	}
	public void stampaInfo() {
		System.out.println("Il prodotto " + "'" + nome + "' " + "ha ID = " + codice + ". Codice esteso:  " + nome + "-" + codice + "." + "\nIl costo ammonta a €" + prezzoIva + 
				"; Il prezzo non comprendente IVA è pari a €" + prezzo + "\nIl prodotto ha le seguenti caratteristiche: " + descrizione);
		
	}


	}

