package com.stschool.java.fundamentals;

import java.util.Scanner;

public class SumOfNumbersUsingRecursion {
    static void fn(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        fn(i - 1, sum + i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fn(n, 0);
    }
}
