package flyweight;

/**
 * Created by dawid on 20.05.18.
 */
public class StartFlyweight {

    public static void main(String[] args) {
        System.out.println("StartFlyweight");
        FlyweightVehicleFactory flyweightVehicleFactory =  new FlyweightVehicleFactory();
        System.out.println("StartFlyweight getting first bicycle");
        flyweightVehicleFactory.getVehicle(VehicleType.Bicycle);
        System.out.println("StartFlyweight getting second bicycle");
        flyweightVehicleFactory.getVehicle(VehicleType.Bicycle);

    }
}
