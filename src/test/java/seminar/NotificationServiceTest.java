package seminar;

import org.junit.jupiter.api.Test;
import seminar.message.NotificationService;
import seminar.message.MessageService;

import static org.mockito.Mockito.*;

public class NotificationServiceTest {
    @Test
    public void checkMessageSending(){
        MessageService mockMessageService = mock(MessageService.class);
//        when(mockMessageService.sendMessage("Hello dear friend", "John")).thenReturn("");
        NotificationService notificationService = new NotificationService(mockMessageService);
        notificationService.sendNotification("Hello dear friend", "John");
        verify(mockMessageService, times(1)).
                sendMessage("Hello dear friend", "John");
    }
}
