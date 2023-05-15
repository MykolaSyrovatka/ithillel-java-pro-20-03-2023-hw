package ua.ithilell.hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<T>{

    public List toList(T[] arr){
        return new ArrayList<>(Arrays.stream(arr).toList());
    }

}
