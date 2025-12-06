package Main.lesson6.EWallet;

import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user1 = new User("Mushvig","Goja", "1903" );
        //sifre yoxlama
        System.out.println("Sifreni daxil edin: ");
        String inputPassword = sc.nextLine();

        if (user1.checkPassword(inputPassword)){
            System.out.println("Sifre duzgun daxil edildi.");
            //Pul yatirmaq
            System.out.println("Yatirmaq istediyiniz meblegi daxil edin: " );
            double depositeAmount = sc.nextDouble();
            user1.getWallet().deposit(depositeAmount);
            // Pul çıxarmaq
            System.out.print("Chixarmaq istediyiniz meblegi daxil edin: ");
            double withdrawAmount = sc.nextDouble();
            user1.getWallet().withdraw(withdrawAmount);
            // Balansı göstərmək
            System.out.println(user1.getName() + " " + user1.getSurname() +
                    " balansı: " + user1.getWallet().getBalance());
        }


        else {
            System.out.println("Sifre yalnishdir! Yeniden cehd edin:");
        }
        sc.close();


        //Balans emeliyyati
        //user1.getWallet().deposit(200);
        //user1.getWallet().withdraw(50);
        //user1.getWallet().withdraw(300);

        //Istifadeci melumatlari
//        System.out.println("Ad: " + user1.getName());
//        System.out.println("Soyad: " + user1.getSurname());
//        System.out.println("Balans: " + user1.getWallet().getBalance());




    }
}
