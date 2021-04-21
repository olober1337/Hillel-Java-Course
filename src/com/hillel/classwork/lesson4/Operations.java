package com.hillel.classwork.lesson4;

public class Operations {
    public static void main(String[] args) {

//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        if (c>b) {
//            System.out.println("first if check is true");
//        } else if (b > a) {
//            System.out.println("second if check is true");
//        } else {
//            System.out.println("third if check is true");
//        }
//
//        if (a>b) {
//            System.out.println("first if check is true");
//        } else {
//            System.out.println("second if check is true");
//        }


        String [] cats = {"Kurzik", "Barsik", "Dexter", "Kotik", "Bizik"};

        int catsLength = cats.length;

        for (int a = 0; a < catsLength; a++) {
            String catName = cats[a];

            if ((!catName.startsWith("K") && catName.startsWith("B"))) {
                System.out.println("Dexter cat is found There u r !!!! : " + catName);
                break;
            } else if (catName.startsWith("K")) {
                System.out.println("Cat name starts with char K and his name is : " + catName);
            } else if (catName.startsWith("B")) {
                System.out.println("Cat name starts with char B and his name is : " + catName);
            }
        }
    }
}
