package tms.lesson7.services.interfaces;

import tms.lesson7.domain.Order;

public interface CookingOrder {

    default void cookingMessage (Order order) {
        System.out.println("Your order is cooking!");
    }
}
