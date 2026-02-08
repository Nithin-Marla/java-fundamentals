package com.stschool.java.programs.level3;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum + remainder;
            product = product * remainder;
            n = n / 10;
        }
        if (sum == product)
            System.out.println("yes it is a spy number");

        else
            System.out.println("no it is a not spy number");
    }
}
