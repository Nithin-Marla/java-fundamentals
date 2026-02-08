package com.stschool.java.programs.level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum + remainder;
            n = n / 10;
        }
        if (temp % sum == 0) {
            System.out.println("yes");
        } else
            System.out.println("no");
    }
}
