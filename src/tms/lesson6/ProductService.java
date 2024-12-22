package tms.lesson6;

public class ProductService {

    public int sumPriceOfTypes (Product[] productList, Type prodType) {

        int priceOfType = 0;
        for (Product product : productList) {
            if (product.getType() == prodType) {
                priceOfType = priceOfType + product.getPrice();
            }
        }
        return priceOfType;

    }

    public int reportAmountInStock (Product[] productList, Type prodType) {
        int amount = 0;
        for (Product product : productList) {
            if (product.getType() == prodType && product.getInStock()) {
                amount = amount + 1;
            }
        }
        return amount;

    }



}
