package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Question 1");
        System.out.println("What is a function? What is it good for?\n "+
                "A function is a block of code which only runs when it is called and used to perform certain actions.\n" +
                "The input of those functions called “parameters”, we can pass as many parameters as we \n" +
                "want..\n"+
                " By using functions we can:- \n"+
                " Use the same block of code everywhere we want without rewrite it. \n"+
                " Run code only when something that we want happen (like pressing a button).\n"+
                " Keep our code short and clean.\n"+
                " Better explain our code to other developers.\n");

        System.out.println("Question 2");
        System.out.println("What is the name of the first function called in the program?\n "+ "main.\n");

        System.out.println("Question 3");
        Functions.greet();

        System.out.println("\nQuestion 4");
        Functions.printNum(56);

        System.out.println("\nQuestion 5");
        int i = 1;
        while (i <= 10){
            Functions.printNum(i);
            i++;
        }

        System.out.println("\nQuestion 6");
        int k = 5;
        System.out.println(Functions.changeNumber(k)); // k = 6
        //הערך שיודפס אמנם יהיה 6 אבל המשתנה שמוגדר בשורה 36 ישאר 5.

        System.out.println("\nQuestion 7");
        System.out.println(Functions.multiply(5,4));
        System.out.println(Functions.multiply(3,6));
        System.out.println(Functions.multiply(7,5));

        System.out.println("\nQuestion 8");
        Functions.calc(2, 10, '-');

        System.out.println("\nQuestion 9");
        System.out.println(Functions.average(5,4, 0));

        System.out.println("\nQuestion 10");
        int[] arr = {1, 2, 5, 10};
        System.out.println(Functions.inArray(100, arr));

        System.out.println("\nQuestion 11");
        Functions.divide(15);

        System.out.println("\nQuestion 12");
        Functions.hello();

        System.out.println("\nQuestion 13");
        System.out.println("With method overloading, multiple methods can have the same name with different parameters and/or types \n" +
                "instead of defining two methods that should do the same thing, it is better to overload one.\n");

        System.out.println("Question 14");
        Functions.numberType(1.55f,2.78f);

        System.out.println("\nQuestion 15");
        Functions.getScanner();

        System.out.println("\nQuestion 16");
        int[] arr1 = {10, 30, 55, 100, 98, 75};
        System.out.println(Functions.randomize(arr1));

        System.out.println("\nQuestion 17");
        Functions.strings("fullstack");

        System.out.println("\nQuestion 18");
        System.out.println("Local variables are defined within a function, and can only be used within the function within which they were defined.\n" +
                "Global variables can be accessed from any function in the same class. The visibility of global variables outside the class depends on its access modifiers.");

        System.out.println("\nQuestion 19");
        Functions.printWord();
        Functions.changeWord("javascript");
        Functions.printWord();
        // הערך הפך להיות הערך החדש

        System.out.println("\nQuestion 20");
        int[] arr2 = {2 ,6 ,7 ,8 ,34 ,16};
        System.out.println(Arrays.toString(arr2));
        Functions.multiplyZugi(arr2);
        Functions.addOne(arr2);
        Functions.setZero(arr2);
        System.out.println(Arrays.toString(arr2)); // המערך המקורי השתנה

        System.out.println("\nQuestion 21");
        System.out.println(Functions.sumOfDigits(123456789));

        System.out.println("\nQuestion 22");
        String[] passwordArray = {"w" ,"2" ,"k" ,"5" ,"4" ,"6", "1","9"};
        System.out.println(Arrays.toString(passwordArray));
        System.out.println(Functions.password(passwordArray));

        System.out.println("\nQuestion 23");
        Functions.matrix1();

        System.out.println("\nQuestion 24");
        System.out.println("Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.\n" +
                "Every recursive function should have a stop condition, which is the condition where the function stops calling itself.\n" +
                "Recursive functions also should have just one parameter which is of the same type as its \n" +
                "return value, because what pops out from the rear needs to be fed to the front\n");

        System.out.println("Question 25");
        System.out.println(Functions.atsertRecursion(5));





























    }
}