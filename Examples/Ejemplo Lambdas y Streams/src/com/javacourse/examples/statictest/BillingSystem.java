package com.javacourse.examples.statictest;

import java.util.List;

import static com.javacourse.examples.statictest.Utility.*;

public class BillingSystem {

    public String name = "Default Billing System";
    public static int id = 0;

    public Bill generateBill(int price){
        Bill result = Bill.Builder().value(20).date("YESTERDAY");

        result.id = BillingSystem.id;
        result.date = "TODAY";
        result.value = price + (price * Bill.IVA);

        System.out.println("Bill generated by " + this.name);

        return result;
    }

    public static double quote(double price){
        return price + (price * Bill.IVA);
    }

    public static void generateGeneralReport(List<Bill> dailyBillingBook){
        print("==========================");
        print("*     GENERAL REPORT     *");
        print("==========================");
        dailyBillingBook.forEach(Bill::printItsef); // Usando referencia al método
        print("==========================");
    }

    public static void generateCheapProductsBillReport(List<Bill> dailyBillingBook){
        print("==========================");
        print("*  CHEAP PRODUCTS REPORT  *");
        print("==========================");
        dailyBillingBook.stream()
                        .filter(bill -> bill.value < 100)
                        .forEach(bill -> print("[" + bill.date + "] " + bill.id + ": $" + bill.value)); //Usando la implementación de manera explícita.
        print("==========================");
    }
}