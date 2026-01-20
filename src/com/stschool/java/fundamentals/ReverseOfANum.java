package com.stschool.java.fundamentals;

import java.util.Scanner;
class ReverseOfANum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        while(n>0){
            int r=n%10;
            m=m*10+r;
            n=n/10;
        }
        System.out.println(m);
    }
}
