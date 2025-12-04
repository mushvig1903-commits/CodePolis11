package Mentor.Lesson5;

import java.util.Arrays;

public class temperaturs1 {
    public static void main(String[] args) {
        double [] temp = new double[7];
        temp[0] = 20.1;
        temp[1] = 23.2;
        temp[2] = 19.5;
        temp[3] = 24.7;
        temp[4] = 23.3;
        temp[5] = 17.2;
        temp[6] = 28.0;
        double avarage = Arrays.stream(temp).max().getAsDouble();

        double maxTemp = temp[0];
        for (double temp1 : temp){
            if (temp1>maxTemp){
                maxTemp = temp1;
            }
        }

        System.out.println("En Yuksek Temperatur: " + maxTemp);
        System.out.println("En Yuksek Temperatur: " + avarage);


    }
}
