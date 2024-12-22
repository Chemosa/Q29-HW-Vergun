package tms.lesson7.domain;

import tms.lesson7.services.TypeOfDelevery;
import tms.lesson7.services.TypeOfReceived;

public class Order {

    private String orderName;
    private TypeOfDelevery typeOfDeliv;
    private TypeOfReceived typeOfRecOrder;

    public Order (String orderName,
                  TypeOfReceived typeOfRecOrder,
                  TypeOfDelevery typeOfDeliv) {
        this.orderName = orderName;
        this.typeOfRecOrder = typeOfRecOrder;
        this.typeOfDeliv = typeOfDeliv;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public TypeOfDelevery getTypeOfDeliv() {
        return typeOfDeliv;
    }

    public void setTypeOfDeliv(TypeOfDelevery typeOfDeliv) {
        this.typeOfDeliv = typeOfDeliv;
    }

    public TypeOfReceived getTypeOfRecOrder() {
        return typeOfRecOrder;
    }

    public void setTypeOfRecOrder(TypeOfReceived typeOfRecOrder) {
        this.typeOfRecOrder = typeOfRecOrder;
    }
}



