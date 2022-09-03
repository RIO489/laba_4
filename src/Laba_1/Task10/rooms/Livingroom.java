package Laba_1.Task10.rooms;

import Laba_1.Task10.Room;

public class Livingroom extends Room {
    private int sofa;

    public Livingroom(final int doors, final int windows, final String color, final int size, final int floor, final int sofa) {
        super(doors, windows, color, size, floor);
        this.sofa = sofa;
    }

    @Override
    public String toString() {
        return "Livingroom{" +
                "sofa=" + sofa +
                '}';
    }

    public int getSofa() {
        return sofa;
    }

    public void setSofa(final int sofa) {
        this.sofa = sofa;
    }
}
