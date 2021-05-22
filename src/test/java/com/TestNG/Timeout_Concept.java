package com.TestNG;

import org.testng.annotations.Test;

public class Timeout_Concept {
	
	@Test(timeOut = 3000)
	private void demo() throws InterruptedException {

		
		
		System.out.println("BrowserLaunch");
		
		System.out.println("username");
		
		System.out.println("password");
		
		System.out.println("Login Btn");
		
		Thread.sleep(2000);
		
		System.out.println("Go To Another Page");
	}

}
