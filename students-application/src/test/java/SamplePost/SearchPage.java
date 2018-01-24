package SamplePost;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.ResponseBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;


public class SearchPage {

	
	
	
	//@Test
	public void Search()
	{
	
	String body = "{\"OriginDestinationInformation\":[{\"DestinationLocation\":{\"LocationCode\":\"DEL\"},\"Item\":{\"Value\":\"2017-09-16\"},\"OriginLocation\":{\"LocationCode\":\"BOM\"}}],\"PrimaryLangID\":\"\",\"SpecificFlightInfo\":{\"TPA_Extensions\":{\"searchPreferencesExtensions\":{\"FlightResultsType\":\"Split\",\"IncludeFareDetailedBreakdowns\":true}}},\"TravelPreferences\":[{\"CabinPref\":[{\"Cabin\":\"Any\"}],\"FlightTypePref\":[]}],\"TravelerInfoSummary\":{\"AirTravelerAvail\":[{\"PassengerTypeQuantity\":[{\"Code\":\"ADT\",\"Quantity\":\"1\"},{\"Code\":\"CHD\",\"Quantity\":\"0\"},{\"Code\":\"INF\",\"Quantity\":\"0\"}]}]},\"UserAgent\":\"A, 5.0.2\",\"EchoToken\":\"\",\"MaxResponses\":\"200\",\"POS\":[{\"RequestorID\":{\"ID\":\"satish.sane555@gmail.com\",\"MessagePassword\":\"musafir123456\"}}],\"Target\":\"Test\",\"Version\":1.3}";

		
	given()
	.when()
	.body(body)
	.post("http://10.0.4.7:7082/Search/?json=1")
	.then()
	.log()
	.headers();
	
	
	
	}
	
	@Test
	public void ContentVerify()
	{
		
	String body = "{\"OriginDestinationInformation\":[{\"DestinationLocation\":{\"LocationCode\":\"DEL\"},\"Item\":{\"Value\":\"2017-09-16\"},\"OriginLocation\":{\"LocationCode\":\"BOM\"}}],\"PrimaryLangID\":\"\",\"SpecificFlightInfo\":{\"TPA_Extensions\":{\"searchPreferencesExtensions\":{\"FlightResultsType\":\"Split\",\"IncludeFareDetailedBreakdowns\":true}}},\"TravelPreferences\":[{\"CabinPref\":[{\"Cabin\":\"Any\"}],\"FlightTypePref\":[]}],\"TravelerInfoSummary\":{\"AirTravelerAvail\":[{\"PassengerTypeQuantity\":[{\"Code\":\"ADT\",\"Quantity\":\"1\"},{\"Code\":\"CHD\",\"Quantity\":\"0\"},{\"Code\":\"INF\",\"Quantity\":\"0\"}]}]},\"UserAgent\":\"A, 5.0.2\",\"EchoToken\":\"\",\"MaxResponses\":\"200\",\"POS\":[{\"RequestorID\":{\"ID\":\"satish.sane555@gmail.com\",\"MessagePassword\":\"musafir123456\"}}],\"Target\":\"Test\",\"Version\":1.3}";
	
			
	given()
	.body(body)
	.when()
	.accept(ContentType.JSON)
	.post("http://192.168.0.64:803/Api/Search/?json=1")
	.then()
	.log()
	.headers();
	
	
	
	
	
//	System.out.println(resp.asString());
	

	
	
	}
	
	
	
	
	}
