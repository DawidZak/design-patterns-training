package pl.training.designpattern.product.concrete;

import pl.training.designpattern.product.ISteeringWheel;

public class CarSteeringWheel implements ISteeringWheel{

    @Override
    public boolean changeDirection() {
        return false;
    }
}
