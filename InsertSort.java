package LesAlg1;

import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        int arraySize = 1000;
        int[] input = new int[arraySize];
        generate(input, arraySize);


        for (int i = 1; i < arraySize; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
        for (int i = 0; i < arraySize; i++) {
            System.out.print(input[i] + " ");
        }
    }
    public static void generate(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = new Random().nextInt(100) + 300;
        }
    }
}
