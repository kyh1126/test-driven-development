package money.domain;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public String currency() {
        return "CHF";
    }
}
