package domain;

public class Customer {
    private GiftCard giftCard;
    private Point point;

    public Customer(GiftCard giftCard, Point point) {
        this.giftCard = giftCard;
        this.point = point;
    }

    public GiftCard getGiftCard() {
        return giftCard;
    }

    public void payFor(Product product) {
        product.payBy(giftCard);
        product.payBy(point);
    }
}
