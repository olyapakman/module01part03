package ru.jonline.mod01_03;

//Вычислить значение функции на отрезке [a,b] с шагом h
public class SeventhTask {
    public static void main(String[] args) {
        int x = -20;
        int y;

        while (x<10) {
            x = x + 2;
            if (x>2) {
               y = x;
            } else {
                y = -x;
            }
            System.out.println("На отрезке [-20,10] при x = "+x+" значение функции равно "+y);
        }
    }
}
