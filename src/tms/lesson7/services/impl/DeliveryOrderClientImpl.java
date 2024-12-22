package tms.lesson7.services.impl;

import tms.lesson7.domain.Order;
import tms.lesson7.services.interfaces.DeliveryOrder;

public class DeliveryOrderClientImpl implements DeliveryOrder {

    @Override
    public void delivery(Order order) {
        System.out.println("Your " + order.getOrderName() + " will be delivered to home!");
    }
}
