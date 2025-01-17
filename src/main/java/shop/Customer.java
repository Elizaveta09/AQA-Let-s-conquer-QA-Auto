package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private String id;
    private String FIO;
    private Cart cart;
    private List<Order> orders;

    public Customer(String FIO) {
        this.FIO = FIO;
        this.cart = new Cart();
        this.id = UUID.randomUUID().toString();
        this.orders = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                '}';
    }

    public void addItemInCart(Item item){
        cart.addItem(item);
    }

    public void deleteItemFromCart(Item id) {
        cart.deleteItem(id);
    }

    public void printCart(){
        System.out.println("Cart consist of ");
        cart.print();
    }

    public Order createOrder(){
        Order order = new Order(cart);
        orders.add(order);
        cart.removeCart();
        return order;
    }

    public void payOrder(Order order){
        order.orderPayment();
    }
}
