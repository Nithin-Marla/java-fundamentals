package com.stschool.java.programs.level2;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int k = n;
        while (n > 0) {
            int r = n % 10;
            m = m * 10 + r;
            n = n / 10;
        }
        if(m == k)
        System.out.println("yes");
        else
            System.out.println("no");

    }
}
