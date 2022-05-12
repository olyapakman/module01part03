package ru.jonline.mod01_03;

//С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100.
public class FourthTask {
    public static void main(String[] args) {
        int x = 1;
        while (x<100) {
            if ((x%2)==0) {
                System.out.println(x);
            }
            x++;
        }
    }
}
