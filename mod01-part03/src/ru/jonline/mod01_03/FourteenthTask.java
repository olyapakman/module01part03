package ru.jonline.mod01_03;

//Дано натуральное n. Вычислить: 1+1/2+1/3+1/4+...+1/n

import java.util.Scanner;

public class FourteenthTask {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = vvod.nextInt();
        double x;
        double sum = 0;

        for (x=1; x<=n; x++) {
            sum += 1/x;
        }
        System.out.println("Результат выражения "+sum);
    }
}
