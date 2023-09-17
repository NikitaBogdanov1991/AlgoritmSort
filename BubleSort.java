package LesAlg1;

import java.util.Random;

public class BubleSort {
    public static void main(String[] args) {
        int arraySize = 1000;
        int[] arr = new int[arraySize];
        generate(arr, arraySize);

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 1; j < arraySize - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arraySize; i++)
            System.out.print(arr[i] + " ");
    }
    public static void generate(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = new Random().nextInt(100) + 300;
        }
    }
}
