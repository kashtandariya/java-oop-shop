package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

    	Prodotto prodotto = new Prodotto("iPhone 15 Pro", "telefono apple", 1500.00, 22.00);
        
        System.out.println("Codice Prodotto: " + prodotto.getCodice());
        System.out.println("Nome Prodotto: " + prodotto.getNome());
        System.out.println("Descrizione Prodotto: " + prodotto.getDescrizione());
        System.out.println("Prezzo Base: " + prodotto.getPrezzoBase());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoIva());
    }
}
