package ru.jonline.mod01_03;

//С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне
//от 1 до 99 включительно
public class FifthTask {
    public static void main(String[] args) {
        int x = 0;
        int result=0;
        while (x<100) {
            if ((x%2) != 0) {
                result+=x;
            }
            x++;
        }
        System.out.println("Сумма всех нечетных чисел в диапазоне от 1 до 99 равна "+result);
    }
}
