package com.codewithsouma;

public class Main {

    public static void main(String[] args) {
       var calculator2018 = new TaxCalculator2018(100_000);
//       var report = new TaxReport(calculator2018);//Inject calculator class
        var report = new TaxReport();
        report.show(calculator2018);//method injection

//        report.setCalculator(new TaxCalculator2019());//setter injection
        var calculator2019 = new TaxCalculator2019();
        report.show(calculator2019);//method injection
    }
}
