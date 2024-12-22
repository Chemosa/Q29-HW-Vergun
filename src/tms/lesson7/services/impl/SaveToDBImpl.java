package tms.lesson7.services.impl;

import tms.lesson7.domain.Order;
import tms.lesson7.services.interfaces.SavingOrderToDB;

public class SaveToDBImpl implements SavingOrderToDB {

    @Override
    public void saveToDB(Order order) {
        System.out.println("Order is added to DB: ");
        System.out.println("Ordered: " + order.getOrderName());
        System.out.println("Received " + order.getTypeOfRecOrder());
        System.out.println("Delivery: " + order.getTypeOfDeliv());
    }
}
