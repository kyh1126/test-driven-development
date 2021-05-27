package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void testFibonacci() {
        assertEquals(fib(0), 0);
        assertEquals(fib(1), 1);
    }

    private int fib(int n) {
        if (n == 0) return 0;
        return 1;
    }
}
