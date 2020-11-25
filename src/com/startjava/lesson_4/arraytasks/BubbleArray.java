package com.startjava.lesson_4.arraytasks;

import java.util.Arrays;

public class BubbleArray {
    public static void main(String[] args) {
        int[] array = {5, 45, 73, 19, 43, 22};
        boolean isSorted = false;
        int buffer;
        while(!isSorted) {
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    isSorted = false;

                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
