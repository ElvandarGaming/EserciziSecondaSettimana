package esercizioIfElseIf;

import java.util.Scanner;

public class IfElseIfStart {

	public static void main(String[] args) {

		System.out.println("Dammi una stringa");
		Scanner console = new Scanner(System.in);
		String p = console.nextLine();
		System.out.println("La stringa " + p + " è pari? " + stringaPariDispari(p));

		System.out.println("Dammi una anno");
		int anno = console.nextInt();
		System.out.println("L'anno " + anno + " è bisestile? " + annoBisestile(anno));

		console.close();
	}

	public static boolean stringaPariDispari(String stringa) {
		if (stringa.length() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean annoBisestile(int year) {
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
			return true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

}
