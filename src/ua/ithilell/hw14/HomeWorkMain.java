package ua.ithilell.hw14;

import ua.ithilell.hw14.coffee.order.CoffeeOrderBoard;

public class HomeWorkMain {

    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Iron Man");
        coffeeOrderBoard.add("Captain America");
        coffeeOrderBoard.add("Thor");
        coffeeOrderBoard.add("Spider-Man");
        coffeeOrderBoard.add("Dr Strange");
        coffeeOrderBoard.add("Wong");
        coffeeOrderBoard.add("Hawkeye");
        coffeeOrderBoard.add("Black Widow");
        coffeeOrderBoard.add("Black Panther");
        coffeeOrderBoard.add("Vision");
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(8);
        coffeeOrderBoard.draw();
        coffeeOrderBoard.add("Scarlet Witch");
        coffeeOrderBoard.add("Ant man");
        coffeeOrderBoard.add("Red Queen");
        coffeeOrderBoard.add("Falcon");
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
    }
}
