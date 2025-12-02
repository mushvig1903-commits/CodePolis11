package Main.lesson5;

import java.awt.color.ICC_ColorSpace;
import java.util.Arrays;

public class temperatures {
    public static void main(String[] args) {
        double [] temperatures = new double[7];
        temperatures[0] = 20.1;
        temperatures[1] = 23.2;
        temperatures[2] = 19.5;
        temperatures[3] = 24.7;
        temperatures[4] = 23.3;
        temperatures[5] = 17.2;
        temperatures[6] = 28.0;
        double avarage = 0;
        double maxTemp = temperatures[0];
        double minTemp = temperatures[0];
        for(double temp: temperatures){
            avarage += temp;
            if (maxTemp<temp){
                maxTemp = temp;
            }
        }
        System.out.println("Temperaturlar: " + Arrays.toString(temperatures));
        System.out.println("Max temperatures: " + maxTemp);
        System.out.println("Orta Həftəlik Temperatur: " + String.format( "%.1f", avarage/temperatures.length));

    }
}
