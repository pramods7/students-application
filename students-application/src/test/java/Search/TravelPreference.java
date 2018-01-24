
package Search;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TravelPreference {

    @SerializedName("CabinPref")
    @Expose
    private List<CabinPref> cabinPref = null;
    @SerializedName("FlightTypePref")
    @Expose
    private List<Object> flightTypePref = null;

    public List<CabinPref> getCabinPref() {
        return cabinPref;
    }

    public void setCabinPref(List<CabinPref> cabinPref) {
        this.cabinPref = cabinPref;
    }

    public List<Object> getFlightTypePref() {
        return flightTypePref;
    }

    public void setFlightTypePref(List<Object> flightTypePref) {
        this.flightTypePref = flightTypePref;
    }

}
