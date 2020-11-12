package com.codewithsouma;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }
}
