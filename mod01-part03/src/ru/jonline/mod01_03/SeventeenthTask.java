package ru.jonline.mod01_03;

//Даны действительное (а) и натуральное (n), вычислить а(а+1)...(а+n-1)

public class SeventeenthTask {
    public static void main(String[] args) {
        double a = 4;
        int n = -1;
        int result = 1;

        while (n<10) {
            result *= a+n;
            n++;
            System.out.println("n = "+n);
        }
        System.out.println("Значение выражения "+result);

    }
}
