package seminar.webserver;

public class HttpClient {
    public String get(String url){
        // какая-то логика получения ответа сервера с url адреса
        if (url.length() % 2 == 0){
            return "200";
        }
        return "404";
    }
}
