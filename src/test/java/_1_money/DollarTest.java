package _1_money;

import money.domain.Bank;
import money.domain.Expression;
import money.domain.Money;
import money.domain.Sum;
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

    @Test
    void testSimpleAddition_11() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);

        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    void testPlusReturnsSum_13() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    void testReduceSum_13() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    void testReduceMoney_13() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    void testReduceMoneyDifferentCurrency_14() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    void testArrayEquals_14() {
        assertNotEquals(new Object[]{"abc"}, new Object[]{"abc"});
    }

    @Test
    void testIdentityRate_14() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    void testMixedAddition_15() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        assertEquals(Money.dollar(10), result);
    }

    @Test
    void testSumPlusMoney_16() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Expression sum = new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(15), result);
    }

    @Test
    void testSumTimes_16() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);

        Expression sum = new Sum(fiveBucks, tenFrancs).times(2);
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(20), result);
    }

    @Test
    @Disabled
    void testPlusSameCurrencyReturnsMoney_16() {
        Expression sum = Money.dollar(1).plus(Money.dollar(1));
        assertTrue(sum instanceof Money);
    }
}
