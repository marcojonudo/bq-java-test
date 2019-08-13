package com.ejercicio12.bq;

public class Pool {

	public static void main(String[] args) {
		String[] results = new GeneratePool().generate();
		
		System.out.println("---------------------");
		for (int i=0; i<15; i++) {
			System.out.println("Match " + (i+1) + ": " +
									results[i]);
		}
		System.out.println("---------------------");
	}
	
}
