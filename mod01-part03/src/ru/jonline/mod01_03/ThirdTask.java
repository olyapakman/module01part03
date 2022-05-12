package ru.jonline.mod01_03;

//Необходимо вывести на экран талицу умножения на 3.

public class ThirdTask {
    public static void main(String[] args) {
        int x = 0;
        int comp;
        while (x<9) {
            x++;
            comp = x*3;
            System.out.println(x+" x 3 = "+comp);
        }
    }
}
