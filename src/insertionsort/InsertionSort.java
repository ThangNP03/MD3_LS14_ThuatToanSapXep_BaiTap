package insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Step " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
