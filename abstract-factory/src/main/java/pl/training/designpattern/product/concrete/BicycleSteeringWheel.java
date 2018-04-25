package pl.training.designpattern.product.concrete;

import pl.training.designpattern.product.ISteeringWheel;

public class BicycleSteeringWheel implements ISteeringWheel {

    @Override
    public boolean changeDirection() {
        return false;
    }
}
