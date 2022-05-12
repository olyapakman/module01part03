package ru.jonline.mod01_03;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
//a = (1/2^n) + (1/3^n)

import java.lang.Math;
public class NineteenthTask {
    public static void main(String[] args) {
        double e = 0.03;
        double a = 0;
        double result = 0;

        for (int n = 1; n <= 5; n++) {
            a = 1/Math.pow(2,n) + 1/Math.pow(3,n);
            if (Math.abs(a)>=e) {
                result += a;
            }
            System.out.println("a = "+a);
        }
        System.out.println("Сумма членов ряда равна "+result);
    }
}
