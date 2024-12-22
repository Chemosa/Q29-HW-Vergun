package tms.lesson7.services.interfaces;

public interface CookingOrder {

    default void cookingMessage () {
        System.out.println("Your order is cooking!");
    }
}
