package ru.jonline.mod01_03;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
// Таблица ASCII
public class TwentySixthTask {
    public static void main(String[] args) {

        for (int x = 192; x < 207; x++) {
            System.out.println(x+"   "+(char)x);
        }
    }
}
