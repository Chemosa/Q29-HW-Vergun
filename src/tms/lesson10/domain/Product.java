package tms.lesson10.domain;

public class Product {

    private String unicName;
    private int price;
    private int amount;

    public Product(String unicName, int price, int amount) {
        this.unicName = unicName;
        this.price = price;
        this.amount = amount;
    }

    public String getUnicName() {
        return unicName;
    }

    public void setUnicName(String unicName) {
        this.unicName = unicName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return getUnicName() + ": price: " + getPrice() + "; amount: " + getAmount() ;
    }


}
