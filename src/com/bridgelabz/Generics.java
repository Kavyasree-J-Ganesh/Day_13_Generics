package com.bridgelabz;

public class Generics {
    static void maximumOfVariables(Integer num1, Integer num2, Integer num3){
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum ");
            }else {
                System.out.println( num3 + " is greater ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is maximum ");
            }else{
                System.out.println( num3 + " is maximum ");
            }
        }
    }

    static void maximumOfVariables(Float num1, Float num2, Float num3){
        if(num1.compareTo(num2) > 0){
            if(num1.compareTo(num3) > 0){
                System.out.println( num1 + " is Maximum ");
            }else {
                System.out.println( num3 + " is greater ");
            }
        }else{
            if(num2.compareTo(num3) > 0){
                System.out.println( num2 + " is maximum ");
            }else{
                System.out.println( num3 + " is maximum ");
            }
        }
    }

    public static void main(String[] args) {
       maximumOfVariables(3,1,90);
       maximumOfVariables(3.1f,10.8f,90f);
    }
}