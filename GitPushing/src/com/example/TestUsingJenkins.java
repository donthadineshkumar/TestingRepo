package com.example;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestUsingJenkins {

	
	String expectedRes;
	String actualResult = "Iam";
	
	@BeforeTest
	public void setUp(){
		expectedRes = "Iam";
	}
	
	@Test
	public void testExample(){
		assertEquals(expectedRes,actualResult);
	}
	
	@AfterTest
	public void tearDown(){
		//CLOSE SOMETHING 
	}
	
}
