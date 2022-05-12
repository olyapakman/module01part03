package ru.jonline.mod01_03;

//Вычислить значение функции на отрезке [a,b] с шагом h

public class EighthTask {
    public static void main(String[] args) {
        int a = -12;
        int b = 24;
        int h = 3;
        int c = 8;
        int y;

        for (int x = a; x<=b; x+=h) {
            if (x==15) {
                y = (x+c)*2;
            } else {
                y = (x-c)+6;
            }
            System.out.println("На отрезке [-12,24] при х = "+x+" значение функции равно "+y);
        }

    }
}
