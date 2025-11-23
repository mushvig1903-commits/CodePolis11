package Mentor.Lesson2;

import java.util.Scanner;

public class Lesson2task4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("$İpoteka Krediti Hesablma Kalkulyatoru$");
        System.out.print("Mənzilin dəyərini daxil et: " );
        double housePrice = input.nextDouble();
        System.out.print("İlkin ödəniş faizini daxil et %: ");
        int downPaymentPrecent = input.nextInt();
        System.out.print("İllik Faizi Daxil et %: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Kredit Müdətini daxil et: ");
        int years = input.nextInt();

        //ilkin odenish remaningDebtor = qalan borc
        double downPayment = (housePrice*downPaymentPrecent)/100;
        double loanAmount = housePrice - downPayment;
        double monthlyRate = (annualInterestRate/100)/12;
        int months = years*12;
        //M = P \cdot \frac{r(1+r)^n}{(1+r)^n - 1}
        double monthlyPayment = (int)(loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1));
        System.out.println("Menzilin qiyməti " + housePrice + "AZN");
        System.out.println("İlkin ödənişin məbləği " + downPayment + "AZN");
        System.out.println("Kredit Müddəti: " + years + " il");
        System.out.println("İllik Faiz Dərəcəsi: " + annualInterestRate + "%");
        System.out.println("Aylıq Ödəniş: " + monthlyPayment + "AZN" );











    }
}
