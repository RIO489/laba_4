package Laba_2.Task_2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task_2 {
    public static void main(final String[] args) {

        final Subject subject1 = new Subject("Math");
        final Subject subject2 = new Subject("Java");
        final Subject subject3 = new Subject("PE");
        final HashMap<Subject, Integer> map = new HashMap<Subject, Integer>();

        final Timetable timetable1 = new Timetable(LocalDate.of(2021,9,22),subject1);
        final Timetable timetable2 = new Timetable(LocalDate.of(2021,9,23),subject2);
        final Timetable timetable3 = new Timetable(LocalDate.of(2021,9,22),subject3);
        final Timetable timetable4 = new Timetable(LocalDate.of(2021,9,23),subject1);

        final Group group1 = new Group(new ArrayList<>(), "IT-21", Stream.of(subject1, subject2, subject3).collect(Collectors.toList()),Stream.of(timetable1,timetable2).collect(Collectors.toList()));
        final Group group2 = new Group(new ArrayList<>(), "IT-22", Stream.of(subject1, subject2, subject3).collect(Collectors.toList()),Stream.of(timetable3,timetable4).collect(Collectors.toList()));

        final Student student1 = new Student("Arsen", group1, map);
        addSubjectToStudent(student1, 99);

        final Student student2 = new Student("Senya", group1, map);
        addSubjectToStudent(student2, 88);

        final Student student3 = new Student("Maks", group2, map);
        addSubjectToStudent(student3, 79);

        final Student student4 = new Student("Sanya", group2, map);
        addSubjectToStudent(student4, 100);

        group1.getStudents().addAll(Stream.of(student1,student2).collect(Collectors.toList()));
        group2.getStudents().addAll(Stream.of(student3,student4).collect(Collectors.toList()));

        final University university = new University(new ArrayList<>());
        university.setGroups(Stream.of(group1,group2).collect(Collectors.toList()));
        System.out.println(university);
    }

    public static void addSubjectToStudent(final Student student, final int mark) {
        student.getSubjects().put(new Subject("Math"), mark);
        student.getSubjects().put(new Subject("Java"), mark);
        student.getSubjects().put(new Subject("PE"), mark);
    }

    ;
}
