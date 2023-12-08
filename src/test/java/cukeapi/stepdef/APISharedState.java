package cukeapi.stepdef;

import org.springframework.stereotype.Component;

import io.restassured.response.Response;

@Component
public class APISharedState {

    private Response response;
    private String baseURL;

    public String getBaseURL() {
        return baseURL;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

}
