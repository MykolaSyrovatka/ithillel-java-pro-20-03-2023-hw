package ua.ithilell.hw14.coffee.order;

import java.util.*;

public class CoffeeOrderBoard {

    private Map<Integer, Order> orderMap = new HashMap<>();
    private int count = 1;
    public void add(String customerName){
        orderMap.put(count, new Order(count, customerName));
        count++;
    }

    public void deliver(){
        Set<Integer> integerSet = orderMap.keySet();
        Iterator<Integer> iterator = integerSet.iterator();
        if (iterator.hasNext()) {
            orderMap.remove(iterator.next());
        } else {
            System.out.println("Черга пуста");
        }
    }
    public void deliver(Integer number){
        orderMap.remove(number);
    }

    public void draw(){
        Set<Integer> integerSet = orderMap.keySet();
        Iterator<Integer> iterator = integerSet.iterator();
        System.out.println(toString());
        while (iterator.hasNext()){
            Order order = orderMap.get(iterator.next());
            System.out.println(order.toString());

        }
    }

    @Override
    public String toString() {
        return "=".repeat(25) + "\n"
                + "NUM\t|\tNAME" + "\n"
                + "=".repeat(25);
    }
}
