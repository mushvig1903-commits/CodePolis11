package Main.lesson6.EWallet;

public class EWallet {
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount + "AZN yatirildi. Yeni balans: " + balance + " AZN");
        }
        else {
            System.out.println("Balansa pul yatirmadiniz.....");

        }

    }
    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Mebleg sifir ola bilmez! ");
        } else if (amount > balance) {
            System.out.println("Balans kifayet etmir! Movcud Balans: " + balance);

        }
        else {
            balance -= amount;
            System.out.println(amount + "AZN cixarildi. Yeni balans " + balance + " AZN");
        }
    }
}
