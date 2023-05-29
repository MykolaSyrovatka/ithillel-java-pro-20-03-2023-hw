package ua.ithilell.hw16;

public class HomeWorkMain {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(array, 2));
    }


    public static int binarySearch(int[] array, int searchInt){
        int min = 0;
        int max = array.length-1;
        int mid = (min + max)/2;
        int count = 0;
        int searchIntPosition = -1;

        while (mid<max){

            if (searchInt == array[mid]){
                count++;
                searchIntPosition = mid;
                break;
            } else if (searchInt > array[mid]) {
                min = mid;
                mid = (min + max)/2;
                count++;
            } else {
                max = mid;
                mid = (min + max)/2;
                count++;
            }

        }
        return searchIntPosition;
    }



}
