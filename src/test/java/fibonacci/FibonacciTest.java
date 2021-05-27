package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void testFibonacci() {
        assertEquals(fib(0), 0);
    }
}
