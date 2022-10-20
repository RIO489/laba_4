package Laba_3.task1.persons;

import Laba_3.task1.items.Pair;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Buyer {
    private String name;
private Map<Pair,LocalDate> check;

    public Buyer(final String name, final  Map<Pair,LocalDate> history) {
        this.name = name;
        this.check = history;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Map<Pair, LocalDate> getCheck() {
        return check;
    }

    public void setCheck(final Map<Pair, LocalDate> check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", check=" + check +
                '}';
    }
    public String displayCheck(){
        return "Check = " + check;
    }

    public void getchecklist(final LocalDate time){
        final  Map<Pair,LocalDate> newCheck = new HashMap<>();
        newCheck.putAll(check);
        final List<LocalDate> newChecklist  = newCheck.values().stream().filter(t->t.equals(time)).collect(Collectors.toList());

        System.out.println(newChecklist);
    }
}
