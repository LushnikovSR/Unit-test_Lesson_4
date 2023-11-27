package seminar;

import seminar.card.CreditCard;
import seminar.card.PaymentForm;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class PaymentFormTest {
    @Test
    public void checkFormFunctional(){
        CreditCard mockCreditCard = mock(CreditCard.class);
        when(mockCreditCard.getCardNumber()).thenReturn("1234123412341234");
        when(mockCreditCard.getCardHolder()).thenReturn("Petr Petrovich");
        when(mockCreditCard.getExpiryDate()).thenReturn("01/20");
        when(mockCreditCard.getCvv()).thenReturn("777");

        PaymentForm paymentForm = new PaymentForm(mockCreditCard);

        paymentForm.pay(300);

        verify(mockCreditCard, times(1)).charge(500);
    }
}
