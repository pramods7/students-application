package PostMethodTesting;



public class PostTesting {

	private String AuthenticationData;
	private String CustomerType;
	private String Mode;
	private String Target;
	private String UserAgent;
	private String UserID;
	private RequestorID RequestorID;

	
	public String getAuthenticationData() {
		return AuthenticationData;
	}
	public void setAuthenticationData(String AuthenticationData) {
		this.AuthenticationData = AuthenticationData;
	}
	public String getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(String CustomerType) {
		this.CustomerType = CustomerType;
	}
	public String getMode() {
		return Mode;
	}
	public void setMode(String Mode) {
		this.Mode = Mode;
	}
	public String getTarget() {
		return Target;
	}
	public void setTarget(String Target) {
		this.Target = Target;
	}
	public String getUserAgent() {
		return UserAgent;
	}
	public void setUserAgent(String UserAgent) {
		this.UserAgent = UserAgent;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String UserID) {
		this.UserID = UserID;
	}
	
	public RequestorID getRequestorID(){
		return RequestorID;
	}
	
	public void setRequestorID(RequestorID RequestorID){
		this.RequestorID = RequestorID;
	}
	
	
}
