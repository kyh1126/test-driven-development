package _1_money;

import money.domain.Dollar;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DollarTest {

    @Test
    @Disabled
    void testMultiplication_1() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    void testMultiplication_2() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);

        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    void testEquality_3() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}
