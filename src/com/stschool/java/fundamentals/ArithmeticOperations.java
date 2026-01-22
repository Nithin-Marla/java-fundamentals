package com.stschool.java.fundamentals;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num1, num2;
        System.out.println("Enter number 1:");
        num1 = sc.nextByte();
        System.out.println("Enter number 2:");
        num2 = sc.nextByte();
        short res;
        res = (short) (num1 + num2);
        System.out.println("resultant sum = " + res);
        sc.close();
    }

}
