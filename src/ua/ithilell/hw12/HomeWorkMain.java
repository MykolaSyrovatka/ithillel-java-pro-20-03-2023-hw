package ua.ithilell.hw12;

import ua.ithilell.hw12.phonebook.Record;
import ua.ithilell.hw12.phonebook.TelephoneDirectory;

import java.lang.reflect.Array;
import java.util.*;

public class HomeWorkMain <T> {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("Test");
        list.add("Test1");
        list.add("Test");
        list.add("Test2");
        list.add("Test3");
        list.add("Test1");
        list.add("Test4");
        list.add("Test4");
        list.add("Test3");
        list.add("Test");
        list.add("Test1");
        list.add("Test");
        list.add("Test2");
        list.add("Test3");
        list.add("Test1");
        list.add("Test4");
        list.add("Test4");
        list.add("Test3");
        System.out.println(countOccurrence(list,"Test"));
        System.out.println(calcOccurance(list));
        System.out.println(findOccurance(list));

        String [] strings = new String[]{"!", "34", "itr"};
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(1);
        listInteger.add(4);

        System.out.println(findUnique(listInteger).size());

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
        telephoneDirectory.add(new Record("Василь", "4979368469"));
        telephoneDirectory.add(new Record("Микола", "3674564766"));
        telephoneDirectory.add(new Record("Петро", "7883430000"));
        telephoneDirectory.add(new Record("Ольга", "5600764673"));
        telephoneDirectory.add(new Record("Маргарита", "9657635653"));
        telephoneDirectory.add(new Record("Олексій", "11233583086"));
        telephoneDirectory.add(new Record("Станіслава", "1253533336"));
        telephoneDirectory.add(new Record("Юлія", "5556667779"));
        telephoneDirectory.add(new Record("Василь", "7778846557"));
        telephoneDirectory.add(new Record("Петро", "88564575775"));
        telephoneDirectory.add(new Record("Василь", "13324111560"));

        System.out.println(telephoneDirectory.find("Микола").toString());
        System.out.println(telephoneDirectory.find("Василь").toString());
        System.out.println(telephoneDirectory.findAll("Василь").toString());
    }
    public static int countOccurrence(List<String> list, String str){
        int count = 0;
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
                if (iterator.next().equals(str)) {
                    count++;
                }
        }
        return count;
    }
    public static List<Integer> findUnique(List<Integer> list){
        HashSet<Integer> hashSet = new HashSet<>(list);
        Iterator<Integer> iterator = list.iterator();


        while (iterator.hasNext()){

            hashSet.add(iterator.next());

        }
        return new ArrayList<>(hashSet);
    }

    public static List<String> calcOccurance(List<String> list){
        HashSet<String> hashSet = new HashSet<>(list);
        List<String> newList = new ArrayList<>(hashSet);

        for (int i = 0; i < newList.size() ; i++){

            int count = 0;
            for (int j = 0; j < list.size() ; j++) {
                if (newList.get(i).equals(list.get(j))){
                    count+=1;
                }
                if (j == list.size()-1){
                    String str = "" + newList.get(i) + ": " + count;
                    newList.set(i, str);
                }
            }
        }
        return newList;
    }

    public static List<MyClass> findOccurance(List<String> list){
        HashSet<String> hashSet = new HashSet<>(list);
        List<String> newList = new ArrayList<>(hashSet);
        List<MyClass> myClasses = new ArrayList<>();

        for (int i = 0; i < newList.size() ; i++){
            myClasses.add(new MyClass(newList.get(i)));
            int count = 1;
            for (int j = 0; j < list.size() ; j++) {
                if (newList.get(i).equals(list.get(j))){
                    count+=1;
                }
                if (j == list.size()-1){
                    myClasses.get(i).setOccurrence(count);
                }
            }
        }
        return myClasses;
    }


}
