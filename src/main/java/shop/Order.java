package shop;

import java.util.UUID;

public class Order {
    private String idOrder;
    //private Customer id;
    private OrderStatus orderStatus;
    //private List<Item> items; //берем товары из корзины
    private Cart cart;

    public Order(Cart cart) {
        this.idOrder = UUID.randomUUID().toString();
        this.cart = cart;
        this.orderStatus = OrderStatus.create;
    }

    public OrderStatus getOrderStatus() {
        System.out.println("Статус заказа: ");
        return orderStatus;
    }

    public void orderPayment(){
        this.orderStatus = OrderStatus.paid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder='" + idOrder + '\'' +
                ", orderStatus=" + orderStatus +
                ", cart=" + cart +
                '}';
    }
}