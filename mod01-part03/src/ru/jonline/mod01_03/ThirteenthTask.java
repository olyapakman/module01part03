package ru.jonline.mod01_03;

//Составить таблицу значений функции y=5-x^2/2 на отрезке [-5;5] с шагом 0,5

public class ThirteenthTask {
    public static void main(String[] args) {
        double a = -5;
        double b = 5;
        double h = 0.5;
        double y = 0;

        for (double x = a; x<=b; x+=h) {
            y += 5 - Math.pow(x,2)/2;
            System.out.println("При х = "+x+" y = "+y);
        }
    }
}
