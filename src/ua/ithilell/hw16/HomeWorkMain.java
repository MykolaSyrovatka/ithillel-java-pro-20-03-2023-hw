package ua.ithilell.hw16;

import java.util.Arrays;

public class HomeWorkMain {

    public static void main(String[] args) {
        int[] array = new int[]{11, 5, 4, 2, 7, 1, 10, 3, 9, 6, 8, 10};
        quickSort(array, 0, array.length-1);
        //shakerSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {

        if (array.length == 0 && array == null)
            return;
        if (left >= right)
            return;
        int pivot = array[right];
        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(array, left, j);

        if (right > i)
            quickSort(array, i, right);
    }


    public static void shakerSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                }
            }
            left++;
        }

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
