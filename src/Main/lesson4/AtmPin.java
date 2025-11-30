package Main.lesson4;

import java.util.Scanner;

public class AtmPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ATM-ə xoş gəlmisiniz.");
        int truePin = 1903;
        int attempts = 0;

        while (attempts < 3) {
            System.out.println("PIN daxil edin: ");
            int pin = sc.nextInt();

            if (pin == truePin) {
                System.out.println("Sisteme daxil oldunuz ");
                break;
            } else {
                attempts++;
                if (attempts == 3) {
                    System.out.println("Kartiniz bloklandi");
                } else {
                    System.out.println("Yalnish PIN kod, yeniden cehd edin! ");
                }
            }
        }
    }
}
