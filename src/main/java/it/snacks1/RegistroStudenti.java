package it.snacks1;


public class RegistroStudenti {

	// Crea una classe RegistroStudenti che rappresenti un registro di studenti.
	private String[] studenti;
	private int numStudenti;

	public int getNumStudenti() {
		return numStudenti;
	}

	public void setNumStudenti(int numStudenti) {
		this.numStudenti = numStudenti;
	}

	// Implementa un costruttore senza parametri per inizializzare il registro vuoto
	public RegistroStudenti(int numStudenti) {
		this.studenti = new String[numStudenti];
	}

	public void aggiungiStudente(String studente, int index) {
		studenti[index] = studente;
	}
	
	public void getLista() {
		for (int i = 0; i < studenti.length; i++) {
			System.out.println(studenti[i]);
		}
	}
}

// un metodo pubblico per aggiungere studenti al registro.
// Aggiungi un metodo che stampi la lista degli studenti.