package ru.jonline.mod01_03;

//Вычислить 1+2+4+8+...+2^10

import java.lang.Math;

public class FifteenthTask {
    public static void main(String[] args) {
        int x = -1;
        int sum = 0;

        while (x<10) {
            sum += Math.pow(2,x);
            x++;
            System.out.println(x);
        }
        System.out.println("Результат выражения равен "+sum);
    }

}
