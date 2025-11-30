package Mentor.Lesson4;

import java.util.Scanner;

public class PhoneBattery {
    public  static void main(String args[]) {
        int batteryLevel = 100;
        while (batteryLevel<=100){
            //batteryLevel-=10;
            System.out.println("Telefonun " + (batteryLevel-=10 )+ " % batarya omru qaldi");
            if (batteryLevel==0){
                System.out.println("Telefon sondu");
                break;
            }

        }


    }
}
