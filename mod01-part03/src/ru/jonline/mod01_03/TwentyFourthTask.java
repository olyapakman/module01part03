package ru.jonline.mod01_03;

//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в другое число
//цифры которого будут следовать в обратном порядке по сравнению с введенным числом.

import java.util.Scanner;

public class TwentyFourthTask {
    public static void main(String[] args) {
        Scanner vvod = new Scanner (System.in);
        System.out.println("Введите натуральное число");
        int n = vvod.nextInt();
        int x;
        int sum = 0;

        while (n>=1) {
            x = n%10;
            if ((x%2) == 0) {
                sum += x;
            }
            n = Math.floorDiv(n, 10);
            System.out.print(x);
        }
        System.out.println(" Сумма четных цифр введенного числа равна "+sum);
    }
}
