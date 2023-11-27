package seminar;

import org.junit.jupiter.api.Test;
import seminar.webserver.HttpClient;
import seminar.webserver.WebService;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WebServiceTest {
    @Test
    public void checkServerAnswer(){
        HttpClient mockHttpClient = mock(HttpClient.class);
        when(mockHttpClient.get("url_address1")).thenReturn("200");
        WebService webService = new WebService(mockHttpClient);
        assertThat(webService.getAnswer("url_address1")).isEqualTo("200");
    }
}
