package seminar.webserver;

public class WebService {
    private HttpClient httpClient;

    public WebService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String getAnswer(String url){
        String answer = httpClient.get(url);
        return answer;
    }

}
