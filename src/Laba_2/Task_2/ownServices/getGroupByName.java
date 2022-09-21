package Laba_2.Task_2.ownServices;

import Laba_2.Task_2.*;


public class getGroupByName {
    public Group getGroupByName(final University university, final String name) {
        for (final Group group : university.getGroups()) {
            if (group.getName().equals(name)) {
                return group;
            }
        }
        System.out.println("Can`t find group with this name");
        return null;
    }
        }
