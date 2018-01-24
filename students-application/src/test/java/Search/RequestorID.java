
package Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestorID {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("MessagePassword")
    @Expose
    private String messagePassword;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getMessagePassword() {
        return messagePassword;
    }

    public void setMessagePassword(String messagePassword) {
        this.messagePassword = messagePassword;
    }

}
