package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	@BeforeSuite
    private void setproperty() {
     
		
		System.out.println("setproperty");
	}
	
	@BeforeTest
	private void browserLaunch() {

		System.out.println("browserlaunch");
	}
	
	@BeforeClass
	private void url() {

		System.out.println("url");
	}
	
	@BeforeMethod
	private void login() {

		System.out.println("login");
	
	}
	
	@Test
	private void mobile() {

		System.out.println("mobile");
	}
	
	@Test
	private void laptop() {

		System.out.println("laptop");
	}
	
	@Test
	private void earphones() {

		System.out.println("earphones");
	}
	
	@AfterMethod
	private void logout() {

	System.out.println("logout");
	
	}
	
	@AfterClass
	private void verifyHomePage() {

		System.out.println("verifyHomePage");
	}
	
	@AfterTest
	private void close() {

		System.out.println("close");
	}
	
	@AfterSuite
	private void deleteallcookies() {

		System.out.println("delete all cookies");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
