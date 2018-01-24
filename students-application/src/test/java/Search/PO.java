
package Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PO {

    @SerializedName("RequestorID")
    @Expose
    private RequestorID requestorID;

    public RequestorID getRequestorID() {
        return requestorID;
    }

    public void setRequestorID(RequestorID requestorID) {
        this.requestorID = requestorID;
    }

}
