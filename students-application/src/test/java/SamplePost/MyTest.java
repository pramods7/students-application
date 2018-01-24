package SamplePost;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;



public class MyTest {

	
//	private static final ContentType JSON = null;


	//@Test
	public void MyTestpage(){
				
		RequesterID RequesterID = new RequesterID();
		RequesterID.setID_Context("MobileUsername");
		RequesterID.setInstance("MobilePassword");
				
		POS pos = new POS();
		pos.setRequesterID(RequesterID);
				POS p[] = new POS[1];
				p[0] = pos;
		
		/*List <POS> POS = new ArrayList<>();
		POS.add(pos);*/
		
		MyTripLogin obj = new MyTripLogin();
				
		obj.setAuthenticationData("Musafir123456");
		obj.setCustomerType("2");
		obj.setMode("1");
		obj.setTarget("Test");
		obj.setUserAgent("A, 4.4.2");
		obj.setUserID("subodh.musafir@gmail.com");
		obj.setVersion("1.3");
		obj.setPOS(p);
		
		
	
		/*given()
		.contentType(ContentType.JSON)
		.when()
		.body(obj)
		.post("https://staging.musafir.com/Api/MyTrip/Login/?json=1")
		.then()
		.log()
		.all();
			*/
		
		Response resp = given().
				when().
				contentType(ContentType.JSON).body(pos).post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1");
		
		System.out.println("response : " + resp.body().asString());
		
		
			given().log().all().when().contentType(ContentType.JSON).body(pos).post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1")

		.then()

		.log()

		.all();
		
			
		
		
		
	}
	
	@Test
	public void testHashMap(){
		
		
		given().
		 contentType(ContentType.JSON).
        body(new HashMap<String, Object>() {{
            put("AuthenticationData", "Musafir123456");
            put("CustomerType", "2");
            put("Mode", "1");
            put("RequestorID", new HashMap<String, Object>() {{
                put("ID_Context", "MobileUsername");
                put("Instance", "MobilePassword");
            }});
            put("Target", "Test");
            put("UserAgent", "A, 4.4.2");
            put("UserID", "subodh.musafir@gmail.com");
            put("Version", "1.3");
            
        }}).
when().
        post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1")

.then()


.log()

.all();

		
		
	}
	
	
}
