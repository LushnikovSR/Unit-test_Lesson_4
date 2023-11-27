package seminar;

import org.junit.jupiter.api.Test;
import seminar.database.DataProcessor;
import seminar.database.Database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class DataProcessorTest {
    @Test
    public void checkProcessDataFromDatabase() {
        DatabaseStub databaseStub = new DatabaseStub();
        DataProcessor dataProcessor = new DataProcessor(databaseStub);

        assertThat(dataProcessor.processData("sql")).hasSize(3);

        String[] temp = new String[]{"Data1", "Data2", "Data3"};
        assertThat(dataProcessor.processData("sql")).containsAll(Arrays.asList(temp));
    }

    public class DatabaseStub extends Database {
        public List<String> query(String sql) {
            // В реальной жизни здесь бы происходило обращение к базе данных.
            // Сейчас мы просто возвращаем фиктивные данные.
            List<String> fakeData = new ArrayList<>();
            fakeData.add("Data1");
            fakeData.add("Data2");
            fakeData.add("Data3");
            return fakeData;
        }
    }
}
