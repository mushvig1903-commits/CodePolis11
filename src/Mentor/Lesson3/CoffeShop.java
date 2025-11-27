package Mentor.Lesson3;

import java.util.Scanner;

public class CoffeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cofe Shopa Xosh Gelmisiniz");
        System.out.println("Zehmet olmasa kofenizi secin: 1 - Americano, 2 - Cappucino, 3 - Caffe Latte, 4 - Caffe Mokko");
        int choice = sc.nextInt();
        double price = 0.0;
        switch (choice){
            case 1:
                price = 5.9;
                System.out.println("Americano ");
                break;
            case 2:
                price = 6.9;
                System.out.println("Cappucino");
                break;
            case 3:
                price = 7.9;
                System.out.println("Caffe Latte ");
                break;
            case 4:
                price = 8.9;
                System.out.println("Caffe Mokko ");
                break;
            default:
                System.out.println("Təssüf ki bu kofe mövcud deyil");
                return;
        }


        System.out.println("Yaşınızı qeyd edin: ");
        int age = sc.nextInt();
        double dicount = 0;
        if (age <= 12){
            dicount = 0;
            System.out.println("12 yaşdan aşağı uşaqlar üçün içki pulsuzdur");
        }else if (age>= 13 && age<= 17){
            dicount = 0.5;
            System.out.println("İçkilərimiz üçün 50%  şagird endirimi qazandınız");
        }else if (age >= 65){
            dicount = 0.9;
            System.out.println("Sizə kofenli məhsullar tövsiyə edilmir 10 % endirim");
        }else if (age>=18 && age<65){
            dicount = 0.7;
            System.out.println("30 % Endirim qzandiniz");
        }
        double finalPrice = price * dicount;
        System.out.println("ödənişiniz " + finalPrice + " AZN");


    }
}
