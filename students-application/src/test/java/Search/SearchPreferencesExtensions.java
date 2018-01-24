
package Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchPreferencesExtensions {

    @SerializedName("FlightResultsType")
    @Expose
    private String flightResultsType;
    @SerializedName("IncludeFareDetailedBreakdowns")
    @Expose
    private Boolean includeFareDetailedBreakdowns;

    public String getFlightResultsType() {
        return flightResultsType;
    }

    public void setFlightResultsType(String flightResultsType) {
        this.flightResultsType = flightResultsType;
    }

    public Boolean getIncludeFareDetailedBreakdowns() {
        return includeFareDetailedBreakdowns;
    }

    public void setIncludeFareDetailedBreakdowns(Boolean includeFareDetailedBreakdowns) {
        this.includeFareDetailedBreakdowns = includeFareDetailedBreakdowns;
    }

}
