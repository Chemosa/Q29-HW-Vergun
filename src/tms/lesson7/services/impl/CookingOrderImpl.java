package tms.lesson7.services.impl;

import tms.lesson7.services.interfaces.CookingOrder;

public class CookingOrderImpl implements CookingOrder {

    @Override
    public void cookingMessage() {
        System.out.println("Your order is cooking!");
    }
}
