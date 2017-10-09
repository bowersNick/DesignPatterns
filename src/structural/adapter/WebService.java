package structural.adapter;

import org.json.JSONObject;

public class WebService {
    private String webHost;
    public WebService(String host)
    {
        this.webHost = host;
    }

    public JSONObject request(JSONObject json) {
        return json;
    }
}
