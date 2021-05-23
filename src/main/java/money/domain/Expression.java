package money.domain;

public interface Expression {
    Money reduce(Bank bank, String to);
}
