package ru.jonline.mod01_03;

//Требуется определить факториал числа, которое ввел пользователь.

import java.util.Scanner;

public class TwentyFifthTask {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число");
        int n = vvod.nextInt();
        long fact = 1L;
        System.out.print("!n = ");

        for (int x = n; x >= 1; x--) {
            fact *= x;
            System.out.print("x"+x);
        }
        System.out.print(" = "+fact);
    }
}
