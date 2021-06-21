package esercizioFor;

import java.util.Scanner;

public class ForStart {

	public static void main(String[] args) {
		System.out.println("Dammi un intero");
		Scanner console = new Scanner(System.in);
		int p = console.nextInt();

		for (int i = p; i >= 0; i--) {
			System.out.println(i);
		}

		console.close();
	}

}
