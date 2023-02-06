package api;

import Utilis.ConfigLoader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class SpecBuilder
{
	
	public static RequestSpecification requestSpecification;	
	public static  ResponseSpecification responseSpecification;
public static RequestSpecification getRequestSpecBuilder()
{
	return new RequestSpecBuilder().
			setBaseUri(ConfigLoader.getInstance().getBaseUri()).
			setContentType(ContentType.JSON).log(LogDetail.ALL).build();
	
}
public static ResponseSpecification getResponseSpecBuilder()
{
	return new ResponseSpecBuilder().
			expectContentType(ContentType.JSON).log(LogDetail.ALL).build();
	  
}
}
