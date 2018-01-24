
package Search;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchAPITesting {

    @SerializedName("OriginDestinationInformation")
    @Expose
    private List<OriginDestinationInformation> originDestinationInformation = null;
    @SerializedName("SpecificFlightInfo")
    @Expose
    private SpecificFlightInfo specificFlightInfo;
    @SerializedName("TravelPreferences")
    @Expose
    private List<TravelPreference> travelPreferences = null;
    @SerializedName("TravelerInfoSummary")
    @Expose
    private TravelerInfoSummary travelerInfoSummary;
    @SerializedName("UserAgent")
    @Expose
    private String userAgent;
    @SerializedName("EchoToken")
    @Expose
    private String echoToken;
    @SerializedName("MaxResponses")
    @Expose
    private String maxResponses;
    @SerializedName("POS")
    @Expose
    private List<PO> pOS = null;
    @SerializedName("Target")
    @Expose
    private String target;
    @SerializedName("Version")
    @Expose
    private Double version;

    public List<OriginDestinationInformation> getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    public void setOriginDestinationInformation(List<OriginDestinationInformation> originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }

    public SpecificFlightInfo getSpecificFlightInfo() {
        return specificFlightInfo;
    }

    public void setSpecificFlightInfo(SpecificFlightInfo specificFlightInfo) {
        this.specificFlightInfo = specificFlightInfo;
    }

    public List<TravelPreference> getTravelPreferences() {
        return travelPreferences;
    }

    public void setTravelPreferences(List<TravelPreference> travelPreferences) {
        this.travelPreferences = travelPreferences;
    }

    public TravelerInfoSummary getTravelerInfoSummary() {
        return travelerInfoSummary;
    }

    public void setTravelerInfoSummary(TravelerInfoSummary travelerInfoSummary) {
        this.travelerInfoSummary = travelerInfoSummary;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getEchoToken() {
        return echoToken;
    }

    public void setEchoToken(String echoToken) {
        this.echoToken = echoToken;
    }

    public String getMaxResponses() {
        return maxResponses;
    }

    public void setMaxResponses(String maxResponses) {
        this.maxResponses = maxResponses;
    }

    public List<PO> getPOS() {
        return pOS;
    }

    public void setPOS(List<PO> pOS) {
        this.pOS = pOS;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

}
