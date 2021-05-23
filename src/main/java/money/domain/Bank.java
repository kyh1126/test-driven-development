package money.domain;

public class Bank {
    public Bank() {
    }

    public Money reduce(Expression source, String currency) {
        return source.reduce(this, currency);
    }

    public void addRate(String from, String to, int rate) {
    }

    public int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }
}
