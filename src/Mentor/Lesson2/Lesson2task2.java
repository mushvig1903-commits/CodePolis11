package Mentor.Lesson2;

import java.util.Scanner;

public class Lesson2task2 {
    public static void main(String[] args) {


        System.out.println("International Shipping Volume and Cost");
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter Length sm: ");
        double length = sc.nextDouble();
        System.out.print("Eneter Width sm: ");
        double width = sc.nextDouble();
        System.out.print("Eneter Height sm: ");
        double height = sc.nextDouble();
        double volumeCalculation = length * width * height;
        System.out.println("Volume Colculation: " + volumeCalculation + " sm³");
        double volumeWeight = volumeCalculation/6000;
        System.out.println("Volume Weigth: " + volumeWeight + "kg");
        double finalShippingPrice = volumeWeight * 1.5;
        System.out.println("Shipping Price: " + finalShippingPrice + " AZN");
    }



}
