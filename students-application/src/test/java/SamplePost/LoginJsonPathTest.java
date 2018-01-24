package SamplePost;

import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.jayway.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;



public class LoginJsonPathTest {

	
	@Test
	public void postExample()
	{
		
		
		String body = "{\"AuthenticationData\":\"Musafir123456\",\"CustomerType\":\"2\",\"Mode\":\"1\",\"POS\":[{\"RequestorID\":{\"ID_Context\":\"MobileUsername\",\"Instance\":\"MobilePassword\"}}],\"PrimaryLangID\":\"\",\"Target\":\"Test\",\"UserAgent\":\"A, 4.4.2\",\"UserID\":\"subodh.musafir@gmail.com\",\"Version\":\"1.3\"}";
		
	
	
		given()
		.accept("application/json")
		.when()
		.body(body)
		.post("http://10.0.4.7:7082/MyTrip/Login/?json=1")
		.then()
		.log()
		.all();
		


		
		String Token = given()
		    	.contentType(ContentType.JSON)
		    	.when()
		    	.body(body)
		    	.post("http://10.0.4.7:7082/MyTrip/Login/?json=1")
		    	.then()
		    	.extract()
		    	.path("Token");
		    
		    System.out.println("Token is => " + Token);
	
	
	
	
	
	
	}
	
}
