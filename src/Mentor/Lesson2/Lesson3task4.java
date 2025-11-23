package Mentor.Lesson2;

import java.util.Scanner;

public class Lesson3task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Seconds: " );
        long totalSeconds = input.nextLong();
        int hours = (int) (totalSeconds/3600);
        int minutes = (int) ((totalSeconds%3600) / 60);
        int seconds = (int) (totalSeconds%60);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        // HH:MM:SS formatında çap
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);


    }
}
