package ru.jonline.mod01_03;

import java.lang.Math;

//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class TenthTask {
    public static void main(String[] args) {
        int x = 0;
        long comp = 1L;

        while (x<200) {
            x++;
            comp *= Math.pow(x,2);
        }
        System.out.println("Произведение квадратов первых двухсот чисел равно "+comp);
    }
}
