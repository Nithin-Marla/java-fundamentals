package com.stschool.java.programs.level1;

import java.util.Scanner;

public class PrintNumbersNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
