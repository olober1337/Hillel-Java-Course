package com.hillel.homework.homework10;

public interface ImproveHabitats extends DevelopCity {

    default void habitat () {
        System.out.println("You've built a new house for your citizens!!!");
    }

    default void clothes () {
        System.out.println("Your citizens have new clothes!!!");
    }
}
