package com.stschool.java.fundamentals;

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
        if(m == k){
            System.out.println("palindrome");
        }
        else
            System.out.println("not a palindrome");
    }
}
