package Laba_1.Task10;

import java.util.List;

public class House {
private List<Room> rooms;

    @Override
    public String toString() {
        return "House { " +
                ", rooms = " + rooms +
                " }";
    }

    public House(final List<Room> rooms)
{
    this.rooms = rooms;
}
    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }
}
