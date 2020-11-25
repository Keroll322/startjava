package com.startjava.lesson_4.arraytasks;

import java.util.Scanner;

public class ArrayMaxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int maxLength = sc.nextInt();
        int[] numbers = new int[maxLength];

        System.out.print("Заполните массив целыми числами через пробел: ");

        for(int i = 0; i < maxLength; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        for(int i = 0; i < maxLength - 1; i++) {
            if(max < numbers[i + 1]) {
                max = numbers[i + 1];
            }
        }

        System.out.println("Максимальное число = " + max);
    }
}
