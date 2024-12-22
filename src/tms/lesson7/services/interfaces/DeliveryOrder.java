package tms.lesson7.services.interfaces;

import tms.lesson7.domain.Order;

public interface DeliveryOrder {

    default void delivery (Order order) {
        System.out.println("You can take your order from our store by yourself.");
    }
}
