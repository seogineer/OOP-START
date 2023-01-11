package domain;

public class Customer {
    private GiftCard giftCard;

    public Customer(final GiftCard giftCard) {
        this.giftCard = giftCard;
    }

    public GiftCard getGiftCard() {
        return giftCard;
    }

    public void payFor(Product product) {
        product.payBy(giftCard);
    }
}
