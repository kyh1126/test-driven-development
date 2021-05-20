package money.domain;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        this.amount = amount;
        currency = currency;
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
