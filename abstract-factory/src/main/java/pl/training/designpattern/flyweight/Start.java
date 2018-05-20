package pl.training.designpattern.flyweight;

/**
 * Created by dawid on 20.05.18.
 */
public class Start {

    public static void main(String[] args) {
        System.out.println("Start");
        FlyweightVehicleFactory flyweightVehicleFactory =  new FlyweightVehicleFactory();
        System.out.println("Start getting first bicycle");
        flyweightVehicleFactory.getVehicle(VehicleType.Bicycle);
        System.out.println("Start getting second bicycle");
        flyweightVehicleFactory.getVehicle(VehicleType.Bicycle);

    }
}
