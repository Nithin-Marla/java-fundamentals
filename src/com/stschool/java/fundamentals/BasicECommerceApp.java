package com.stschool.java.fundamentals;

import java.util.Scanner;

public class BasicECommerceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        char membership;
        float totalAmount;
        int productPrice;
        float discountPercent;
        float centralTax;
        short shippingCharges;
        float discountAmount;
        float discountedPrice;
        float stateTax;
        float finalPrice;
        int productQuantity;
        float totalSavedAmount;
        char continueShopping = 'y';
        do {
            System.out.println(" ---Welcome to E-commerce website--- ");
            System.out.println(" menu: 1.products list \n 2.Exit");
            System.out.print("Enter your input:");
            choice = sc.next().charAt(0);

            switch (choice) {
                case 1:
                    System.out.println("welcome to the products section:");
                    System.out.println("Enter product price:");
                    productPrice = sc.nextInt();
                    System.out.println("Do you have membership type");
                    membership = sc.next().charAt(0);
                    if (membership == 's') {
                        discountPercent = 10;
                        shippingCharges = 50;

                    }
                    if (membership == 'g') {
                        discountPercent = 15;
                        shippingCharges = 25;
                    }
                    if (membership == 'd') {
                        discountPercent = 20;
                        shippingCharges = 0;
                    } else {
                        discountPercent = 0;
                        shippingCharges = 100;

                    }

                    discountAmount = productPrice * discountPercent / 100;
                    discountedPrice = productPrice - discountAmount;
                    stateTax = (float) ((discountedPrice * 2.5) / 100);
                    centralTax = (float) ((discountedPrice * 2.5) / 100);
                    finalPrice = discountedPrice + stateTax + centralTax;
                    System.out.println("product price :" + productPrice);
                    System.out.println("discount percentage :" + discountPercent);
                    System.out.println("discount amount :" + discountAmount);
                    System.out.println("discounted price :" + discountedPrice);
                    System.out.println("state tax :" + stateTax);
                    System.out.println("central tax :" + centralTax);
                    System.out.println("final price :" + finalPrice);
                    System.out.println("shipping charges :" + shippingCharges);
                    System.out.println("Enter product quantity :");
                    productQuantity = sc.nextInt();
                    totalSavedAmount = discountedPrice * productQuantity;
                    totalAmount = productQuantity * finalPrice + shippingCharges;
                    System.out.println("Total saved amount" +totalSavedAmount);
                    System.out.println("Total Amount" + totalAmount);
                    System.out.println("Thank you For Shopping");
                case 2:
                    System.exit(0);
                default:
                    System.out.println("enter valid responce either 1 or 2");
            }

            continueShopping = sc.next().toLowerCase().charAt(0);
        } while(continueShopping == 'y');
        System.out.println("Thank you for shopping");
        System.out.println("Do you want to continue shopping");
    }
}
