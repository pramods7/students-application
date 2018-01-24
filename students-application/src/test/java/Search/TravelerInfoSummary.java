
package Search;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TravelerInfoSummary {

    @SerializedName("AirTravelerAvail")
    @Expose
    private List<AirTravelerAvail> airTravelerAvail = null;

    public List<AirTravelerAvail> getAirTravelerAvail() {
        return airTravelerAvail;
    }

    public void setAirTravelerAvail(List<AirTravelerAvail> airTravelerAvail) {
        this.airTravelerAvail = airTravelerAvail;
    }

}
