package PostTesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.List;


public class POST {

	private String AuthenticationData;
	private String CustomerType;
	private String Mode;
	private HashMap RequesterID;
	
		//private List<String> RequesterID;
	private String Target;
	private String UserAgent;
	private String UserID;
	private String Version;
	//private String Instance;
//	private String ID_Context;
	
	
	public HashMap RequesterID() {
		return RequesterID;
	}
	
	public void setRequesterID(HashMap RequesterID) {
		this.RequesterID = RequesterID;
	}
	
	
	public String getAuthenticationData() {
		return AuthenticationData;
	}
	public void setAuthenticationData(String authenticationData) {
		this.AuthenticationData = authenticationData;
	}
	public String getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(String customerType) {
		this.CustomerType = customerType;
	}
	public String getMode() {
		return Mode;
	}
	public void setMode(String mode) {
		this.Mode = mode;
	}
	public String getTarget() {
		return Target;
	}
	public void setTarget(String target) {
		this.Target = target;
	}
	public String getUserAgent() {
		return UserAgent;
	}
	public void setUserAgent(String userAgent) {
		this.UserAgent = userAgent;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		this.UserID = userID;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		this.Version = version;
	}

/*	public String getInstance() {
		return Version;
	}*/
	/*public void setInstance(String Instance) {
		this.Instance = Instance;
	}
	
	public String getID_Context() {
		return ID_Context;
	}
	public void setID_Context(String ID_Context) {
		this.ID_Context = ID_Context;
	}
	*/
}
