package com.hillel.homework.homework13;

import java.util.*;

public class Class1 {

    private List newList1;
    private Set newSet1;
    private Map newMap1;

    public Class1() {
    }

    public List getNewList1() {
        return newList1;
    }

    public void setNewList1(List newList1) {
        this.newList1 = newList1;
    }

    public Set getNewSet1() {
        return newSet1;
    }

    public void setNewSet1(Set newSet1) {
        this.newSet1 = newSet1;
    }

    public Map getNewMap1() {
        return newMap1;
    }

    public void setNewMap1(Map newMap1) {
        this.newMap1 = newMap1;
    }

    @Override
    public String toString() {
        return "Task2Class1{" +
                "newList1=" + newList1 +
                ", newSet1=" + newSet1 +
                ", newMap1=" + newMap1 +
                '}';
    }
}
