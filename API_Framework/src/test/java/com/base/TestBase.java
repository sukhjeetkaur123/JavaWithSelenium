package com.base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.testng.annotations.BeforeSuite;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class TestBase {
	
	public static RequestSpecification httpRequest;
	public static Response response;
	public String custid="cus_JJWb3KRaHZsw5g";
	public static Logger logger;

	@BeforeSuite
	public void Setup()
	{
		logger=Logger.getLogger("RestAssuredAPITesting_StripeProject");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	}



}
