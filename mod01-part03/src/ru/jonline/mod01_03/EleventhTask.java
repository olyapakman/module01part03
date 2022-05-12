package ru.jonline.mod01_03;

//Составить программу нахождения разности кубов первых двухсот чисел
public class EleventhTask {
    public static void main(String[] args) {
        int x = 0;
        int result = 0;

        while (x<200) {
            x++;
            result -= Math.pow(x,3);
        }
        System.out.println("Разность кубов первых двухсот чисел равна "+result);
    }
}
