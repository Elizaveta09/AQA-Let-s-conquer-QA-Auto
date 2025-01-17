package org.example.task2_13;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<String> purchaseHistory;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    public void addPurchase(String item){
         purchaseHistory.add(item);
    }

    public void printPurchaseHistory(){
        String history = String.join(", ", purchaseHistory);
        System.out.println("Customer: " + this.name + " , purchase history: " + history);
    }
}
