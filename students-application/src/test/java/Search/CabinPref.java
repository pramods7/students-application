
package Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CabinPref {

    @SerializedName("Cabin")
    @Expose
    private String cabin;

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

}
