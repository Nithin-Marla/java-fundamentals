package com.stschool.java.programs.level3;

import java.util.Scanner;

public class PrintFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 1;
        while (i <= n) {
            sum = sum * i;
            i++;
        }
        System.out.println(sum);
    }
}
