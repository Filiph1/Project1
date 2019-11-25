import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class VendingTest
{
    @Test
    void shouldCallStartMethod() {
        Vending v = Mockito.mock(Vending.class);
        AbstractVending av = Mockito.mock(AbstractVending.class);
        Mockito.when(v.start()).thenCallRealMethod();
        Mockito.when(av.start()).thenCallRealMethod();
        assertEquals("Starting process", v.start());
        assertEquals("Starting process", av.start());
    }

    @Test
    void shouldCallStopMethod() {
        Vending v = Mockito.mock(Vending.class);
        AbstractVending av = Mockito.mock(AbstractVending.class);
        Mockito.when(v.stop()).thenCallRealMethod();
        Mockito.when(av.stop()).thenCallRealMethod();
        assertEquals("Stopping process", v.stop());
        assertEquals("Stopping process", av.stop());
    }

    @Test
    void shouldCallStringMethod() {
        AbstractVending av = Mockito.mock(AbstractVending.class);
        Mockito.when(av.toString()).thenCallRealMethod();
        assertEquals("Vending processes", av.toString());
    }
}
