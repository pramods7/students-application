package PostMethodTesting;


import static com.jayway.restassured.RestAssured.given;
import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;



public class TestCasePostNew {

	

	@Test
	public void test_02(){
	
		RequestorID RequestorID = new RequestorID();
		RequestorID.setInstance("MobilePassword");
		RequestorID.setID_Context("MobileUsername");
		
		
	PostTesting pos = new PostTesting();

	pos.setRequestorID(RequestorID);
	pos.setAuthenticationData("Musafir123456");
	pos.setCustomerType("2");
	pos.setMode("1");
	pos.setTarget("Test");
	pos.setUserAgent("A, 4.4.2");
	pos.setUserID("subodh.musafir@gmail.com");

	
	Response resp = given().
			when().
			contentType(ContentType.JSON).body(pos).post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1");
	
	
		given().log().all().when().contentType(ContentType.JSON).body(pos).post("http://192.168.0.64:803/Api/MyTrip/Login/?json=1")

	.then()

	.log()

	.all();
	
	
	System.out.println("response : " + resp.body().asString());
	

}

		
		

}

	


