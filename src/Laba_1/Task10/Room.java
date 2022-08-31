package Laba_1.Task10;

public class Room {
    private int doors;
    private int windows;
    private String color;
    private int size;

    public Room(final int doors,final int windows,final String color,final int size)
    {
        this.color = color;
        this.size = size;
        this.windows = windows;
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(final int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(final int windows) {
        this.windows = windows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }
}
