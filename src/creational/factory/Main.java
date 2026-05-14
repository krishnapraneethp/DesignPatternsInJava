package creational.factory;

import creational.factory.factoryitems.Vehicle;
import creational.factory.factoryitems.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        Vehicle bike = VehicleFactory.getVehicle("bike");

        car.start();
        bike.start();
    }
}
