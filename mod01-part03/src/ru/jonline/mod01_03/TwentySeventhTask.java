package ru.jonline.mod01_03;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа
// m и n вводятся с клавиатуры

import java.util.Scanner;

public class TwentySeventhTask {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите первое число");
        int m = vvod.nextInt();
        Scanner vvodTwo = new Scanner(System.in);
        System.out.println("Введите второе число");
        int n = vvodTwo.nextInt();
        int d;

        for (int x = m; x <= n; x++) {
            System.out.println("Для числа "+x+" делители: ");
            for (d = 2; d < x; d++) {
                if (x%d == 0) {
                    System.out.print(" "+d);
                    System.out.println(" ");
                }
            }
        }

    }
}
