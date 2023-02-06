package test;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pojo.Pojo;
import api.SpecBuilder;
import api.applicationApi;
import  io.restassured.response.Response;

public class EPS2 
{
	@Test (priority=1)
	public void verifytheStatusCode()
	{
		Response response=applicationApi.getEPS();
		Assert.assertEquals(response.statusCode(),200); 
	}
	@Test (priority=2)
	public void verifyStatusLine()
	{
		Response response=applicationApi.getEPS();
		System.out.println(response.getStatusLine());
		//Assert.assertEquals(response.statusCode(),200);
	}
	@Test (priority=3)
	public void verifyStatuResponseTime()
	{
		Response response=applicationApi.getEPS();
		System.out.println(response.getTime());
		//Assert.assertEquals(response.statusCode(),200);
	}
	@Test (priority=4)
	public void verifyInvalidAuth()
	{
		Response response=applicationApi.getEPS();
		System.out.println(response.getStatusLine());
		//Assert.assertEquals(response.statusCode(),200);
	}
	@Test (priority=5)
	public void verifyNo4Region()
	{
		Response response=applicationApi.getEPS();
	    Pojo res=response.as(Pojo.class);
		System.out.println(res.getPricesByArea().get(1).getDeliveryArea());
		System.out.println(res.getPricesByArea().get(3).getToday().get(2).getPrice());
	}}
	

