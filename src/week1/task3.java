package week1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ad daxil et ");
        String s = sc.nextLine();
        System.out.println("Adiniz " + s);


        boolean isLoggedIn = true;
        boolean hasSubscription = false;
        // istifadəçi kontent görə bilərmi? AND
        boolean CanWatchContent = isLoggedIn && hasSubscription;

        // hesab aktiv sayılırmı? OR
        boolean IsAccountActive = isLoggedIn || hasSubscription;
        System.out.println("Can Watch Content ?" + " " + CanWatchContent);
        System.out.println("Is Account Active ?" + " " + IsAccountActive);

        sc.close();


    }
}
