package Laba_2.Task_3.service;

import Laba_2.Task_2.ownServices.*;
import Laba_2.Task_2.*;

public class addSubject {
    public static void ToGroup(final Group group, final Subject newSubject) {
        for (final Student student : group.getStudents()) {
            if (getSubjectByName.withStudent(student, newSubject.getName()) == null) {//check for already added subject
                student.getSubjects().put(newSubject, null);
            }
        }
        if (getSubjectByName.withGroup(group, newSubject.getName()) == null)//check for already added subject
            group.getSubjects().add(newSubject);
        //            for(final Subject subject : student.getSubjects().keySet())
//                if(!(subject.getName() .equals(newSubject.getName()))) { //check for already added subject
//                   student.getSubjects().put(newSubject, null);
    }
}