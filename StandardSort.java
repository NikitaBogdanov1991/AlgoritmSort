package LesAlg1;

import java.util.Arrays;
import java.util.Random;

public class StandardSort {
    public static void main(String[] args) {
        int arraySize = 1000;
        int[] arr = new int[arraySize];
        generate(arr, arraySize);

        Arrays.sort(arr);

        for (int i = 0; i < arraySize; i++)
            System.out.print(arr[i] + " ");
    }
    public static void generate(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = new Random().nextInt(100) + 300;
        }
    }
}
