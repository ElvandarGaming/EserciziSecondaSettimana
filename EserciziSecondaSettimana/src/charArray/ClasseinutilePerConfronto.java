package charArray;

public class ClasseinutilePerConfronto {
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
