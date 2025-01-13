package tms.lesson10.services;

import tms.lesson10.domain.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {

    Scanner scan = new Scanner(System.in);

    public Product findByProductName (List<Product> productList) {

        System.out.println("Enter name of the product to find: ");
        String nameToFind = scan.next();

        Product findedProduct = null;

        for (Product product : productList) {
            if (product.getUnicName().equalsIgnoreCase(nameToFind)) {
                System.out.println("Product was found: " + product);
                findedProduct = product;
            }
        }
        if (findedProduct == null) {
            System.out.println("Nothing was found.");
        }
        return findedProduct;
    }


    public List<Product> findProductByPrice (List<Product> productList) {

        System.out.println("Enter the lower border of the price:");
        int border = scan.nextInt();
        List<Product> findedProductList = new ArrayList<>();

        for (Product product : productList) {
            if (product.getPrice() > border) {
               findedProductList.add(product);
            }
        }
        System.out.println("Products with price more then " + border + " were found: " + findedProductList);
        return findedProductList;
    }

    public int findAmount (List<Product> productList){

        int allProducts = 0;

        for (Product product : productList) {
            allProducts += product.getAmount();
        }
        System.out.println("Amount of all products is: " + allProducts);
        return allProducts;
    }

}
