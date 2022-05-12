package ru.jonline.mod01_03;

//Вычислить (1+2)*(1+2+3)*...*(1+2+...+10)
public class SixteenthTask {
    public static void main(String[] args) {
        int x = 1;
        int sum = 1;
        long comp = 1L;

        while (x<=10) {
            x++;
            sum += x;
            System.out.println("Сумма "+sum);
            comp *= sum;
        }
        System.out.println("Результат выражения равен "+comp);
    }
}
