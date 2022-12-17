package com.bridgelabz;

public class Generics {

    static void maximumOfVariables(int num1, int num2, int num3){
        if(num1 > num2){
            if(num1 > num3){
                System.out.println( num1 + " is Maximum ");
            }else {
                System.out.println( num3 + " is greater ");
            }
        }else{
            if(num2 > num3){
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
