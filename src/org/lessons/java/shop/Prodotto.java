/*V creare la classe Prodotto che gestisce i prodotti dello shop.
*V Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva
*V Usate opportunamente i livelli di accesso (public, private), i costruttori,
*Vi metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
*V- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
*V- il codice prodotto sia accessibile solo in lettura
*V- gli altri attributi siano accessibili sia in lettura che in scrittura
*V- il prodotto esponga un metodo per avere il prezzo base
*V- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
*V- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
*VNello stesso package aggiungete una classe Main con metodo main nella quale testate tutte
*Vle funzionalità della classe Prodotto.
*BONUS: create un metodo (statico) che restituisca il codice con un pad left
*di 0 per arrivare a 8 caratteri
*(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
 */
package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private final int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;
	
	public Prodotto(String nome, String descrizione, double prezzo, double iva) {
		this.codice = generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	//metodo per generare codice random
	private int generaCodice() {
		Random random = new Random();
		int codiceGenerato = random.nextInt(100000000);
		System.out.println("Codice generato: " + codiceGenerato);
	    return codiceGenerato;
		}
	
	public int getCodice() {
		return codice;
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
	
	public double getIva() {
		return iva;
	}
	
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public double getPrezzoBase() {
	        return prezzo;
	}
	
	public double getPrezzoIva() {
        return prezzo + (prezzo * iva / 100);
    }
	
	 // Metodo per ottenere il nome esteso
    public String getNomeEsteso() {
        return String.format("%08d-%s", codice, nome);
    }
    /*sono due parametri divisi dal trattino.
    *Il primo è un intero di 8 cifre, il secondo una stringa.
	*/
    
    public static String padLeftCodice(int codice) {
        return String.format("%08d", codice);
    } //metodo STATICO per la formattazione del codice
}
