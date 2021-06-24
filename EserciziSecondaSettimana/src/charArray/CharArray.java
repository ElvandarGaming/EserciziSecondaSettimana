package charArray;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
		int[] array = { 4, 4, 8, 5, 6, 7, 8, 7, 1, 4, 8, 1, 4, 6, 7, 6, 5, 4, 1, 5, 1 };
		System.out.println(findMode(array));
		char[] a = {'d', 'd', 'f','f', 'g', 'g' , 'g'};
		findMaxChar(a);
		
		findMaxNum(array);
		findMinNum(array);
		
		//simple find mode non è simple, e sputtana l'array, ma fa il suo lavoro
		System.out.println(simpleFindMode(array));
		System.out.println(Arrays.toString(array));
		System.out.println('r');
	}
	//mio
	public static int findMaxNum(int[] a) {
		// trova il numero ripetuto piu volte, se ci sono due numeri che compaiono lo
		// stesso numero di volte mostra solo il primo a comparire la prima volta nell'array
		ContaInt[] x = contaInt(a);
		
		int max = x[0].qta;
		int num = x[0].numero;
		for (int i = 1; i < x.length; i++) {

			if (x[i] == null) {
				continue;
			} else if (max < x[i].qta) {

				max = x[i].qta;
				num = x[i].numero;
			}
		}
		System.out.println("numero ripetizioni " + max + " per il numero " + num);
		return num;
	}
	public static int findMaxChar(char[] a) {
		// trova il numero ripetuto piu volte, se ci sono due numeri che compaiono lo
		// stesso numero di volte mostra solo il primo a comparire la prima volta nell'array
		ContaChar[] x = contaChar(a);
		
		int max = x[0].qta;
		char num = x[0].numero;
		for (int i = 1; i < x.length; i++) {

			if (x[i] == null) {
				continue;
			} else if (max < x[i].qta) {

				max = x[i].qta;
				num = x[i].numero;
			}
		}
		System.out.println("numero ripetizioni " + max + " per il carattere " + num);
		return num;
	}
	
	//mio
	public static int findMinNum(int[] a) {
		// trova il numero ripetuto meno volte, se ci sono due numeri che compaiono lo
		// stesso numero di volte mostra solo il primo a comparire la prima volta nell'array
		ContaInt[] x = contaInt(a);
		
		int min = x[0].qta;
		int num = x[0].numero;
		for (int i = 1; i < x.length; i++) {

			if (x[i] == null) {
				continue;
			} else if (min >= x[i].qta) {
				min = x[i].qta;
				num = x[i].numero;
			}
		}
		System.out.println("numero ripetizioni " + min + " per il numero " + num);
		return num;
	}
	//mio
	private static ContaInt[] contaInt(int[] a) {
		ContaInt[] h = new ContaInt[a.length];
		// creazione array di oggetti conta int

		for (int i = 0; i < a.length; i++) {
			for (int t = 0; t < h.length; t++) {
				if (h[t] == null) {
					h[t] = new ContaInt(a[i]);
					break;
				} else if (h[t].numero == a[i]) {
					h[t].qta++;
					break;
				}

			}

		}
		return h;
	}

	private static ContaChar[] contaChar(char[] a) {
		ContaChar[] h = new ContaChar[a.length];
		// creazione array di oggetti conta int

		for (int i = 0; i < a.length; i++) {
			for (int t = 0; t < h.length; t++) {
				if (h[t] == null) {
					h[t] = new ContaChar(a[i]);
					break;
				} else if (h[t].numero == a[i]) {
					h[t].qta++;
					break;
				}

			}

		}
		return h;
	}
	
	//prof
	public static int findMode(int[] input) {
		ContaInt[] vc = new ContaInt[input.length];
		int distinct = 0;
		for (int i = 0; i < input.length; i++) {
			int pos = contains(vc, input[i]);
			if (pos == -1) {
				ContaInt newElement = new ContaInt(input[i]);
				vc[distinct] = newElement;
				distinct++;
			} else {
				vc[pos].qta++;
			}
		}
		int posMax = 0;
		int countMax = vc[0].qta;
		for (int i = 1; i < distinct; i++) {
			if (vc[i].qta > countMax) {
				posMax = i;
				countMax = vc[i].qta;
			}
		}
		System.out.println("numero ripetizioni " + countMax);
		return vc[posMax].numero;
	}
	//prof
	public static int contains(ContaInt[] vc, int x) {
		for (int i = 0; i < vc.length; i++) {
			if (vc[i] == null) {
				return -1;
			}
			if (vc[i].numero == x) {
				return i;
			}
		}
		return -1;
	}
	//prof
	public static int simpleFindMode(int[] input) {
		int countMax = 0;
		// int posMax = 0;
		int modeValue = input[0];

		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] == Integer.MIN_VALUE) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] == Integer.MIN_VALUE) {
					continue;
				}
				if (input[i] == input[j]) {
					input[j] = Integer.MIN_VALUE;
					count++;
				}
			}
			if (count >= countMax) {
				countMax = count;
				// posMax=i;
				modeValue = input[i];
			}
			// input[i] = Integer.MIN_VALUE;
		}

		return modeValue;
	}
}
