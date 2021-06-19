package com.javacourse.examples.statictest;

import static com.javacourse.examples.statictest.Utility.print;

public class Bill {
    public double value;
    public int id;
    public String date;
    public static final double IVA = 0.19;

    private Bill(){
        BillingSystem.id++;
    }

    public static Bill Builder(){
        return new Bill();
    }

    public Bill value(double v){
        this.value = v;
        return this;
    }

    public Bill date(String d){
        this.date = d;
        return this;
    }

    public Bill id(int i){
        this.id = i;
        return this;
    }

    public void printItsef(){
        print("[" + this.date + "] " + this.id + ": $" + this.value);
    }
}
