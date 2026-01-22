package com.stschool.java.fundamentals;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte englishMarks, mathsMarks, socialMarks, biologyMarks, physicsMarks, chemistryMarks;
        System.out.println("Enter english marks");
        englishMarks = sc.nextByte();
        System.out.println("Enter maths marks");
        mathsMarks = sc.nextByte();
        System.out.println("Enter social marks");
        socialMarks = sc.nextByte();
        System.out.println("Enter biology marks");
        biologyMarks = sc.nextByte();
        System.out.println("Enter physics marks");
        physicsMarks = sc.nextByte();
        System.out.println("Enter chemistry marks");
        chemistryMarks = sc.nextByte();
        int totalMarks = englishMarks + mathsMarks + socialMarks + biologyMarks + physicsMarks + chemistryMarks;
        System.out.println("total marks = " + totalMarks);
        float averageMarks = (float) totalMarks / 6;
        System.out.println(averageMarks);


    }
}
