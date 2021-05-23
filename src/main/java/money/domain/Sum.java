package money.domain;

public class Sum implements Expression {
    public Expression augend;
    public Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String currency) {
        int amount = augend.reduce(bank, currency).amount + addend.reduce(bank, currency).amount;
        return new Money(amount, currency);
    }

    @Override
    public Expression times(int multiplier) {
        return null;
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
