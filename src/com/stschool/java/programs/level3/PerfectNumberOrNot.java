package com.stschool.java.programs.level3;

import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int k = n;
        int sum = 0;
        while (i < n) {
            if (n % i == 0)
                sum = sum + i;
            i++;
        }
        if (sum == k)
            System.out.println("Perfect Number");
        else
            System.out.println("not a perfect number");
    }
}
