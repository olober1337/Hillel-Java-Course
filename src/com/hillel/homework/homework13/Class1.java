package com.hillel.homework.homework13;

import java.util.*;

public class Class1 {

    private List newList;
    private Set newSet;
    private Map newMap;

    public Class1(List newList, Set newSet, Map newMap) {
        this.newList = newList;
        this.newSet = newSet;
        this.newMap = newMap;
    }

    public List getNewList() {
        return newList;
    }

    public void setNewList(List newList) {
        this.newList = newList;
    }

    public Set getNewSet() {
        return newSet;
    }

    public void setNewSet(Set newSet) {
        this.newSet = newSet;
    }

    public Map getNewMap() {
        return newMap;
    }

    public void setNewMap(Map newMap) {
        this.newMap = newMap;
    }

    @Override
    public String toString() {
        return "Task2Class1{" +
                "newList=" + newList +
                ", newSet=" + newSet +
                ", newMap=" + newMap +
                '}';
    }
}
