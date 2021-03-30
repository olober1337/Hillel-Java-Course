package com.hillel.classwork.lesson3;

public class MethodsExample {

    static int staticVariable = 2021;

    public static void main(String[] args) {


//        int newYear = staticVariable + 1;
//
//        System.out.println();
//
//        int result = letsGetIntegerValueMethod();
//
//        int resultWithSignature = letsGetIntegerVelueMethodWithSignature(result);
//
//        System.out.println(result);
//
//        System.out.println(resultWithSignature);

        String friendMisha = "Misha";
        String friendIgor = "Igor";
        String friendAnna = "Anna";
        String friendZulfia = "Zulfia";

        String companyName = "friends company";

        int friendsQuantity = 9;

        reserveTableForFriends();

        reserveTableForFriends(friendMisha, friendIgor, friendAnna);

        reserveTableForFriends(companyName, friendsQuantity);

    }

    protected static int letsGetIntegerValueMethod() {
        int digit = 10;


        return digit;
    }



    private static void reserveTableForFriends(String...names){
        System.out.println("table for friends reserved");
    }

    private static void reserveTableForFriends(String friendsCompany, int quantity){
        System.out.println("table for friends reserved :" + quantity);
    }

    public static int letsGetIntegerVelueMethodWithSignature(int x){

        int a = x + 100;
        System.out.println(a);

        letsGetIntegerValueMethod();

        return a;
    }

    private int nonStaticExample(int year, String name){

        System.out.println(name);

        return year + 10;
    }
}
