package Laba_1.Task10.rooms;

import Laba_1.Task10.Room;

public class Kitchen extends  Room{

    private int fridge;
    private int table;

    public Kitchen(final int doors, final int windows, final String color, final int size, final int floor, final int fridge, final int table) {
        super(doors, windows, color, size, floor);
        this.fridge = fridge;
        this.table = table;
    }

    @Override
    public String toString() {
        return "Kitchen {" +
                "fridge = " + fridge +
                ", table = " + table + super.toString() +
                "}";
    }

    public int getFridge() {
        return fridge;
    }

    public void setFridge(final int fridge) {
        this.fridge = fridge;
    }

    public int getTable() {
        return table;
    }

    public void setTable(final int table) {
        this.table = table;
    }
}
