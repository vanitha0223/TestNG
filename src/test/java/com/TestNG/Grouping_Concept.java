package com.TestNG;

import org.testng.annotations.Test;

public class Grouping_Concept {
	
	
	@Test(groups ="Gagets")
	private void mobile() {

		System.out.println("mobile");
	}
	
	@Test(groups ="Gagets")
	private void laptop() {

		System.out.println("laptop");
	}
	
	@Test(groups ="Gagets")
	private void earphones() {

		System.out.println("earphones");
	}

	
	@Test(groups ="SocialMedia")
	private void Instagram() {

		System.out.println("Instagram");
		
		
		
	}
	@Test(groups ="SocialMedia")
	private void Whatsapp() {

		System.out.println("whatsapp");
	}
	
	
	
  
	
	
	
}








       