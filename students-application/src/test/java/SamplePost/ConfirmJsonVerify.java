package SamplePost;

import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.jayway.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;





public class ConfirmJsonVerify {

	@Test
	public void Confirm()
	{
		
		
		String body = "{\"AirItinerary\":{\"DirectionInd\":\"Oneway\",\"OriginDestinationOptions\":[{\"TotalDurationInMinutes\":95,\"FlightSegment\":[{\"ArrivalAirport\":{\"LocationCode\":\"BLR\",\"Terminal\":\"\"},\"ArrivalDateTime\":\"2017-10-05T20:45:00\",\"BookingClassAvails\":[{\"CabinType\":\"Economy\",\"BookingClassAvail\":[{\"ResBookDesigCode\":\"R\"}]}],\"DepartureAirport\":{\"LocationCode\":\"BOM\",\"Terminal\":\"1\"},\"DepartureDateTime\":\"2017-10-05T19:10:00\",\"Equipment\":[{\"AirEquipType\":\"320\"}],\"FlightNumber\":\"799\",\"MarketingAirline\":{\"Code\":\"6E\"},\"OperatingAirline\":{\"Code\":\"6E\"},\"StopQuantity\":\"0\",\"TPA_Extensions\":{\"FlightSegmentExtensions\":{\"JourneyDurationInMinutes\":\"0\",\"TotalBaggageAllowance\":\"15 kg\"}}}]}]},\"BookingReferenceID\":{\"TPA_Extensions\":{\"OriginalSearchParameters\":\"p=1&f=0&sd=05/10/17&ed=05/10/17&o=BOM&d=BLR&c=0&ad=1&ch=0&in=0\"}},\"PrimaryLangID\":\"\",\"TravelerInfoSummary\":{\"AirTravelerAvail\":[{\"PassengerTypeQuantity\":[{\"Code\":\"ADT\",\"Quantity\":\"1\"},{\"Code\":\"CHD\",\"Quantity\":\"0\"},{\"Code\":\"INF\",\"Quantity\":\"0\"}]}],\"PaymentDetail\":{\"PaymentAmount\":[{\"Amount\":5528}]}},\"UserAgent\":\"A, 5.1\",\"EchoToken\":\"\",\"MaxResponses\":\"200\",\"POS\":[{\"RequestorID\":{\"ID\":\"rohit.chandekar125@gmail.com\",\"MessagePassword\":\"musafir123456\"}}],\"Target\":\"Test\",\"Version\":1.3}";
		
		
		
		
	
	/*	given()
		.accept("application/json")
		.when()
		.body(body)
		.contentType(ContentType.JSON)
		.post("http://192.168.0.64:803/Api/Confirm/?json=1")
		.then()
		.log()
		.all();
		*/
		
		
	
		
		
		String test = given()
				.queryParam("CabinType", "Economy")
				.queryParam("FlightNumber", "799")
				.when()
				.body(body)
				.contentType(ContentType.JSON)
				.post("http://192.168.0.64:803/Api/Confirm/?json=1")
				.then()
				.extract()
				.path(".'Items[1].PricedItinerary[0].AirItinerary.OriginDestinationOptions[0].FlightSegment[0].BookingClassAvails[0].BookingClassAvails[0].CabinType'");
		
		System.out.println("test => " + test);
		
		 
			
		
		
		
		
		
		/*String CabinType = given()
				
				
				.contentType(ContentType.JSON)
		    	.when()
		    	.body(body)
		    	.post("http://192.168.0.64:803/Api/Confirm/?json=1")
		       	.then()
		    	.extract()
		    	.path(".Items[1].PricedItinerary[0].AirItinerary.OriginDestinationOptions[0].FlightSegment[0].BookingClassAvails[0].CabinType", equalTo("CabinType"));
		    	
		    	
		    	
		    System.out.println("CabinType is => " + CabinType);
	
	*/
		    
	
	}
	
}
