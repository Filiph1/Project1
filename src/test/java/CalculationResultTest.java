import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculationResultTest
{
    private CalculationResult r;

    @BeforeEach
    public void setup() {
        r = new CalculationResult();
    }

    @Test
    public void shouldGetResultZeroAfterObjectInstantiation() {
        assertEquals(0.0, r.getResult());
    }

    @Test
    public void shouldMultiplyAndSetResult() {
        r.multiply(5.0, 5.0);
        assertEquals(25.0, r.getResult());
    }

    @Test
    public void shouldAddAndSetResult() {
        r.add(5.0, 6.0);
        assertEquals(11.0, r.getResult());
    }

    @Test
    public void shouldReturnTrueIfWithinTolerance() {
        CalculationResult r2 = new CalculationResult();
        assertEquals(true, r.withinTolerance(r2, 0.01));
    }

    @Test
    public void shouldReturnFalseIfNotWithinTolerance() {
        CalculationResult r2 = new CalculationResult();
        r2.add(1.5, 3);
        assertEquals(false, r.withinTolerance(r2, 0.05));
    }

    @Test
    public void shouldReturnStringZeroOfResultWhenNoCalculations() {
        assertEquals("Result: 0.0", r.toString());
    }

    @Test
    public void shouldReturnUpdateStringResultAfterModification() {
        r.add(3, 2);
        assertEquals("Result: 5.0", r.toString());
    }
}
