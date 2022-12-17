package com.bridgelabz;

public class Generics {

    static void maximumOfVariables(Integer num1, Integer num2, Integer num3){
        if(num1.compareTo(num2) == 1){
            if(num1.compareTo(num3) == 1){
                System.out.println( num1 + " is Maximum ");
            }else {
                System.out.println( num3 + " is greater ");
            }
        }else{
            if(num2.compareTo(num3) == 1){
                System.out.println( num2 + " is maximum ");
            }else{
                System.out.println( num3 + " is maximum ");
            }
        }
    }

    public static void main(String[] args) {
        maximumOfVariables(12,23,17);
    }
}
