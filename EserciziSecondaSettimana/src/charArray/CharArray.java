package charArray;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
		// int[] array = { 1, 4, 1, 4, 3, 1,3,3,5,2,1,4};
		int[] array = { 4,4, 8 ,5,6, 7, 4, 4, 1, 4, 8, 1, 4, 4, 7, 6, 5, 4, 1, 5, 1 };
		System.out.println(findMode(array)); 

		//System.out.println(simpleFindMode(array));
		//ContaInt[] dc = contaInt(array);
		//System.out.println(findMaxNum(dc));

		
	}

	public static int findMaxNum(ContaInt[] x) {
		int max = x[0].qta;
		int num = x[0].numero;
		for(int i=1; i<x.length;i++) {
			if(max<x[i].qta) {
				max = x[i].qta;
				num = x[i].numero;
			}
		}
		System.out.println("numero ripetizioni " + max);
		return num;
	}
	
	public static ContaInt[] contaInt(int[] array) {
		int[] a = new int[array.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = array[i];
		}
		// copia array

		ContaInt[] h = new ContaInt[a.length];
		
		// creazione array di oggetti conta int
		
		for (int i = 0, t=0; i < a.length - 1; i++, t++) {

			h[t] = new ContaInt(a[i]);

			for (int j = i; j > 0; j--) {
				if (h[t].numero == a[j]) {
					h[t].qta++;
					for (int s = j; s < counter - 1; s++) {
						a[s] = a[s + 1];
						a[counter - 1] = 404;

					}

				}

				//System.out.println(Arrays.toString(a));
			}

		}
		//System.out.println(h[0].qta);
		//System.out.println("questo quaaaa" + h[1].qta);
		//System.out.println("questo qui" + h[2].qta);
		// System.out.println(Arrays.toString(array));
		return h;
	}

	public static String posizioni(int[] a) {
		int b = a[0];
		int f = 0;

		for (int i = 0; i < a.length; i++) {
			boolean check = a[i] == b;
			if (check) {
				// h[f] = i;
				f++;
				// i=a.length;
			}
		}

		int[] h = new int[f];
		f = 0;
		// System.out.println(f);
		for (int i = 0; i < a.length; i++) {
			boolean check = a[i] == b;
			if (check) {
				h[f] = i;

				f++;
				// i=a.length;
			}

		}
		// System.out.println(Arrays.toString(h));
		return Arrays.toString(h);

	}

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

	public static int simpleFindMode(int[] input) {
		int countMax = 0;
		int posMax = 0;
		int modeValue = input[0];

		for (int i = 0; i < input.length - 1 ; i++) {
			if(input[i]==Integer.MIN_VALUE){
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
			if(count>= countMax) {
				countMax = count;
				posMax=i;
				modeValue= input[i];
			}
			 //input[i] = Integer.MIN_VALUE;
		}
		
		return modeValue;
	}
}
