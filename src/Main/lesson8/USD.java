    package Main.lesson8;

    public class USD extends Currency{
        private static final double RATE = 1.7;

        @Override
        public double convertToAzn(double amount) {
            double azn = amount * RATE;
            double commision = azn * CurrencyConverter.getCommissionRate();
            return azn - commision;
        }

    }
