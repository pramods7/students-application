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

public class PostTest {

	
	static RequestSpecBuilder builder;
	static RequestSpecification rspec;
	
	static ResponseSpecBuilder responsebuilder;
	static ResponseSpecification responsespec;
	
	
	@Test
	public void postExample()
	{
		
		
		//String body = "{\"AuthenticationData\":\"Musafir123456\",\"CustomerType\":\"2\",\"Mode\":\"1\",\"POS\":[{\"RequestorID\":{\"ID_Context\":\"MobileUsername\",\"Instance\":\"MobilePassword\"}}],\"PrimaryLangID\":\"\",\"Target\":\"Test\",\"UserAgent\":\"A, 4.4.2\",\"UserID\":\"subodh.musafir@gmail.com\",\"Version\":\"1.3\"}";
		
		builder = new RequestSpecBuilder();
		
		
		
		builder.addParameter("AuthenticationData", "Musafir123456");
		builder.addParameter("CustomerType", "2");
		builder.addParameter("Mode", "1");
		builder.addFormParameter("ID_Context", "MobileUsername");
		builder.addFormParameter("Instance", "MobilePassword");
		builder.addFormParameter("Target", "Test");
		builder.addFormParameter("UserAgent", "A, 4.4.2");
		builder.addFormParameter("UserID", "subodh.musafir@gmail.com");
		builder.addFormParameter("Version", "1.3");
		
		
		rspec = builder.build();
		
		
		
		
		responsebuilder = new ResponseSpecBuilder();
		
		responsebuilder.expectBody("Content-Length",equalTo(284));
		responsebuilder.expectStatusCode(200);
		
		responsespec = responsebuilder.build();
		
	
		
		
		
		
		
		given()
		.contentType(ContentType.JSON)
		.spec(rspec)
		.log()
		.all()
		.when()
		.post("https://staging.musafir.com/Api/MyTrip/Login/?json=1")
		.then()
		.spec(responsespec);
		
		
		
		
		
		
	}


	
	
	
	
}
