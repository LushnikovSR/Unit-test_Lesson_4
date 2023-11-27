package seminar;

import org.junit.jupiter.api.Test;
import seminar.weather.WeatherReporter;
import seminar.weather.WeatherService;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WeatherReporterTest {
    @Test
    public void checkReportResult(){
        WeatherService mockWeatherService = mock(WeatherService.class);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(22);
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);
        assertThat(weatherReporter.generateReport()).isEqualTo("Текущая температура: 22 градусов.");
    }
}
