package Mentor.Lesson5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class changeArray {
    static void main(String[] args) {
        int[] qiymetler = new int[6];
        int[] yeniQiymetler = new int[6];
        qiymetler[0] = 10;
        qiymetler[1] = 20;
        qiymetler[2] = 30;
        qiymetler[3] = 40;
        qiymetler[4] = 50;
        qiymetler[5] = 60;
        for (int i = 0; i < qiymetler.length; i++){
            yeniQiymetler[i] = qiymetler[i]+5;
        }
        System.out.println("Massivin evvelki deyerleri: " + Arrays.toString(qiymetler));
        System.out.println("Massivin yeni deyerleri: " + Arrays.toString(yeniQiymetler));




    }
}
