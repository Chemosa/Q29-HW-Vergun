package tms.lesson7.services.impl;

import tms.lesson7.domain.Order;
import tms.lesson7.services.interfaces.CookingOrder;

public class CookingOrderImpl implements CookingOrder {

    @Override
    public void cookingMessage(Order order) {
        CookingOrder.super.cookingMessage(order);
    }
}
