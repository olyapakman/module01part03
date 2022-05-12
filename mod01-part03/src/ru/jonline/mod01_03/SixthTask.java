package ru.jonline.mod01_03;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все число от 1 до введенного пользователем числа

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int x = vvod.nextInt();
        int y = 0;
        int result = 0;

        if (x > 0) {
            while (y <= x) {
                result += y;
                y++;
            }
            System.out.println("Сумма чисел от 1 до введенного числа равна " + result);
        } else {
            System.out.println("Введено неверное число");
        }
    }
}
