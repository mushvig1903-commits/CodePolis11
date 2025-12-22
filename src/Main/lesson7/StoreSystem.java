package Main.lesson7;

import Mentor.Lesson8.ApparelProduct;
import Mentor.Lesson8.ElectronicProduct;
import Mentor.Lesson8.Product;

public class StoreSystem {
    static void main(String[] args) {

        System.out.println("Hi welcome mini Eshop-market ....");

        ElectronicProduct smartPhone = new ElectronicProduct("Iphone", 999.0,11,"2 years");
        ApparelProduct apparel = new ApparelProduct("Zara",109.90, 6, "L");
        Product book = new Product("Shantaram", 29.9,10);

        smartPhone.showInfo();
        apparel.showInfo();
        book.showInfo();

        System.out.println("______________________");

        System.out.println("Sifarishlerini tesdiq edin");

        Order order = new Order();
        order.createOrder(smartPhone,10);
        System.out.println("Sifarish verildi.... ");

        order.calculateTotalPrice(smartPhone,10,0.15);
        System.out.println("Sifarish yerine yetirildi");
        System.out.println(smartPhone.getStock());

    }
}
