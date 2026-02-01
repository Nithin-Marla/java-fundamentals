package com.stschool.java.patterns;

import java.util.Scanner;

public class ExamplePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            int numInc=1;
            int numDec=4;
            for (int j = 0; j < n - i; j++) {
                System.out.print(numInc++);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if(j==0){
                    numDec--;
                    continue;
                }
                numDec--;
                System.out.print(" ");
            }
            for (int j = 0; j <n - i; j++) {
                if(i==0&&j==0){
                    numDec--;
                    continue;
                }
                System.out.print(numDec--);
            }
            System.out.println();

        }
    }
}
