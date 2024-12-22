package tms.lesson6;

public class Product {

    private Type type;
    private int price;
    private String name;
    private boolean inStock;

    public Product(Type type, int price, String name, boolean inStock) {
        this.type = type;
        this.price = price;
        this.name = name;
        this.inStock = inStock;
    }

    public void setType (Type type) {
        this.type = type;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setInStock (boolean inStock) {
        this.inStock = inStock;
    }


    public Type getType() {
        return type;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public boolean getInStock() {
        return inStock;
    }


}
