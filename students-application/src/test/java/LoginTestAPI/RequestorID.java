
package LoginTestAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestorID {

    @SerializedName("ID_Context")
    @Expose
    private String ID_Context;
    @SerializedName("Instance")
    @Expose
    private String Instance;

    public String getID_Context() {
        return ID_Context;
    }

    public void setID_Context(String ID_Context) {
        this.ID_Context = ID_Context;
    }

    public String getInstance() {
        return Instance;
    }

    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

}
