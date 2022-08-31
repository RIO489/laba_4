package Laba_1.Task10;

import java.util.List;

public class House {
private int size;
private List<Room> rooms;

public House(final int size,final List<Room> rooms)
{
    this.rooms = rooms;
    this.size = size;
}

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }
}
