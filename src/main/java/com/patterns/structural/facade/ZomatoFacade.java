package com.patterns.structural.facade;

public class ZomatoFacade {

    private DeliveryBoy deliveryBoy;
    private DeliveryTeam deliveryTeam;
    private Restorant restorant;

    public ZomatoFacade() {
        this.deliveryBoy = new DeliveryBoy();
        this.deliveryTeam = new DeliveryTeam();
        this.restorant = new Restorant();
    }

    public void placeOrder(){
        restorant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
        deliveryBoy.pickUpOrder();
        deliveryBoy.deliverOrder();
    }
}
