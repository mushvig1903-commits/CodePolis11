package Mentor.Lesson2;

import java.util.Scanner;

public class Lesson2task1 {
    public static void main(String[] args) {
        System.out.println("Net Salary Calculator");
        Scanner sc = new Scanner(System.in);
        //Xalis Maaş Hesablayıcısı
        //Net Salary Calculator
        System.out.print("Enter Gross Salary AZN:");
        double gross = sc.nextDouble();
        System.out.print("Enter Tax % :");
        double taxProcent = sc.nextDouble();
        double tax = (int)(gross * taxProcent);
        double netSalary = gross - tax;
        System.out.println("Net Salary: " + netSalary + "AZN");



//        double grossSalary = 2234;
//        double taxInterest = 0.14;
//        double Tax = (int) (grossSalary * taxInterest);
//        double netSalary = grossSalary - Tax;
//
//
//        System.out.println("Gross Salary:" + grossSalary);
//        System.out.println("Tax:" + Tax);
//        System.out.println("Net Salary:" + netSalary);




    }
}
