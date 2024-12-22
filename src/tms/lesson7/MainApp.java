package tms.lesson7;

import tms.lesson7.domain.Order;
import tms.lesson7.services.TypeOfDelevery;
import tms.lesson7.services.TypeOfReceived;
import tms.lesson7.services.impl.*;
import tms.lesson7.services.interfaces.WholeCycle;

public class MainApp {

    public static void main(String[] args) {

        Order order1 = new Order("Pizza Margareth", TypeOfReceived.ONLINE, TypeOfDelevery.TO_CLIENT);
        Order order2 = new Order("Cheeseburger", TypeOfReceived.BY_PHONE, TypeOfDelevery.FROM_STORE);


        WholeCycle orderCycle = new WholeCycleImpl(
                new ReceivedOnlineImpl(),
                new SaveImpl(),
                new CookingOrderImpl(),
                new DeliveryOrderClientImpl()
        );

        WholeCycle order2Cycle = new WholeCycleImpl(
                new ReceivedByPhoneImpl(),
                new SaveImpl(),
                new CookingOrderImpl(),
                new DeliveryOrderStoreImpl()
        );

        orderCycle.orderHandle(order1);
        System.out.println("----------------------------");
        order2Cycle.orderHandle(order2);




    }
}
