package ru.jonline.mod01_03;

//Составить программу для вычисления значений функции F(x) на отрезке [a,b] с шагом h. Результат представить
//в виде таблицы, первые столбцы которой - значения аргумента, вторые - соответствующие значения функции.
//    F(x) = ctg(x/3) + 1/2*sin(x)
import java.lang.Math;

public class TwentyThirdTask {
    public static void main(String[] args) {
        double a = 1.5;
        double b = 6.5;
        double h = 0.5;
        double result = 0;

        for (double x = a; x <= b; x += h) {
            result += 1/Math.tan(x/3) + 1/2*Math.sin(x);
            System.out.println("x = "+x+"    F(x) = "+result);
        }
    }
}
