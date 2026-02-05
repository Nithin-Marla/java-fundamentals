package com.stschool.java.programs.level3;

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i <= n) {
            if (n % i == 0)
                count++;
            i++;
        }
        System.out.println(count);
    }
}
