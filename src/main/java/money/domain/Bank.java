package money.domain;

public class Bank {
    public Bank() {
    }

    public Money reduce(Expression source, String currency) {
        Sum sum = (Sum) source;
        return sum.reduce(currency);
    }
}
