package tms.lesson7.services.interfaces;

import tms.lesson7.domain.Order;

public interface SavingOrderToDB {

    void saveToDB (Order order);
}
