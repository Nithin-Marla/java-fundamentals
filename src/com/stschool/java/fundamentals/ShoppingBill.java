package com.stschool.java.fundamentals;

import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int actualProductPrice, productQuantity;
        float discountPercent, discountAmount, afterDiscount;
        System.out.println("Enter the actual price of the product");
        actualProductPrice = sc.nextInt();

        System.out.println("Enter the discount percentage of the product");
        discountPercent = sc.nextFloat();

        discountAmount = (actualProductPrice * discountPercent) / 100;
        afterDiscount = actualProductPrice - discountAmount;

        System.out.println("product price = " + actualProductPrice);
        System.out.println("Discount percentage = " + discountPercent);
        System.out.println("Discount amount = " + discountAmount);
        System.out.println("Discounted price = " + afterDiscount);

        float stateTax, centralTax, finalAmountOfOneProduct, finalAmount, savedPrice;

        stateTax = (float) ((afterDiscount * 2.5) / 100);
        centralTax = (float) ((afterDiscount * 2.5) / 100);

        finalAmountOfOneProduct = (afterDiscount + stateTax + centralTax);

        System.out.println("State tax = " + stateTax);
        System.out.println("central tax = " + centralTax);
        System.out.println("final product price = " + finalAmountOfOneProduct);

        System.out.println("Enter the quantity of the product");
        productQuantity = sc.nextInt();

        finalAmount = (finalAmountOfOneProduct) * productQuantity;

        savedPrice = finalAmount - (actualProductPrice * productQuantity);

        System.out.println("final bill = " + finalAmount);
        System.out.println("total saved = " + savedPrice);
        sc.close();
    }
}
