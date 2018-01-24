
package LoginTestAPI;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("AuthenticationData")
    @Expose
    private String authenticationData;
    @SerializedName("CustomerType")
    @Expose
    private String customerType;
    @SerializedName("Mode")
    @Expose
    private String mode;
    @SerializedName("POS")
    @Expose
    private List<PO> pOS = null;
    @SerializedName("PrimaryLangID")
    @Expose
    private String primaryLangID;
    @SerializedName("Target")
    @Expose
    private String target;
    @SerializedName("UserAgent")
    @Expose
    private String userAgent;
    @SerializedName("UserID")
    @Expose
    private String userID;
    @SerializedName("Version")
    @Expose
    private String version;

    public String getAuthenticationData() {
        return authenticationData;
    }

    public void setAuthenticationData(String authenticationData) {
        this.authenticationData = authenticationData;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public List<PO> getPOS() {
        return pOS;
    }

    public void setPOS(List<PO> pOS) {
         this.pOS = pOS;
    }

    public String getPrimaryLangID() {
        return primaryLangID;
    }

    public void setPrimaryLangID(String primaryLangID) {
        this.primaryLangID = primaryLangID;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
         this.userID = userID;
     }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
