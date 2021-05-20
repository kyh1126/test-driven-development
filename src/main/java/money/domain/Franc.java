package money.domain;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        this.amount = amount;
        currency = currency;
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
