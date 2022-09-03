package Laba_1.Task10.rooms;

import Laba_1.Task10.Room;

public class Bedroom extends Room {
    private int Bed;

    public Bedroom(final int doors, final int windows, final String color, final int size, final int floor, final int bed) {
        super(doors, windows, color, size, floor);
        Bed = bed;
    }

    @Override
    public String toString() {
        return "Bedroom {" +
                "Bed = " + Bed + super.toString() +
                " }";
    }

    public int getBed() {
        return Bed;
    }

    public void setBed(final int bed) {
        Bed = bed;
    }
}
