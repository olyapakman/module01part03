package ru.jonline.mod01_03;

//Написать программу, в которой вводится 2 операнда X и Y и знак операции (+,-,/,*).
// Вычислить результат Z в зависимости от знака. Вычислить реакцию на возможный неверный знак, а также
// на ввод Y=0 при делении. Органиховать возможность многократных вычислений без перезагрузки программы, т.е
//построить цикл. В качестве символа прекращения операции принять '0'

import java.util.Scanner;

public class TwentyEighthTask {
    public static void main(String[] args) {
        int x;
        int y;
        String oper;
        int z = 0;

        do {
            Scanner vvodOne = new Scanner(System.in);
            System.out.println("Введите первое число");
            x = vvodOne.nextInt();
            Scanner vvodTwo = new Scanner(System.in);
            System.out.println("Введите второе число");
            y = vvodTwo.nextInt();
            Scanner vvodThree = new Scanner(System.in);
            System.out.println("Введите знак операции");
            oper = vvodThree.next();

            switch (oper) {
                case "+":
                    z = x + y;
                    break;
                case "-":
                    z = x - y;
                    break;
                case "*":
                    z = x * y;
                    break;
                case "/":
                    z = x/y;
                    if (y == 0) {
                        System.out.println("Ошибка");
                    }
                    break;
                default:
                    System.out.println("Введен неверный знак");
            }
            System.out.println("Результат вычисления: "+z);

        } while (x != 0 && y != 0);
    }
}
