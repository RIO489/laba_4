package Laba_2.Task_2.ownServices;

import Laba_2.Task_2.*;

public class getStudentByName {
    public Student getStudentByName(final Group group, final String name)
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
