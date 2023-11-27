package seminar;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

import java.util.Iterator;

public class IteratorMockExample {
    @Test
    public void mockIterator(){
        Iterator mockIterator = mock(Iterator.class);
        when(mockIterator.next()).thenReturn("Hello").thenReturn("World!");
        String result = mockIterator.next() + " " + mockIterator.next();
        assertThat(result).isEqualTo("Hello World!");
    }

}
