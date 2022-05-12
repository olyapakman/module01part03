package ru.jonline.mod01_03;

//Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.

public class TwentyNinethTask {
    public static void main(String[] args) {
        int a = 35468;
        int b = 164872;

        int[] arr = new int[10];
        while (a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while (b != 0) {
            if(arr[b % 10] != 0)
                System.out.println(b % 10);
            b /= 10;
        }



    }
}
