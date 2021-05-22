package com.TestNG;

import org.testng.annotations.Test;

public class Invocationcount_concept {
	
	@Test
	private void browserlaunch() {

		System.out.println("browserlaunch");
	}
	
	@Test(invocationCount = 2)
	private void refresh() {

		System.out.println("refresh");
	}
	
	@Test
	private void url() {

		System.out.println("url");
	}
	
	

}
