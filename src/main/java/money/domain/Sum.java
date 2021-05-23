package money.domain;

public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String currency) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, currency);
    }
}
