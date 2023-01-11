package domain;

public class Product {
    private int price;
    private int stock;

    public Product(final int price, final int stock) {
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    private boolean isSoldOut() {
        return stock < 5;
    }

    private boolean isPriceUnderMinimum() {
        return price < 1000;
    }

    private void minusStock() {
        if (isSoldOut() && isPriceUnderMinimum()) {
            throw new RuntimeException("주문할 수 없는 상품입니다.");
        }
        stock -= 1;
    }

    public void payBy(Money money) {
        money.minus(price);
    }

    public void sellTo(Customer customer) {
        // 상품 관리 로직
        minusStock();

        // 상품 결제 로직
        customer.payFor(this);
    }
}
