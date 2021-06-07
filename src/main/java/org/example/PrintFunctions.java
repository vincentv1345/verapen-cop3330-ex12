package org.example;

public class PrintFunctions{
    public void printF(){
        CalculateInterest c = new CalculateInterest();
        int principal = c.getPrincipal();
        double interestRate = c.getInterestRate();
        int getYears = c.getYears();
        double calcInterest = c.calcInt(principal, getYears, interestRate);
        System.out.println("After " + getYears + " years at " + interestRate + "%, the investment will be worth $" + calcInterest);
    }
}
