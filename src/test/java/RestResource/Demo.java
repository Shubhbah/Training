package RestResource;

import static io.restassured.RestAssured.given;

import api.SpecBuilder;
import io.restassured.response.Response;

public class Demo 
{
	
	public static Response getEPS(String ApiKey,String path)
	{
		
		return  given(SpecBuilder.getRequestSpecBuilder()).header("api-key",ApiKey).when().get(path).
				then().spec(SpecBuilder.getResponseSpecBuilder()).extract().response();
				
	}
	public static Response getDailyConsumption(String Token,String path)
	{
		return given(SpecBuilder.getRequestSpecBuilder()).headers("Authorisation","Bearer "+ Token).when().get(path).
				then().spec(SpecBuilder.getResponseSpecBuilder()).extract().response();	 			
	}
	public static Response getMonthlyConsumption(String Token,String path)
	{
		return given(SpecBuilder.getRequestSpecBuilder()).header("Authorisation","Bearer "+ Token).when().get(path).
				then().spec(SpecBuilder.getResponseSpecBuilder()).extract().response();	 			
	}
	public static Response getWeeklyConsumption(String Token,String path)
	{
		return given(SpecBuilder.getRequestSpecBuilder()).header("Authorisation","Bearer "+ Token).when().get(path).
				then().spec(SpecBuilder.getResponseSpecBuilder()).extract().response();	 			
	}
}
