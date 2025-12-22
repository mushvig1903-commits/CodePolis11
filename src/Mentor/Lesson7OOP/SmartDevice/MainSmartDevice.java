package Mentor.Lesson7OOP.SmartDevice;

import java.util.Scanner;

public class MainSmartDevice {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartWatch watch = new SmartWatch("Apple", "14 Pro");
        SmartHeadphones headphones = new SmartHeadphones("Bang & Olufsen", "Beoplay H100");
        SmartFridge fridge = new SmartFridge("Samsung", "Bespoke 4-Door Flex (AI Family Hub):");
              //Wifi ye qoshulma
        watch.connectToWifi();
        headphones.connectToWifi();
        fridge.connectToWifi();
        //oz funksiyalari
        watch.trackHeartRate();
        headphones.playMusic("Qaraqan - qızım");

        System.out.println("Soyuducunun temperaturunu daxil edin: ");
        int userTemp = scanner.nextInt();
        fridge.showTemperaturs(userTemp);

        watch.disconnect();
        headphones.disconnect();
        fridge.disconnect();

    }
}
