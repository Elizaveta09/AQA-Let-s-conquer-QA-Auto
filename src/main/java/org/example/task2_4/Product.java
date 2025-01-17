package org.example.task2_4;

public class Product {
    private String name;
    private String category;
    private int quantity;
    private double pricePerUnit;

    public Product(String name, String category, int quantity, double pricePerUnit) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double calculateTotalPrice(){
        double totalPrice = this.quantity * this.pricePerUnit;
        return totalPrice;
    }

    public void printProductInfo(){
        System.out.println("Товар: " + this.name + " , Категория: " + this.category + " , Количество: " + this.quantity + " , Общая стоимость: " + calculateTotalPrice());
    }
}
