package ru.jonline.mod01_03;

//Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h. Результат представить
//в виде таблицы, первые столбцы которой - значения аргумента, вторые - соответствующие значения функции.
//  F(x) = x - sinx
import java.lang.Math;

public class TwentyFirstTask {
    public static void main(String[] args) {
        int a = 2;
        int b = 26;
        int h = 4;
        double result = 0;

        for (int x = a; x<=b; x+=h) {
            result += x - Math.sin(x);
            System.out.println("x = "+x+"  F(x) = "+result);
        }
    }
}
