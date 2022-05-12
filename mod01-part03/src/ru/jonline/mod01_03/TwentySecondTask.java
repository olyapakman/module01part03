package ru.jonline.mod01_03;

//Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h. Результат представить
//в виде таблицы, первые столбцы которой - значения аргумента, вторые - соответствующие значения функции.
// F(x) = sin^2 (x)
import java.lang.Math;

public class TwentySecondTask {
    public static void main(String[] args) {
        int a = 3;
        int b = 51;
        int h = 6;
        double result = 0;

        for (int x = a; x <= b; x += h) {
            result += Math.pow(Math.sin(x),2);
            System.out.println("x = "+x+"    F(x) = "+result);
        }
    }
}
