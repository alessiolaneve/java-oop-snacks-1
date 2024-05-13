package it.snacks1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Inserisci il numero degli studenti da inserire nella lista.");
		int numStudenti = scan.nextInt();
		scan.nextLine();
		RegistroStudenti registroStudenti = new RegistroStudenti(numStudenti);
		System.out.println("La lista è composta da " + numStudenti + " studenti.");
		
		for (int i = 0; i < numStudenti; i++) {
			
			System.out.println(i);
			
			System.out.println("Inserisci il nome dello studente da aggiungere alla lista.");
			String studente = scan.nextLine();
			
			registroStudenti.aggiungiStudente(studente, i);
		}
		
		System.out.println("Registro Studenti");
		registroStudenti.getLista();
	}

}
