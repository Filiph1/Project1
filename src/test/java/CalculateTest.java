import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class CalculateTest {

    @Test
    void shouldDivideByTwoCorrectly() {
        Calculate c = Mockito.mock(Calculate.class);
        Mockito.when(c.divide(5, 2)).thenCallRealMethod();
        assertEquals(2.5, c.divide(5, 2));
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero() {
        Calculate c = Mockito.mock(Calculate.class);
        Mockito.when(c.divide(10, 0)).thenCallRealMethod();
        Exception ex = assertThrows(ArithmeticException.class, () ->
                c.divide(10, 0));
        assertEquals("Divide by zero error", ex.getMessage());
    }
}
