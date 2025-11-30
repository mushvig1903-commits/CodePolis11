package Mentor.Lesson4;

import java.util.Scanner;

public class BookShelver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kitablari Reflere yerleshdirin: ");

        int book = sc.nextInt();
        for (int i = 1; i<= 10; i++) {
            if (i <= book){
                System.out.println("Kitab nömrə " + i + " Rəfə qoyuldu və nömrələndi.");
            }

        }
        System.out.println("Bütün " + book + " kitab rəfə yerləşdirildi.");
    }
}
