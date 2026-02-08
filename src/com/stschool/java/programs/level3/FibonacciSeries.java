package com.stschool.java.programs.level3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 =1;
        System.out.print(num1 + " " +num2);
        for(int i =0;i<n-2;i++){
            int result = num1+num2;
            num1=num2;
            num2=result;
            System.out.print( " "+ result);
        }
    }
}
