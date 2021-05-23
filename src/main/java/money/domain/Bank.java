package money.domain;

public class Bank {
    public Bank() {
    }

    public Money reduce(Expression source, String currency) {
        return source.reduce(currency);
    }

    public void addRate(String from, String to, int rate) {
    }
}
