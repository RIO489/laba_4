package Laba_1.Task10;

import Laba_1.Task10.rooms.*;

import java.util.List;

public class Task10_main {
    public static void main(final String[] args) {
 final House  home = new House(List.of(new Bedroom(1, 0, "Blue", 10 , 1 , 1),
         new Kitchen(1,2,"Yellow",20,1,2,1),
         new Livingroom(2,2,"Green",30,1,2)));

        System.out.println(home);
    }
}
