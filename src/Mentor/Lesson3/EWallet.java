package Mentor.Lesson3;

import java.util.Scanner;

public class EWallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balansınızdakı məbləği daxil edin: ");
        double balans = sc.nextDouble();
        if (balans < 100){
            System.out.println("Balans aşağıdır. Əlavə edin və 5% bonus qazanın.");
            
        } else if (balans > 100 && balans <=500) {
            System.out.println("Balans stabildir. Bütün əməliyyatlar sığortalanır.");

        } else if (balans > 500){
            System.out.println("Siz VIP müştərisiniz! Bütün köçürmələr pulsuzdur.");
        }
        System.out.println("Aşağıda göstərilən əməliiyat növlərindən birini seçin: ");
        System.out.println("1-Pul Köçürmə, 2-Balans Artırma, 3-Hesab Ödənişi, 4-Qızıl Alma.");
        int operation = sc.nextInt();
        System.out.println("Məbləği daxil edin: ");
        int money = sc.nextInt();
        switch (operation){
            case 1:
                System.out.println( money + " AZN pul köçürməniz uyğurla həyata keçirilmişdir");
                break;
            case 2:
                System.out.println(money + " AZN balansızına uğurla köçürülmüşdür. Hazırki balansınız " + (int)(money+balans) + " AZN");
                break;
            case 3:
                System.out.println("Hesabınıza " + money + " AZN məbləğında pul yatırılmışdır cari balansınız " + (int)(money+balans) + " AZN-dir" );
                break;
            case 4:
                double goldprice = 225.0;
                double goldAmount = (double) money / goldprice;
                System.out.println(money + " AZN-ə " + goldAmount + " qram qızıl aldınız.");
                break;
            default:
                System.out.println("Yalnış seçim etdiniz");

        }

    }
}
