package ua.ithilell.hw15;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class HomeWorkMain {

    public static void main(String[] args) throws TypeProductDataException, InterruptedException {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Book", 150F, true));
        Thread.sleep(100);
        productList.add( new Product("Toy", 255F));
        Thread.sleep(100);
        productList.add( new Product("Book", 50F, new Date(1672530199000L)));
        Thread.sleep(100);
        productList.add( new Product("Toy", 200F));
        Thread.sleep(100);
        productList.add( new Product("Book", 260F, true));
        Thread.sleep(100);
        productList.add( new Product("Book", 251F, true));
        Thread.sleep(100);
        productList.add( new Product("Toy", 2400F));
        Thread.sleep(100);
        productList.add( new Product("Book", 70F, true));
        Thread.sleep(100);
        productList.add( new Product("Toy", 150F));
        Thread.sleep(100);
        productList.add( new Product("Book", 100F));
        Thread.sleep(100);
        Thread.sleep(100);
        productList.add( new Product("Toy", 100000F));
        Thread.sleep(100);
        productList.add( new Product("Book", 35F, new Date(1673422053000L)));
        Thread.sleep(100);
        productList.add( new Product("Book", 10F));
        productList.add( new Product("Toy", 9999F, new Date(1668428053000L)));



        //List<Product> products1 = Product.getBookMorePrice(productList);
        //List<Product> products2 = Product.getBookDiscount(productList);
        //List<Product> products3 = Product.getLastProducts(productList);
        //List<Product> products4 = Product.getSumBooksThisYear(productList);
        //products1.stream().forEach(System.out::println);
        //products2.stream().forEach(System.out::println);
        //products3.stream().forEach(System.out::println);
        System.out.println("+++++++");
        System.out.println(getSumBooksThisYear(productList));
        try {
            System.out.println(getMinPrice(productList, "ssss"));
        } catch (TypeProductDataException e) {
            System.err.println(e);;
        }

        System.out.println(groupByType(productList));

    }

    //Task 1
    public static List<Product> getBookMorePrice(List<Product> products){
        return products.stream().filter(x->x.getType().equals("Book") && x.getPrice()>250).toList();
    }

    //Task 2
    public static List<Product> getBookDiscount(List<Product> products){
        List<Product> productArrayList = products.stream().collect(Collectors.toList());
        productArrayList = productArrayList.stream().filter(x->x.getType().equals("Book") && x.isDiscount()).toList();
        productArrayList.stream().forEach(x->x.setPrice(x.getPrice()/100*90));
        return productArrayList;
    }

    //Task 3
    public static Product getMinPrice(List<Product> products, String type) throws TypeProductDataException {
        return products.stream().filter(x->x.getType().equals(type)).
                min((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())).
                orElseThrow(()-> new TypeProductDataException("Продукт [категорія: "+ type +"] не знайдено"));
    }

    //Task 4
    public static List<Product> getLastProducts(List<Product> products){
        return products.stream().sorted((p1, p2)->p2.getDateTimeCreated().compareTo(p1.getDateTimeCreated())).limit(3).toList();
    }

    //Task 5
    public static Float getSumBooksThisYear(List<Product> products){
        AtomicReference<Float> sum = new AtomicReference<>(0F);
        products.stream().
                filter(x->x.getType().equals("Book") && x.getPrice()<=75 && x.getDateTimeCreated().getTime()>1672531199000L).
                forEach(x -> sum.updateAndGet(v -> v + x.getPrice().floatValue()));
        return sum.get();
    }

    //Task 6
    public static Map<String, List<Product>> groupByType(List<Product> products){
         return products.stream().collect(groupingBy(Product::getType));
    }


}
