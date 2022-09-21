package Laba_2.Task_2.ownServices;

import Laba_2.Task_2.*;

public class getStudent {
    private final Group group;
    private final String name;

    public getStudent(final Group group, final String name) {
        this.group = group;
        this.name = name;
    }

    public Student getStudentByName()
    {
        for(final Student student:group.getStudents()){
            if(student.getName().equals(name)){
                return student;
            }
        }
        System.out.println("Can`t find Student with this name");
        return null;
    }
}
