package PostTesting;
import java.util.HashMap;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;



public class TestCasePost {

	

	@Test
	public void test_02(){
		
		/*ArrayList<String> RequesterID = new ArrayList<>();
		RequesterID.add("Instance");
		RequesterID.add("ID_Context");
		*/
		 HashMap<String, String> hmap = new HashMap<String, String>();
		 hmap.put("Instance", "MobilePassword");
	     hmap.put("ID_Context", "MobileUsername");
	     String var= hmap.get("Instance");
	     String var1= hmap.get("ID_Context");
		
		
	//String	RequesterID = "{\"Instance\":\"MobilePassword\",\"ID_Context\":\"MobileUsername\"}";	
		
		
	POST post = new POST();
	
	//JSONPObject jsonObj = new JSONPObject(RequesterID, jsonObj);
	
	/*post.setInstance("MobilePassword");
	post.setID_Context("MobileUsername");*/
	
	post.setAuthenticationData("Musafir123456");
	post.setCustomerType("2");
	post.setMode("1");
	post.setTarget("Test");
	post.setUserAgent("A, 4.4.2");
	post.setUserID("subodh.musafir@gmail.com");
	post.setVersion("1.3");
	post.setRequesterID(hmap);
	
	Response resp = given().
			when().
			contentType(ContentType.JSON).body(post).post("https://stagingin.musafir.com/Api/MyTrip/Login/?json=1");
	
	System.out.println("response : " + resp.body().prettyPrint());
	
	
	
	given().log().all().when().contentType(ContentType.JSON).body(post).post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1")

	.then()

	.log()

	.all();
	
	//System.out.println("hashmap : " + var1);
}

		
		

}

	


