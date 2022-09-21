package Laba_2.Task_2;

import java.time.LocalDate;

public class Timetable {
    private LocalDate date;
    private Subject subject;

    public Timetable(final LocalDate date, final Subject subject) {
        this.date = date;
        this.subject = subject;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(final Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Timetable{" +
                ", subject=" + subject.getName() +
                ", date=" + date +
                '}';
    }
}
