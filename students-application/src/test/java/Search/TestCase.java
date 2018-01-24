package Search;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import LoginTestAPI.PO;

import com.jayway.restassured.http.ContentType;

import org.testng.annotations.BeforeClass;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;



public class TestCase {

	
	@Test
	public void SearchAPI(){
		
		
		PassengerTypeQuantity passengerTypeQuantity = new PassengerTypeQuantity();
		
		passengerTypeQuantity.setCode("ADT");
		passengerTypeQuantity.setQuantity("1");
		
		AirTravelerAvail airtraveleravail = new AirTravelerAvail();
		//airtraveleravail.setPassengerTypeQuantity(passengerTypeQuantity);
	
		TravelerInfoSummary TravelerInfoSummary = new TravelerInfoSummary();
		//TravelerInfoSummary.setAirTravelerAvail(airTravelerAvail);
		
		
		List <AirTravelerAvail> AirTravelerAvail = new ArrayList<AirTravelerAvail>();
		AirTravelerAvail.add(airtraveleravail);
		
		
		
		
		
		
	}
	
	
	
	
	
}
