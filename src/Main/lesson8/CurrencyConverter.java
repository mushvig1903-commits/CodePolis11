package Main.lesson8;

public class CurrencyConverter {
    //ortaq komisiya miqdari
    public static double commissionRate = 0.01; // 1 %

    public static void setCommissionRate(double newRate) {
        commissionRate = newRate;
    }

    public static double getCommissionRate() {
        return commissionRate;
    }
}
