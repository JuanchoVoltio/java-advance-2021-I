package com.javacourse.examples.statictest;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
//        System.out.println(BillingSystem.quote(200));
//        System.out.println(BillingSystem.quote(150));
//        System.out.println(BillingSystem.quote(100));

        BillingSystem billingSystem = new BillingSystem();
        Bill myBill = billingSystem.generateBill(100);
        Bill anotherBill = billingSystem.generateBill(200);
        Bill lastBill = billingSystem.generateBill(50);

        List<Bill> bills = List.of(myBill, anotherBill, lastBill, billingSystem.generateBill(340), billingSystem.generateBill(75));

        BillingSystem.generateGeneralReport(bills);
        Utility.print("");
        BillingSystem.generateCheapProductsBillReport(bills);


    }
}
