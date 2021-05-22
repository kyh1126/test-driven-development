package money.domain;

public interface Expression {
    Money reduce(String currency);
}
