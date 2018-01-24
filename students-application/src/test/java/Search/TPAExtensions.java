
package Search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TPAExtensions {

    @SerializedName("searchPreferencesExtensions")
    @Expose
    private SearchPreferencesExtensions searchPreferencesExtensions;

    public SearchPreferencesExtensions getSearchPreferencesExtensions() {
        return searchPreferencesExtensions;
    }

    public void setSearchPreferencesExtensions(SearchPreferencesExtensions searchPreferencesExtensions) {
        this.searchPreferencesExtensions = searchPreferencesExtensions;
    }

}
