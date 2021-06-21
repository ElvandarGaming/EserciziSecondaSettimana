package esercizioSwitch;

import java.util.Scanner;

public class SwitchStart {

	public static void main(String[] args) {
		System.out.println("Dammi un intero");
		Scanner console = new Scanner(System.in);
		int p = console.nextInt();

		switch (p) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Due");
			break;
		case 3:
			System.out.println("Tre");
			break;
		default:
			System.out.println("Numero non consentito");

		}
		console.close();
	}

}
