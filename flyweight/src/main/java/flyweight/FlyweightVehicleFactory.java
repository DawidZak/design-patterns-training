package flyweight;

import java.util.HashMap;

/**
 * Created by dawid on 20.05.18.
 */
public class FlyweightVehicleFactory {

    private static final HashMap<VehicleType,IVehicle> vehicleMap = new HashMap<VehicleType, IVehicle>();

    public IVehicle getVehicle(VehicleType key){
        IVehicle vehicle = vehicleMap.get(key);
        if (vehicle == null) {
            if (VehicleType.Bicycle.equals(key)) {
                vehicleMap.put(key,new Bicycle());
            }else{
                vehicleMap.put(key,new Car());
            }
        }

        return vehicle;
    }
}
