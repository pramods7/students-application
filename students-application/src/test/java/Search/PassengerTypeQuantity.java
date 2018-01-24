
package Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PassengerTypeQuantity {

    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Quantity")
    @Expose
    private String quantity;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
