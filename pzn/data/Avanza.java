package pzn.data;

public class Avanza implements Car {
    public void driveCar() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }

    public void hasBrand() {
        System.out.println("Toyota");
    }

    public boolean isMaintenance() {
        return false;
    }
}
