package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {

    @Test
    void testFibonacci() {
        assertEquals(fib(1), 1);
        assertEquals(fib(4), 3);
        assertThrows(IllegalArgumentException.class, () -> fib(-1));
    }

    private int fib(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
