
package Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpecificFlightInfo {

    @SerializedName("TPA_Extensions")
    @Expose
    private TPAExtensions tPAExtensions;

    public TPAExtensions getTPAExtensions() {
        return tPAExtensions;
    }

    public void setTPAExtensions(TPAExtensions tPAExtensions) {
        this.tPAExtensions = tPAExtensions;
    }

}
