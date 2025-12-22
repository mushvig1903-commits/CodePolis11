package Main.lesson9;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        // Object
        // Throwable
        // Exception  -- Error

        Scanner sc = new Scanner(System.in);
        Product phone = new Product("Iphone", 14);
        Order order = new Order();

        System.out.println("Mehsul sayini daxil edin: ");

        try {
            order.createOrder(phone, sc.nextInt());
        }catch (OutOfStockException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

