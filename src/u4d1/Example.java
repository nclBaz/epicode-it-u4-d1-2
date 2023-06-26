package u4d1;

import java.util.Scanner;

public class Example {
	
	public static void main(String[] args) {
//		System.out.println("HELLO WORLD");
//		System.out.println("------------------");
//		
//		boolean z = true;
//		System.out.println(z);
		
		// ----------------------------------------- NUMERI
		// --------------------------------------

//		final int intero = 2;
//		double decimali = 0.5;
////		float dec = 0.4f;
////		// anche i double rappresentano numeri decimali. Come regola generale però
////		// meglio usare sempre i double per questioni di velocità nei calcoli
//		char caratteri = 'a';
//		
//		decimali = intero;
//		System.out.println(decimali);
//		byte numeroPiccolo = (byte) 6000; // ES. casting esplicito...attenzione possibile perdita di dati!
//		System.out.println(numeroPiccolo);
		
		// ----------------------------------------- STRINGHE
		// --------------------------------------
		
//		String testo = "Ciao a tutti";
//		System.out.println(testo);
//		System.out.println("La lunghezza della stringa è: " + testo.length());
//		System.out.println("Il primo carattere della string è: " + testo.charAt(0));
//		System.out.println(testo.replaceAll("tutti", "nessuno"));
//
//		// *************************************** ARRAY
//		// **********************************************
//		String[] arrayDiStringhe = { "ciao", "a", "tutti" };
//
//		for (int i = 0; i < arrayDiStringhe.length; i++) {
//			System.out.println(arrayDiStringhe[i]);
//		}
//
//		int risultatoDellaSomma = sum(2, 3);
//		System.out.println(risultatoDellaSomma);

		// ********************** SCANNER ************************
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci il tuo nome");
		String name = input.nextLine();
		System.out.println("Hai inserito " + name);
		System.out.println("Dammi ora un numero intero");
		int addendo1 = input.nextInt();
		System.out.println("Dammi ora un secondo numero intero");
		int addendo2 = input.nextInt();

		System.out.println("La somma dei numeri inseriti è: " + sum(addendo1, addendo2));

		input.close(); // Non dimentichiamoci come BEST PRACTICE di chiudere sempre lo scanner quando
						// abbiamo finito

	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void printSum(int n1, int n2) {
		System.out.println("La somma è: " + sum(n1, n2));
	}
}
