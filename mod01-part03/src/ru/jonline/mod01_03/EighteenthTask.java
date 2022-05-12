package ru.jonline.mod01_03;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
//a=((-1)^(n-1))/n
public class EighteenthTask {
    public static void main(String[] args) {
        double e = 0.6;
        double a = 0;
        double result = 0;

        for (int n = 1; n < 20; n++) {
            a += Math.pow(-1, n - 1) / n;
            if (Math.abs(a) >= e) {
                result += a;
            }
        }
        System.out.println("Сумма модулей членов ряда равна " + result);
    }
}
