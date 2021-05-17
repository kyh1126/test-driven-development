package _1_money;

import money.domain.Dollar;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    @Disabled
    void testMultiplication_1() {
        Dollar five = new Dollar(5);
        five.times(2);
//        assertEquals(10, five.amount);
    }

    @Test
    @Disabled
    void testMultiplication_2() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
//        assertEquals(10, product.amount);

        product = five.times(3);
//        assertEquals(15, product.amount);
    }

    @Test
    void testEquality_3() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    void testMultiplication_4() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    void testMultiplication_5() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
