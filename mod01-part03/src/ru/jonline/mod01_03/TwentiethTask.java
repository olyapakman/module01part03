package ru.jonline.mod01_03;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
//a=1/((3n-2)(3n+1))
public class TwentiethTask {
    public static void main(String[] args) {
        double e = 0.004;
        double a = 0;
        double result = 0;

        for (int n = 1; n < 7; n++) {
            a = (3*n-2)*(3*n+1);
            a = 1/a;
            if (Math.abs(a)>=e) {
                result += a;
            }
            System.out.println("a = "+a);
        }
        System.out.println("Сумма членов ряда равна "+result);
    }
}
