package com.startjava.lesson_4.arraytasks;

public class SumChetPolElemArray {
    public static void main(String[] args) {
        int[] numbers = {-3, 34, 75, -56, 94, 23, 27};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 0 && numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
