import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FibonacciTest {

    public Fibonacci fibonacci;

    @BeforeEach
    public void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void numberIsNegative() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }

    @Test
    public void numberIsZero() {
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);
        assertEquals(expectedValue, obtainedValue);
    }
}
