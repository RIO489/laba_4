package Laba_2.Task_2;

import java.util.List;

public class Group {
    private List<Student> students;
    private String name;

    private List<Subject> subjects;

    public Group(final List<Student> students, final String name, final List<Subject> subjects) {
        this.students = students;
        this.name = name;
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n" + "Group{" +
                ", name='" + name + '\'' + ",\n"+
                "students=" + students + ",\n"+
                "Group`s subjects=" + subjects +
                '}';
    }
}
