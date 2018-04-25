package pl.training.designpattern.abstractfactory;

import pl.training.designpattern.product.ISteeringWheel;
import pl.training.designpattern.product.IWheel;

public interface IVehicleAbstractFactory {

    ISteeringWheel createSteeringWheel();
    IWheel createWheel();
}
