import org.junit.jupiter.api.BeforeEach;

public class FibonacciTest {

    public Fibonacci fibonacci;

    @BeforeEach
    public void init() {
        fibonacci = new Fibonacci();
    }
}
