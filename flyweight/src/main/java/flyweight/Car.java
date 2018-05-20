package flyweight;

/**
 * Created by dawid on 20.05.18.
 */
public class Car implements IVehicle {

    public Car() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void drive() {
        System.out.println("car");
    }
}
