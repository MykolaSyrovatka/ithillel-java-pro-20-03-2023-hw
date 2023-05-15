package ua.ithilell.hw11;

import java.util.List;

public class HomeWorkMain {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList();
        List list = myList.toList(new Integer[]{1,2,3,4,5});


        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        appleBox.add(new Apple(), new Apple(), new Apple(), new Apple(), new Apple(), new Apple(), new Apple(),
                new Apple(), new Apple(),new Apple(), new Apple(), new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox.merge(appleBox1);
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox.merge(orangeBox1);




        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));

    }

}
