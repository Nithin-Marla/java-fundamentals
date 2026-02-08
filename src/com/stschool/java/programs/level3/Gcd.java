package com.stschool.java.programs.level3;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if(number1>number2){
            int temp= number1;
            number1= number2;
            number2= temp;
        }
        while(number2!=0){
            int temp=number2;
            number2= number1%number2;
            number1 = temp;

        }
        System.out.println(number1);
    }
}
