package com.TestNG;

import org.testng.annotations.Test;

public class Expected_exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void DEMO() {
 
		int v = 8;
		
		System.out.println(v/0);
	}

}
 