package _1_money;

import money.domain.Money;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    @Disabled
    void testMultiplication_1() {
//        Dollar five = new Dollar(5);
//        five.times(2);
//        assertEquals(10, five.amount);
    }

    @Test
    @Disabled
    void testMultiplication_2() {
//        Dollar five = new Dollar(5);
//        Dollar product = five.times(2);
//        assertEquals(10, product.amount);

//        product = five.times(3);
//        assertEquals(15, product.amount);
    }

    @Test
    @Disabled
    void testEquality_3() {
//        assertTrue(new Dollar(5).equals(new Dollar(5)));
//        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    @Disabled
    void testMultiplication_4() {
//        Dollar five = new Dollar(5);
//        assertEquals(new Dollar(10), five.times(2));
//        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    @Disabled
    void testMultiplication_5() {
//        Franc five = new Franc(5);
//        assertEquals(new Franc(10), five.times(2));
//        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    @Disabled
    void testEquality_6() {
//        assertTrue(new Franc(5).equals(new Franc(5)));
//        assertFalse(new Franc(5).equals(new Franc(6)));
    }

    @Test
    @Disabled
    void testEquality_7() {
//        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    void testMultiplication_8() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    @Disabled
    void testFrancMultiplication_8() {
//        Money five = Money.franc(5);
//        assertEquals(Money.franc(10), five.times(2));
//        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void testEquality_8() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    void testCurrency_9() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    @Disabled
    void testDifferentClassEquality_10() {
//        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }
}
