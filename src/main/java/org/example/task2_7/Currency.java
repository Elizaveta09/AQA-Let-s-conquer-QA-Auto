package org.example.task2_7;

public class Currency {
    private String name;
    private double rateToUSD;

    public Currency(String name, double rateToUSD) {
        this.name = name;
        this.rateToUSD = rateToUSD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRateToUSD() {
        return rateToUSD;
    }

    public void setRateToUSD(double rateToUSD) {
        this.rateToUSD = rateToUSD;
    }

    public double convertToUSD(double amount){
        double result = amount * this.rateToUSD;
        return result;
    }

    public void printCurrencyInfo(){
        System.out.println("Currency: " + this.name + " , Exchange rate to USD: " + this.rateToUSD);
    }
}
