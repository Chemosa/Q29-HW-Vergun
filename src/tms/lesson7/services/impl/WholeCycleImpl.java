package tms.lesson7.services.impl;

import tms.lesson7.domain.Order;
import tms.lesson7.services.interfaces.*;

public class WholeCycleImpl implements WholeCycle {

    private ReceivingOrder recOrder;
    private SavingOrderToDB saveToDB;
    private CookingOrder cookOrder;
    private DeliveryOrder delivery;

    public WholeCycleImpl(ReceivingOrder recOrder, SavingOrderToDB saveToDB, CookingOrder cookOrder, DeliveryOrder delivery) {
        this.recOrder = recOrder;
        this.saveToDB = saveToDB;
        this.cookOrder = cookOrder;
        this.delivery = delivery;
    }

    @Override
    public void OrderHandle(Order order) {

        recOrder.receiveOrder(order);
        saveToDB.saveToDB(order);
        cookOrder.cookingMessage();
        delivery.delivery(order);

    }
}
