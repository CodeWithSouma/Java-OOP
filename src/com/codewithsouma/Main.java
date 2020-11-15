package com.codewithsouma;

public class Main {

    public static void main(String[] args) {
       var calculator = new TaxCalculator2018(100_000);
       var report = new TaxReport(calculator);//Inject calculator class
        report.show();

        report.setCalculator(new TaxCalculator2019());//setter injection
        report.show();
    }
}
