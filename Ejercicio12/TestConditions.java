package com.ejercicio12.bq;

import org.junit.Test;

import junit.framework.TestCase;

public class TestConditions extends TestCase {

	@Test
	public void test() {
		for (int j=0; j<1000; j++) {
			int n1 = 0, nX = 0, n2 = 0;
			
			String[] results = new GeneratePool().generate();
			
			for (int i=0; i<15; i++) {
				if (results[i].equals("1")) {
					n1++;
				}
				else if (results[i].equals("2")) {
					n2++;
				}
				else {
					nX++;
				}
			}
			
			assertTrue(nX%2 == 0);
			assertTrue(n1 > n2);
			assertTrue(n2 >= 1);
		}
	}

}
