package com.Musafir.test;

import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC_001 {

	Response response;
	
	
	@Test
	public void verifyGet(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		System.out.println(response.getStatusCode());
		
		
	}

	@Test(priority=1)
	public void verifyGet1(){
		
		
		System.out.println(URL.fixURL+Endpoints.TestName1.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName1.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}

	
	@Test(priority=2)
	public void verifyGet2(){
		
		
		System.out.println(URL.fixURL+Endpoints.TestName2.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName2.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	
	@Test(priority=3)
	public void verifyGet3(){
		
		
		System.out.println(URL.fixURL+Endpoints.TestName3.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName3.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=4)
	public void verifyGet4(){
		
		
		System.out.println(URL.fixURL+Endpoints.TestName4.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName4.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=5)
	public void verifyGet5(){
		
		
		System.out.println(URL.fixURL+Endpoints.TestName5.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName5.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=6)
	public void verifyGet6(){
		
		
		System.out.println(URL.fixURL+Endpoints.TestName6.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName6.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	
	@Test(priority=7)
	public void verifyGet7(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName7.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName7.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=8)
	public void verifyGet8(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName8.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName8.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=9)
	public void verifyGet9(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName9.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName9.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	
	@Test(priority=10)
	public void verifyGet10(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName10.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName10.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=11)
	public void verifyGet11(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName11.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName11.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=12)
	public void verifyGet12(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName12.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName12.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=13)
	public void verifyGet13(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName13.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName13.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=14)
	public void verifyGet14(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName14.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName14.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	
	@Test(priority=15)
	public void verifyGet15(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName15.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName15.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=16)
	public void verifyGet16(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName16.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName16.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=17)
	public void verifyGet17(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName17.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName17.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=18)
	public void verifyGet18(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName18.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName18.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=19)
	public void verifyGet19(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName19.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName19.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=20)
	public void verifyGet20(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName20.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName20.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=21)
	public void verifyGet21(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName19.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName19.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	@Test(priority=22)
	public void verifyGet22(){
		
			
		System.out.println(URL.fixURL+Endpoints.TestName22.getResourcePath());
		
		String url = URL.fixURL+Endpoints.TestName22.getResourcePath();
		
		response = GetTest.Get(url);
		
		System.out.println(response.getBody().asString());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
