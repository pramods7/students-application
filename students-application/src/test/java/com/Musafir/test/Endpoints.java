package com.Musafir.test;

public enum Endpoints {

	TestName("?origin=auh&destination=amd&tripType=OW"),
	TestName1("?origin=bah&destination=cok&tripType=OW"),
	TestName2("?origin=blr&destination=del&tripType=OW"),
	TestName3("?origin=bom&destination=del&tripType=OW"),
	TestName4("?origin=bom&destination=dxb&tripType=RT"),
	TestName5("?origin=ccj&destination=dxb&tripType=OW"),
	TestName6("?origin=dwc&destination=bom&tripType=RT"),
	TestName7("?origin=dxb&destination=bom&tripType=OW"),
	TestName8("?origin=dxb&destination=bom&tripType=RT"),
	TestName9("?origin=dxb&destination=del&tripType=OW"),
	TestName10("?origin=dxb&destination=del&tripType=RT"),
	TestName11("?origin=dxb&destination=hkt&tripType=OW"),
	TestName12("?origin=dxb&destination=khi&tripType=OW"),
	TestName13("?origin=dxb&destination=kwi&tripType=OW"),
	TestName14("?origin=fra&destination=bah&tripType=RT"),
	TestName15("?origin=ixb&destination=del&tripType=OW"),
	TestName16("?origin=ixz&destination=del&tripType=OW"),
	TestName17("?origin=jed&destination=dxb&tripType=OW"),
	TestName18("?origin=shj&destination=bom&tripType=OW"),
	TestName19("?origin=shj&destination=bom&tripType=RT"),
	TestName20("?origin=shj&destination=del&tripType=RT"),
	TestName21("?origin=shj&destination=dxb&tripType=OW"),
	TestName22("?origin=shj&destination=mux&tripType=RT");
	
	
	
	String resourcePath;
		
	
	Endpoints (String resourcePath){
		
		this.resourcePath = resourcePath;
	
	}
	
	
	public String getResourcePath(){
		return this.resourcePath;
		
	}
	
	
	public String getResourePath(String Data){
		
		return this.resourcePath+Data;
	}
	
	
	
	
	
}








