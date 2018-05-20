package flyweight;

/**
 * Created by dawid on 20.05.18.
 */
public class Bicycle implements IVehicle {

    public Bicycle() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void drive() {
        System.out.println("bicycle");
    }
}
