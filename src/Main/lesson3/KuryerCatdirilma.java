package Main.lesson3;

import java.util.Scanner;

public class KuryerCatdirilma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kuryer Catdirilma Xidmeti");
        System.out.println("Zehmet olmasa danışnacaq şəhəri qeyd edin");
        System.out.println("Çatdırılma yalnız Bakı, Sumqayıt və Xırdalan şəhərləri ərazisində mövcuddur.");
        String deliveryCity = sc.next();
        int deliveryCost = sc.nextInt();
        int deliveryPrice = 0;

        switch (deliveryCity.toLowerCase()){
            case "baki":
                deliveryPrice = 5;
                //System.out.println("Çatdırılma 5 AZN.");
                break;
            case "sumqayit":
                deliveryPrice = 7;
                //System.out.println("Çatdırılma 7 AZN.");
                break;
            case "xirdalan":
                deliveryPrice = 6;
                //System.out.println("Çatdırılma 6 AZN.");
                break;
            default:
                System.out.println("Xidmət mövcud deyil");
        }
        if (deliveryCost>=50){
            System.out.println("Catdirilma pulsuzdur");
        } else  {
            System.out.println("sizin catdirilmaziniz " + deliveryPrice + " AZN olacaq");
        }





    }
}
