package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
	
	
	@Test
	@Parameters({"username" ,"password"})
	private void Demo(String username , int password) {

		
		System.out.println("username");
		
		System.out.println("password");
	}
	
	@DataProvider
	private Object [] [] test_Data(){
		return  new Object[] [] {
			{"sana", "786"}
		
		
		
	
	

};
}

}
	
	

