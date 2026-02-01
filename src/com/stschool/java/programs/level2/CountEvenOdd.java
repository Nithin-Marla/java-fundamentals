package com.stschool.java.programs.level2;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        while (n > 0) {
            int r = n % 10;
            if (r % 2 == 0)
                count1++;
            else
                count2++;
            n = n / 10;
        }
        System.out.println("Number of even digits in the number are :" + count1);
        System.out.println("Number of odd digits in the number are :" + count2);
    }

}
