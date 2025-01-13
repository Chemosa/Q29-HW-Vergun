package tms.lesson10;

import tms.lesson10.domain.Product;
import tms.lesson10.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        var productService = new ProductService();

        var apple = new Product("apple", 6, 50);
        var orange = new Product("orange", 10, 40);
        var banana = new Product("banana", 3, 100);
        var grape = new Product("grape", 18, 30);
        var pomelo = new Product("pomelo", 12, 30);
        var pomegranate = new Product("pomegranate", 7, 15);

        List<Product> productList = new ArrayList<>();

        productList.add(apple);
        productList.add(orange);
        productList.add(banana);
        productList.add(grape);
        productList.add(pomelo);

        productService.findByProductName(productList);
        productService.findProductByPrice(productList);
        productService.findAmount(productList);

        productList.add(3, pomegranate);

        System.out.println("In list: " + productList.size());
        System.out.println("Have the last added? " + productList.contains(pomegranate));
        System.out.println("List of products till the last added: " + productList.subList(0, 4));
        System.out.println("Reversed list: " + productList.reversed());









    }
}
