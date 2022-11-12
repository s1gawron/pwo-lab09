package pwo.lab09.composite;

import java.util.ArrayList;
import java.util.List;

public class WaterSystem implements WaterSystemInterface {

    protected final List<WaterSystemInterface> elements = new ArrayList<>();

    public final void addComponent(WaterSystem element) {
        elements.add(element);
    }

    @Override
    public void fill() {
        elements.forEach(WaterSystemInterface::fill);
    }

    @Override
    public void afterFill() {
        elements.forEach(WaterSystemInterface::afterFill);
    }

    @Override
    public void drain() {
        elements.forEach(WaterSystemInterface::drain);
    }

    @Override
    public void afterDrain() {
        elements.forEach(WaterSystemInterface::afterDrain);
    }

}
