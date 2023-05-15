package ua.ithilell.hw11;

import java.util.ArrayList;

public class Box <T>{

    private Object[] objects;
    private int count = 0;

    public Box(){
        this(10);

    }

    public Box(int size) {
        this.objects = new Object[size];
    }

    public void add(T object){
        if (count<objects.length){
            objects[count]=object;
            count++;
        } else {
            increaseArray();
            objects[count]=object;
            count++;
        }
    }

    public void add(T ...obj){
        for (int i=0; i<obj.length; i++){
            add(obj[i]);
        }
    }

    private void increaseArray(){
        int newSize = (int)(count * 1.5 + 1);
        System.out.println(newSize);
        Object[] newObjects = new Object[newSize];
        System.arraycopy(objects,0,newObjects,0, count);
        setObjects(newObjects);
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public float getWeight(){
        float weight = 0;

        for (Object object:this.objects) {
            if (object!=null){
               switch (object.getClass().getSimpleName()){
                   case "Apple":
                       weight += 1F;
                       break;
                   case "Orange":
                       weight += 1.5F;
                       break;
               }

            }
        }
        return weight;

    }

    public boolean compare(Box box){
        return this.getWeight() == box.getWeight();
    }

    void merge(Box<T> box){
        Object[] mergeObjects = box.getObjects();
        for (int i=0; i<mergeObjects.length; i++){
            if (mergeObjects[i]!=null)
                add((T) mergeObjects[i]);
                mergeObjects[i]=null;
        }

    }

    public int size(){
        int size = 0;
        for (int i = 0; i<objects.length; i++){
            if (objects[i]!=null)
                size+=1;
        }
        return size;
    }
}
