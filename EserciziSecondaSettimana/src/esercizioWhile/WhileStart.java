package esercizioWhile;

import java.util.Scanner;

public class WhileStart {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		String stringa = null;//
		do {
		System.out.println("Dammi una stringa");
		stringa = console.nextLine();
		int i = 0;
		while (i < stringa.length() - 1) {
			
			System.out.print(stringa.charAt(i) + ",");
			i++;
		}
		System.out.print(stringa.charAt(i));
		System.out.println();
		}
		while(!stringa.equals(":q"));
		
		
		console.close();
	}

}
