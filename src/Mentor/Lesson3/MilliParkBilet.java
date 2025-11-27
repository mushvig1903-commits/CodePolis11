package Mentor.Lesson3;

import java.util.Scanner;

public class MilliParkBilet {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // (int olaraq: 1-Hiking, 2-Camping, 3-Biking).
        System.out.println("Milli Parka Xosh Gelmisiz");
        System.out.println("1-Hiking, 2-Camping, 3-Biking");
        System.out.println("Zehmet olmasa secim edin: ");
        int choice = sc.nextInt();

        if (choice == 1){
            System.out.println("Heç bir endirim yoxdur.");
        }else if (choice == 2){
            System.out.println("Çadır ləvəzımatlarına 15% endirim.");
        } else if (choice == 3){
            System.out.println("Velosiped icarəsinə 25% endirim.");
        } else {
            System.out.println("Duzgun secim etmediniz");
        }
        System.out.println("Zehmet olmasa marshurut secimi edin: ");
        System.out.println("1-asan, 2-orta asan, 3-cetin, 4-profesional");

        System.out.println("\nMövcud gəzinti marşrutları:");
        System.out.println("1 - Meşə yolu");
        System.out.println("2 - Dağ yolu");
        System.out.println("3 - Çay kənarı");
        System.out.println("4 - Göl ətrafı");
        int choice2 = sc.nextInt();

        switch (choice2){
            case 1:
                System.out.println("Hər kəs qatıla bilər");
                break;
                case 2:
                    System.out.println("18 yashadan yuxari qatila biler");
                    break;
                    case 3:
                        System.out.println("Dag tecrubesi olanlar qatila biler");
                        break;
                        case 4:
                            System.out.println("Yalniz Profesionallar ucundur");
                            break;
                            default:
                                System.out.println("Duzgun secim etmediniz");
        }






    }
}
