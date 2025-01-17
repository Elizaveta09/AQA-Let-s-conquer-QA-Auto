package org.example.task2_13;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Kira", "kira@mail.ru");
        customer.addPurchase("bag");
        customer.addPurchase("sun");
        customer.addPurchase("doll");

        customer.printPurchaseHistory();
    }
}
