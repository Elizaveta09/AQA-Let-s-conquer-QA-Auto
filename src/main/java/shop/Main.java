package shop;

public class Main {
    public static void main(String[] args) {

/*Интернет-магазин:
1. Товары
2. Корзина
3. Клиент
4. Заказ

Взаимодействие:
Клиент - добавляет в корзину товары, удаляет из корзины
Клиент - формирование заказа, оплата (из корзины)
Заказ - переход в статус «Оплачен»

Отношение:
Товары - отдельная сущность
Корзина - множество товаров (измененное) при трансформации из Корзины в заказ - корзина обнуляется
Клиент: корзина, множество заказов, после обнуления корзины (оплаты заказа) добавляется заказ.

Клиент добавляет товары в корзину, оплата корзины, корзина становится заказом, у которого статус "оплачен"*/

        Customer customer = new Customer("Osipov Igor Valerievich");
        System.out.println(customer);

        Order order = customer.createOrder();
        System.out.println(order.getOrderStatus());

        Item item1 = new Item(1, "Milk", 100.5);
        Item item2 = new Item(2, "Potato", 64);
        Item item3 = new Item(3, "Ice-cream", 300.2);

        customer.addItemInCart(item1);
        customer.addItemInCart(item2);
        customer.addItemInCart(item3);
        customer.addItemInCart(item3);
        customer.addItemInCart(item2);

        customer.deleteItemFromCart(item2);

        customer.printCart();

        customer.payOrder(order);
        System.out.println(order);
    }
}
