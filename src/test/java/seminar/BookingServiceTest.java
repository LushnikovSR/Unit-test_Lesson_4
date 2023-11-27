package seminar;

import org.junit.jupiter.api.Test;
import seminar.hotel.BookingService;
import seminar.hotel.HotelService;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class BookingServiceTest {
    @Test
    public void bookingHotelRoom(){
        HotelService mockHotelService = mock(HotelService.class);
        when(mockHotelService.isRoomAvailable(2)).thenReturn(true);
        BookingService bookingService = new BookingService(mockHotelService);
        assertTrue(bookingService.bookRoom(2));
    }

//    @Test
//    public void deniedBookingHotelRoom(){
//        HotelService mockHotelService = mock(HotelService.class);
////        when(mockHotelService.isRoomAvailable(4)).thenReturn(false);
//        BookingService bookingService = new BookingService(mockHotelService);
//        assertFalse(bookingService.bookRoom(4));
//    }
}
