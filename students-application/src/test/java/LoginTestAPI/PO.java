
package LoginTestAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PO {

    @SerializedName("RequestorID")
    @Expose
    private RequestorID RequestorID;

    public RequestorID getRequestorID() {
        return RequestorID;
    }

    public void setRequestorID(RequestorID RequestorID) {
        this.RequestorID = RequestorID;
    }

}
