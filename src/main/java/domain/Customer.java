package domain;

public class Customer {
    private Money money;

    public Customer(GiftCard giftCard, Point point) {
        this.money = new Money(giftCard, point);
    }

    public void payFor(Product product) {
        product.payBy(money);
    }
}
