package pzn.data;

public interface Car extends Maintenance, Brand {
    void driveCar();

    int getTier();

    default boolean isBig() {
        return false;
    }
 }
