package id.ac.unikom.codelabs.economictrends.data;

/**
 * Created by codelabsunikom on 6/14/17.
 */

public class BaseDao {
    private int statusCode;
    private String message;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
