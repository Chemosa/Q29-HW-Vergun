package tms.lesson6;

public class MainApp {

    public static void main(String[] args) {

        Product [] productList = {
                new Product(Type.MOBILE, 3500, "iPhone 16", true),
                new Product(Type.TV, 12000, "LG OLED", false),
                new Product(Type.AUDIO, 100, "earphones Sony", true),
                new Product(Type.MOBILE, 1300, "Realme GT Master Edition", true),
                new Product(Type.TV, 1000, "Samsung 24 inch", false),
                new Product(Type.TV, 200, "Horizont 2000", true)
        };

        ProductService prodService = new ProductService();

        int sumPrice = prodService.sumPriceOfTypes(productList, Type.MOBILE);
        System.out.println(sumPrice);
        int amountInStock = prodService.reportAmountInStock(productList, Type.MOBILE);
        System.out.println(amountInStock);



    }
}
