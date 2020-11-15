package com.codewithsouma;

public class TaxReport {
    private TaxCalculator calculator;

    //Constructor Injection
//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    //method injection
    public void show(TaxCalculator calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    //Setter Injection
//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}
