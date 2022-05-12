package ru.jonline.mod01_03;

//Последовательность an строится так: а1 = 1, an = 6 + a(n-1), для каждого n>1.
//Составить программу нахождения произведения первых 10 членов этой последовательности


public class TwelfthTask {
    public static void main(String[] args) {
        int a = 0;
        int n = 0;
        long result = 1L;

        while (n<10) {
            n++;
            a += 6;
            result *= a;
            System.out.println("а = "+a);
        }
        System.out.println("Произведение первых 10 членов последовательность равно "+result);
    }


}
