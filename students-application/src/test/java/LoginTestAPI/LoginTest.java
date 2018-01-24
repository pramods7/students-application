package LoginTestAPI;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;

import org.testng.annotations.BeforeClass;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;


public class LoginTest {

	Response resp;
	
	@Test
	public void MyTestpage(){
				
 		RequestorID RequesterID = new RequestorID();
		RequesterID.setID_Context("MobileUsername");
		RequesterID.setInstance("MobilePassword");
				
		PO pos = new PO();
		pos.setRequestorID(RequesterID);
		
		
		List <PO> pOS = new ArrayList<PO>();
		pOS.add(pos);
				
		Example obj = new Example();
				
		obj.setAuthenticationData("Musafir123456");
		obj.setCustomerType("2");
		obj.setMode("1");
		obj.setTarget("Test");
		obj.setUserAgent("A, 4.4.2");
		obj.setUserID("subodh.musafir@gmail.com");
		obj.setVersion("1.3");
		obj.setPOS(pOS);
		
		
	 
    	given()
		.accept("application/json")
		.when()
		.body(obj)
		.post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1")
		.then()
		.log()
		.all();
			
	

		/*String Token = given()
    	.contentType(ContentType.JSON)
    	.when()
    	.body(obj)
    	.post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1")
    	.then()
    	.extract()
    	.path("Token");
    
    System.out.println("Token value is => " + Token);
    
    
    
	String FirstName = given()
	    	.contentType(ContentType.JSON)
	    	.when()
	    	.body(obj)
	    	.post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1")
	    	.then()
	    	.extract()
	    	.path("FirstName");
	    
	    System.out.println("FirstName is => " + FirstName);
	    
	    
	    
	    String LastName = given()
		    	.contentType(ContentType.JSON)
		    	.when()
		    	.body(obj)
		    	.post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1")
		    	.then()
		    	.extract()
		    	.path("LastName");
		    
		    System.out.println("LastName is => " + LastName);
	    
	    
       
	}
	*/
	}
	
}
