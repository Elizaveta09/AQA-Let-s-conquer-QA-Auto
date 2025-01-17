package shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    //корзина знает только свои товары
    //private Customer customer;
    private List<Item> items;

    public Cart(/*Customer customer*/) {
        //this.customer = customer;
        this.items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void deleteItem(Item id){
        items.remove(id);
    }

    public void removeCart(){
        items.clear();
    }

    public void print(){
        for(Item item: items){
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
