package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FibonacciTest {

    @Test
    void testFibonacci() {
        assertEquals(1, fib(1));
        assertEquals(3, fib(4));
        assertThrows(IllegalArgumentException.class, () -> fib(-1));
    }

    private int fib(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
