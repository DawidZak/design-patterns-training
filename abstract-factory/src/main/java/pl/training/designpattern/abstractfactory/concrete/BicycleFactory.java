package pl.training.designpattern.abstractfactory.concrete;

import pl.training.designpattern.abstractfactory.IVehicleAbstractFactory;
import pl.training.designpattern.product.ISteeringWheel;
import pl.training.designpattern.product.IWheel;

public class BicycleFactory implements IVehicleAbstractFactory {

    @Override
    public ISteeringWheel createSteeringWheel() {
        //some code
        return null;
    }

    @Override
    public IWheel createWheel() {
        //somecode
        return null;
    }
}
