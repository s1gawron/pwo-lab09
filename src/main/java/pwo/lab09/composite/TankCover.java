package pwo.lab09.composite;

public class TankCover extends WaterSystem {

    @Override public void fill() {
        System.out.println("Pokrywa zdjęta");
        super.fill();
    }

    @Override public void afterFill() {
        System.out.println("Pokrywa założona");
        super.afterFill();
    }

    @Override public void drain() {
        super.drain();
    }

    @Override public void afterDrain() {
        super.afterDrain();
    }
}
