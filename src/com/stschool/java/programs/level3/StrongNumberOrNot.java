package com.stschool.java.programs.level3;

import java.util.Scanner;

public class StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int m = 0;
        while (n > 0){
            int r = n % 10;
            int i = 1;
            int sum = 1;
            while(i <= r){
                sum = sum * i;
                i++;
            }
            m = m + sum;
            n = n / 10;
        }
        if(m == k)
        System.out.println("Strong number");
        else
            System.out.println("not a strong number");
    }
}
