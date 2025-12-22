package Main.lesson9;

public class Order {
    public void createOrder (Product product, int count) {
        if (count> product.getStock()){
            throw new OutOfStockException("Stokda yeteri qeder mehsul yoxdur");
        } else if (count < 0) {
            throw new IllegalArgumentException("Miqdar menfi (-) ola bilmez");
            
        }
    }
}
