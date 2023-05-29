package ua.ithilell.hw15;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Product implements Cloneable{
    private static int count = 1;
    private Integer id = 1;
    private String type;
    private Float price;
    private boolean discount;
    private Date dateTimeCreated;

    public Product(String type, Float price) {
        this.id = count;
        this.type = type;
        this.price = price;
        this.discount = false;
        this.dateTimeCreated = new Date();
        count++;
    }
    public Product(String type, Float price, boolean discount) {
        this(type, price);
        this.discount = discount;
    }

    public Product(String type, Float price, Date dateTimeCreated) {
        this(type, price);
        this.dateTimeCreated = dateTimeCreated;
    }

    public Product(String type, Float price, boolean discount, Date dateTimeCreated) {
        this(type, price);
        this.discount = discount;
        this.dateTimeCreated = dateTimeCreated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public Date getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(Date dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return isDiscount() == product.isDiscount() && Objects.equals(id, product.id) && Objects.equals(getType(), product.getType()) && Objects.equals(getPrice(), product.getPrice()) && Objects.equals(getDateTimeCreated(), product.getDateTimeCreated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getType());
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", dateTimeCreated=" + dateTimeCreated +
                "}\n";
    }

    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}
