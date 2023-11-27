package hw;

import org.junit.jupiter.api.Test;
import seminar.webserver.HttpClient;
import seminar.webserver.WebService;
import hw.book.BookService;
import hw.book.Book;
import hw.book.BookRepository;
import hw.book.InMemoryBookRepository;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BookServiceTest {
    @Test
    public void checkGetDataFromBookRepository(){
        BookRepository mockBookRepository = mock(BookRepository.class);
        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author2");
        List<Book> memory = new ArrayList<>();
        memory.add(book1);
        memory.add(book2);

        when(mockBookRepository.findById("1")).thenReturn(book1);
        when(mockBookRepository.findAll()).thenReturn(memory);

        BookService bookService = new BookService(mockBookRepository);

        assertThat(bookService.findBookById("1")).isEqualTo(book1);
        assertThat(bookService.findAllBooks()).isEqualTo(memory);
    }
}
