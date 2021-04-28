package com.hillel.homework.homework13;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class3 extends Class2 {

    private List newList3;
    private Set newSet3;
    private Map newMap3;

    public List getNewList3() {
        return newList3;
    }

    public void setNewList3(List newList3) {
        this.newList3 = newList3;
    }

    public Set getNewSet3() {
        return newSet3;
    }

    public void setNewSet3(Set newSet3) {
        this.newSet3 = newSet3;
    }

    public Map getNewMap3() {
        return newMap3;
    }

    public void setNewMap3(Map newMap3) {
        this.newMap3 = newMap3;
    }

    @Override
    public String toString() {
        return "Class3{" +
                "newList3=" + newList3 +
                ", newSet3=" + newSet3 +
                ", newMap3=" + newMap3 +
                '}';
    }
}
