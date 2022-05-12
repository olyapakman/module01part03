package ru.jonline.mod01_03;

import java.lang.Math;

//Найти сумму квадратов первых ста чисел
public class NinethTask {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        while (x<100) {
            x++;
            y += Math.pow(x,2);
        }
        System.out.println("Сумма квадратов первых ста чисел равна "+y);
    }
}
