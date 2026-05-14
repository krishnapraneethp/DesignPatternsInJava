package creational.factory.factoryitems;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if(type != null) {
            if(type.equalsIgnoreCase("Car")) {
                return new Car();
            } else if(type.equalsIgnoreCase("Bike")) {
                return new Bike();
            }
        }
        return null;
    }
}