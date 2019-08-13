package com.ejercicio12.bq;

import java.util.concurrent.ThreadLocalRandom;

public class GeneratePool {
	
	private int n1, n2, nX;
	private static final String[] RESULT = {"1", "X", "2"};
	private static final int TOTAL_RESULTS = 15;
	private int[] resultNumber;
	
	protected String[] generate() {
		
		/* The string array that will store the results */
		String[] results = new String[TOTAL_RESULTS];
		
		/* resultNumber stores the number of occurrences of each option ('1', 'X' or '2') */
		resultNumber = calculateResultNumber();

		for (int i=0; i<TOTAL_RESULTS; i++) {
			int index = ThreadLocalRandom.current().nextInt(0, 3);
			
			/* If one option has completed its number of occurrences, another one must be
			   written to the results array */
			while (resultNumber[index%3] == 0) {
				index++;
			}
			
			results[i] = RESULT[index%3];
			resultNumber[index%3]--;
		}
		
		System.out.println("Number of '2': " + n2);
		System.out.println("Number of '1': " + n1);
		System.out.println("Number of 'X': " + nX);
		
		return results;
	}
	
	private int[] calculateResultNumber() {
		
		/* In order to meet the three conditions, the number of '2' must be between 1 and 6 */
		n2 = ThreadLocalRandom.current().nextInt(1, 7);
		
		/* If the number of 'X', nX, must be even, n1+n2 must be odd. So if n2 is even, n1 must be odd,
		 * and vice versa */
		if (n2%2 == 0) {
			n1 = (ThreadLocalRandom.current().nextInt(n2/2, ((15-(n2+3))/2)+1)*2)+1;
		}
		else {
			n1 = ThreadLocalRandom.current().nextInt((n2+1)/2, ((15-(n2+2))/2)+1)*2;
		}
		nX = 15 - (n1+n2);
		
		return new int[]{n1, nX, n2};
	}

}
