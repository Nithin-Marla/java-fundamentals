package com.stschool.java.programs.level2;

import java.util.Scanner;

public class SmallestDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 10;
        while (n > 0) {
            int r = n % 10;
            if (r < m) {
                m = r;
            }
            n = n / 10;

        }
        System.out.println(m);
    }
}
