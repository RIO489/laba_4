package Laba_2.Task_3.service;

import Laba_2.Task_2.*;

import java.util.Comparator;

public class sortStudents {
    public static void inAlphabetOrder(final University university) {
        //final List<Student> list = new ArrayList<>();
        for (final Group group : university.getGroups()) {
            group.getStudents().sort(Comparator.comparing(Student::getName));

            //list.addAll(group.getStudents().sort(Comparator.comparing(Student::getName)));
        }
//        list.addAll(group.getStudents().stream().filter(( e -> e.getName())
//         ).collect(Collectors.toList()));
        //return list;
    }
}

