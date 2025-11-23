package Mentor.Lesson2;

import java.util.Scanner;

public class Lesson2task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Stock Code: ");
        String stockCode = input.nextLine();
        for (int i = 0; i < stockCode.length(); i++) {
            System.out.println((char)stockCode.charAt(i));
            char codeCharacter = stockCode.charAt(i);
            System.out.println("Code Character: " + codeCharacter);
            int ascii = (int) codeCharacter;
            int securityCode = (int) ((codeCharacter/32) -10);
            System.out.println("ASCII Code: " + ascii);
            System.out.println("Security Code: " + securityCode);
        }
        char codeCharacter = stockCode.charAt(1);
        System.out.println("Code Character: " + codeCharacter);
        int ascii = (int) codeCharacter;
        int securityCode = (int) ((codeCharacter/32) -10);
        System.out.println("ASCII Code: " + ascii);
        System.out.println("Security Code: " + securityCode);




    }
}
