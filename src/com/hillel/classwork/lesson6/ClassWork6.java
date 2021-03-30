package com.hillel.classwork.lesson6;

public class ClassWork6 {

    public static void main(String[] args) {


//        String name = "Vadym";
//
//        String myNameAndSurname = name + "Sukhetskyi";
//
////      name + "Sukhetskyi";
//
//        String myString  = new String("My test data String");
//        String myTestString  = new String("Test");
//
//        int myStringLength = myString.length();
//        int myTestStringLength = myTestString.length();
//
//        System.out.println("My string length is : " + myStringLength);
//        System.out.println("My string length is : " + myTestStringLength);
//
//        char [] myStringCharArray = myString.toCharArray();
//
//        System.out.println("myStringCharArray value :");
//        System.out.println(myStringCharArray.toString());
//
//        String myTestStringToTrim = "  My test trim string ";
//
//        System.out.println("trimmed without new String object\n");
//        System.out.println(myTestStringToTrim.trim());
//        System.out.println("trimmed without new String object length : " + myTestStringToTrim.trim().length());
//
//        String myTestStringTrimmed = myTestStringToTrim.trim();
//        System.out.println("trimmed without new String object\n");
//        System.out.println(myTestStringTrimmed);
//        System.out.println("trimmed with new String object length : " + myTestStringTrimmed.trim().length());
//
//        String nullString = null;
//        String noCharsValueString = " ";
//
//        boolean isEmptyNullString = nullString == null;
//        boolean isEmptyoCharsValueString = nullString == null;
//
////        boolean isEmptyMethodNullString = nullString.isEmpty();
//        boolean isEmptyMethodCharsValueString = noCharsValueString.isEmpty();
//
//        System.out.println("just pause for break points\n");
//
//        Boolean logicValue = true;
//        System.out.println(String.valueOf(logicValue));
//
//        System.out.println("String value :");
//        System.out.println(myTestString);
//
//        char mySimpleStringCharCharValue = myTestString.charAt(2);
//        int mySimpleStringCharIndexValue = myTestString.indexOf('s');
//
//
//        System.out.println(myTestString);
//
//        String firstStringToTestEquals = "My test String";
//        String firstStringToTestEquals2 = "My test String";
//        String secondStringToTestEquals = "My test string";
//
//
//        boolean isEqualFirstStringToSecondString = firstStringToTestEquals.equals(secondStringToTestEquals);
//        boolean isEqualFirstStringToSameFirstButAnotherObjectString = firstStringToTestEquals.equals(firstStringToTestEquals2);
//        boolean isEqualFirstStringToSecondStringIgnoreCase = firstStringToTestEquals.equalsIgnoreCase(firstStringToTestEquals2);
//
//        System.out.println("breakpoint pause");

        String testStringForSubstring = "my test substring string";

        /*System.out.println("Test substring \n");
        System.out.println(testStringForSubstring.substring(3));
        System.out.println(testStringForSubstring.substring(3, 7));
*/

        String upperCaseString = testStringForSubstring.toUpperCase();

        System.out.println(upperCaseString);

    }
}
