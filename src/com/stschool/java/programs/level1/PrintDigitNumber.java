package com.stschool.java.programs.level1;

import java.util.Scanner;

public class PrintDigitNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n= sc.nextInt();
        while (n > 0) {
            int r = n % 10;
            System.out.println(r);
            n = n / 10;
        }
    }
}
