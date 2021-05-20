package money.domain;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        this.amount = amount;
        currency = currency;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
