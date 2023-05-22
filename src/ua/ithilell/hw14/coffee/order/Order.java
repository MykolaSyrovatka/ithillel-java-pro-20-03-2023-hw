package ua.ithilell.hw14.coffee.order;

public class Order {
    private Integer orderNumber;
    private String customerName;

    public Order(Integer orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return orderNumber + "\t|\t" + customerName;
    }
}
