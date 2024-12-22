package tms.lesson7.services.impl;

import tms.lesson7.domain.Order;
import tms.lesson7.services.interfaces.ReceivingOrder;

public class ReceivedByPhoneImpl implements ReceivingOrder {

    @Override
    public void receiveOrder(Order order) {
        System.out.println("Your order was received " + order.getTypeOfRecOrder());
    }
}
