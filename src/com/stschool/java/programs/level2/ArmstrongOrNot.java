package com.stschool.java.programs.level2;

import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int m = n;
        int sum = 0;
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        while (k > 0) {
            int r = k % 10;
            sum = sum + (int) Math.pow(r, count);
            k = k / 10;
        }
        if(sum==m)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong number");
    }
}
