package org.example;

public class CalculateInterest extends GetInterestNumbers{
    public double calcInt(double principal, double time, double rate){
        double percentRate = rate / 100;
        double Interest = principal * (1 + (percentRate * time));
        return Interest;
    }
    public double totalValue(double a, double b){
        double value = a + b;
        return value;
    }
}


