package com.hillel.homework.homework13;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class2 extends Class1 {

    private List newList2;
    private Set newSet2;
    private Map newMap2;

    public List getNewList2() {
        return newList2;
    }

    public void setNewList2(List newList2) {
        this.newList2 = newList2;
    }

    public Set getNewSet2() {
        return newSet2;
    }

    public void setNewSet2(Set newSet2) {
        this.newSet2 = newSet2;
    }

    public Map getNewMap2() {
        return newMap2;
    }

    public void setNewMap2(Map newMap2) {
        this.newMap2 = newMap2;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "newList2=" + newList2 +
                ", newSet2=" + newSet2 +
                ", newMap2=" + newMap2 +
                '}';
    }
}
