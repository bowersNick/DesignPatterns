package structural.adapter;
import org.json.JSONObject;

// target interface with adapter class
public class WebAdapter implements WebRequester {
    private WebService service;

    @Override
    public int request(Object object) {
        JSONObject result = this.toJson(object);
        JSONObject reponse = service.request(result);
        if (reponse != null)
        {
            return 200; // OK status code
        }
        return 500; // Server error status code
    }

    public void connect(WebService webService) {
        this.service = webService;
        /* Connect to the web service */
    }

    private JSONObject toJson(Object object) {
        // ... some code
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("test", "new");
        return jsonObject;
    }
}
