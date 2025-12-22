package Main.lesson8;

public class EUR extends Currency{
    private static double RATE = 1.8;

    @Override
    public double convertToAzn(double amount) {
        double azn = amount * RATE;
        double commision = azn * CurrencyConverter.getCommissionRate();
        return azn - commision;
    }
}
