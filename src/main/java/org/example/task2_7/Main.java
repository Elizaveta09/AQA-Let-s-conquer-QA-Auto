package org.example.task2_7;

public class Main {
    public static void main(String[] args) {
        Currency currency = new Currency("Rub", 0.009768);
        currency.printCurrencyInfo();
        System.out.println(currency.convertToUSD(750));
    }
}
