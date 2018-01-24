
package Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OriginDestinationInformation {

    @SerializedName("DestinationLocation")
    @Expose
    private DestinationLocation destinationLocation;
    @SerializedName("Item")
    @Expose
    private Item item;
    @SerializedName("OriginLocation")
    @Expose
    private OriginLocation originLocation;

    public DestinationLocation getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(DestinationLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(OriginLocation originLocation) {
        this.originLocation = originLocation;
    }

}
