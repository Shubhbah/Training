package api;

import static io.restassured.RestAssured.given;

import Pojo.Pojo;
import RestResource.Demo;
import Utilis.ConfigLoader;
import io.restassured.response.Response;

public class applicationApi 
{
	
//static String ApiKey="1565115b-aa85-4f9a-8ee9-6044b840867c";
public static Response getEPS()
{
	
	return Demo.getEPS(ConfigLoader.getInstance().getApiKey(),Route.BasePath);
}
public static Response getDailyConsumption()
{
	 String Token1="eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJwaG9uZU51bWJlciI6Iis0NzkxMzM1Nzc1IiwiYW5vbnltb3VzSWQiOiJjYTU3Y2I3Mi1hMzM3LTQ0MDMtODdiZi0wNmZiZTI5NmM2NWMiLCJyZWRpcmVjdFVyaSI6Imh0dHBzOi8vbW90a3JhZnQtZnJvbnRlbmQtZmUyLWFiNXN0a2t5NnEtbHouYS5ydW4uYXBwL2F1dGhIYW5kbGVyIiwicmVmcmVzaFRva2VuIjoiMTU1M2EwZWQwM2FiMWUxNzViNTc2OGVlOWNiY2NjZTVjNjI5MWQ5OCIsInJlZnJlc2hUb2tlbkV4cGlyZXNBdCI6IjIwMjMtMDItMThUMDc6NDc6MzkuMTI0WiIsImFjY2Vzc1Rva2VuRXhwaXJlc0F0IjoiMjAyMy0wMi0wNVQwNzo0NzozOS4xMjRaIiwic2NvcGUiOiJSRUFEX0FDQ0VTUyIsImFjY2Vzc1Rva2VuIjoiYTUzMzQyY2U3YzEyMmYzZmFhNzBjNGE2MjY3N2M1YzNhYjZiMzE3NyIsInVpZCI6Ijl3dWVzWDU2V1pYQml4QUtQdVlqeEtVQnNTdzIiLCJ1c2VybmFtZSI6Iis0NzkxMzM1Nzc1IiwiaWF0IjoxNjc1NDk2ODYwLCJleHAiOjE2NzU1ODMyNTgsImF1ZCI6Imh0dHBzOi8vbW90a3JhZnQtZnJvbnRlbmQtZmUyLWFiNXN0a2t5NnEtbHouYS5ydW4uYXBwIiwiaXNzIjoiTW90a3JhZnQgQVMifQ.RE9Pdbri4bMWg6It1Rs2aqs8TWq0hDQCWjrxjDOriQCuYVUaTUFFcMKc0U1rVUFxr6N7w4ubmu2a7YLMLUcP8QUF8ZGvRQFP4sUyA-UbSlw-OLvQEif27uIO2iQ4_A1_i1qeGyL1YsWfGqHcF_vv807BkDBZzOY2HvApcMDFr2corT_Z5JCZVNIT3mh5qPy3vd1dDYgw3ssgfPXmj4e2GjoBXeL5ZKDwAj5xd5J1odwWjFC78q0Va6lfz-tm598u_jzjnsa9gjpfldVB_IZwGjUKAqLZ6xbjux1gCFwnTE8zUohBG4KzHWGwjo5ey1SlsrckNvYsmKI7scrk-oym7A";
	return Demo.getDailyConsumption(Token1,"/v4/meter/707057500040913316/consumption/data/daily?date=2022-12-05");
	
}
public static Response getMonthlyConsumption(String Token,String MeterId,String Date)
{
	return given(SpecBuilder.getRequestSpecBuilder()).header("Authorisation","Bearer "+ Token).when().get("/customer/v4/meter/ "+MeterId + "/consumption/data/monthly?date= "+Date).
			then().spec(SpecBuilder.getResponseSpecBuilder()).extract().response();	 			
}
public static Response getWeeklyConsumption(String Token,String MeterId,String Date)
{
	return given(SpecBuilder.getRequestSpecBuilder()).header("Authorisation","Bearer "+ Token).when().get("/customer/v4/meter/ "+MeterId + "/consumption/data/weekly?date= "+Date).
			then().spec(SpecBuilder.getResponseSpecBuilder()).extract().response();	 			
}
public static Response getConsumptionInterval(String Token,String MeterId)
{
	return given(SpecBuilder.getRequestSpecBuilder()).header("Authorisation","Bearer "+ Token).when().get("/customer/v4/meter/ "+MeterId + "/consumption/intervals").
			then().spec(SpecBuilder.getResponseSpecBuilder()).extract().response();	 			
}
}
