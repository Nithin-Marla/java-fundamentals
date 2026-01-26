package com.stschool.java.fundamentals;

import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        int n = sc.nextInt();
        while (n > 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                count1++;
            } else
                count2++;
            n = n / 10;
        }
        System.out.println("the number of even digits in the given number is: " + count1);
        System.out.println("the number of odd digits in the given number is: " + count2);
    }
}
