package pl.training.designpattern.product.concrete;

import pl.training.designpattern.product.IWheel;

public class BicycleWheel implements IWheel{

    @Override
    public boolean inflate() {
        return false;
    }
}
