package esercizioWhile;

import java.util.Scanner;

public class WhileStart {

	public static void main(String[] args) {
		System.out.println("Dammi una stringa");
		Scanner console = new Scanner(System.in);
		String p = console.nextLine();

		int i = 0;
		while (i < p.length() - 1) {
			System.out.print(p.charAt(i) + ",");
			i++;
		}
		System.out.print(p.charAt(i));

		console.close();
	}

}
