package week1;

public class task2 {
    public static void main(String[] args) {
        System.out.println("$$$Big Sale$$$ - Black Friday");
        float productPrice;
        productPrice = 1990.5f;
        System.out.println("productPrice: " + productPrice + " $ ");
        int discount;
        discount = 30;
        System.out.println("discount: " + discount + "%");
        float finalPrice;
        finalPrice = productPrice - (discount * productPrice/100);
        System.out.println("finalPrice:" + finalPrice + " $ ");
    }
}
