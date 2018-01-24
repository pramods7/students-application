
package Search;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AirTravelerAvail {

    @SerializedName("PassengerTypeQuantity")
    @Expose
    private List<PassengerTypeQuantity> passengerTypeQuantity = null;

    public List<PassengerTypeQuantity> getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    public void setPassengerTypeQuantity(List<PassengerTypeQuantity> passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }

}
