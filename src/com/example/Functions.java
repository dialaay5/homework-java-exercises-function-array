package com.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Functions {

    static String magicWord = "java";

    public static void greet(){ //"Question 3"
        System.out.println("good morning!!");
    }

    public static void printNum(int num){ //"Question 4"
        System.out.println(num);
    }

    //"Question 5 in class Main"

    public static int changeNumber(int number){ //"Question 6"
        return number + 1;
    }

    public static int multiply(int x, int y){ //"Question 7"
        return x * y;
    }

    public static void calc(int a, int b , char operator){ //"Question 8"
        if(operator == '+'){
            System.out.printf("a + b = %d", a + b);
        }
        else if(operator == '-'){
            System.out.printf("a - b = %d", a - b);
        }
    }

    public static int average(int x, int y, int z){ //"Question 9"
        int sum = x + y + z;
        return sum / 3 ;
    }

    public static boolean inArray(int number, int []arr){ //"Question 10"
        boolean inTheArray = false;
        for (int j : arr) {
            if (j == number) {
                inTheArray = true;

                break;
            }
        }
        return inTheArray;
    }

    public static void divide(int x){ //"Question 11"
        int i = 1;
        while (i <= x){
            if(x % i == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void hello(){ //"Question 12"
        System.out.printf("hello %s\n", world());
    }
    public static String world(){
        return "world";
    }

    //"Question 13 in class Main"

    public static void numberType(int x, int y) { //"Question 14"
        System.out.println("int");
    }
    public static void numberType(double x, double y) {
        System.out.println("double");
    }
    public static void numberType(float x, float y) {
        System.out.println("float");
    }

    public static Scanner getScanner() { //"Question 15"
        return new Scanner(System.in);
    }


    public static int randomize(int []arr1){ //"Question 16"
        // a random integer from 0 to (arr1.length) where arr1.length is not included.:
        int i = (int) Math.floor(Math.random() * arr1.length);
        return (arr1[i]);
        }

    public static void strings(String string){ //"Question 17"
        System.out.printf((string +"@@@").concat(star()).concat(sulamet()));
    }
    public static String star(){
        return "**";
    }
    public static String sulamet(){
        return "#";
    }

    //"Question 18 in class Main"

    public static void printWord(){ //"Question 19"
        System.out.println(magicWord);
    }
    public static void changeWord(String word){
         magicWord = word;
        System.out.println(magicWord);
    }

    public static void multiplyZugi(int []arr2){ //"Question 20"
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 == 0){
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static void addOne(int []arr2){
        arr2[arr2.length - 1] = arr2[arr2.length - 1] + 1;
        System.out.println(Arrays.toString(arr2));
    }
    public static void setZero(int []arr2){
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 != 0){
                arr2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
    public static int sumOfDigits(int number) { //"Question 21"
        int sum = 0;
        while(number > 0){
            sum = sum + (number % 10);
            number = (int) Math.floor(number / 10);
        }
        return sum;
        }

    public static boolean password(String[] passwordArray) { //"Question 22"
        boolean correctPassword = false;

        for (String j : passwordArray) {
                if (Character.isLetterOrDigit(j.charAt(0)) && passwordArray.length >= 8) {
                    correctPassword = true;
                }
                else{
                    correctPassword = false;
                    break;
                }
            }
            return correctPassword;
        }

        public static void matrix1(){ //"Question 23"
            int rows = 3;
            int columns = 3;
            int[][] matrixArray = new int[rows][columns];

            Random rand = new Random();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrixArray[i][j] = rand.nextInt(100) + 1;
                }
            }
            System.out.println(Arrays.deepToString(matrixArray));
            sumMatrix1(matrixArray);
     }

    public static void sumMatrix1(int[][] array2d){
        int sum = 0;
        for (int[] array : array2d) {
            for (int element : array) {
                sum += element;
            }
        }
            System.out.println(sum);
    }

    //"Question 24 in class Main"

    public static int atsertRecursion(int index) { //"Question 25"
        if (index <= 1) {
            return 1;
        }
        return index * atsertRecursion((index - 1));
    }



    }



