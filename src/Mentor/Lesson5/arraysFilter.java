package Mentor.Lesson5;
import java.util.Arrays;

public class arraysFilter {
    static void main (String[] args){
        int[] ededler = {10, -5, 20, -15, 30, -25, 40, -35};
        System.out.println("Masivvin butun ededleri: " + Arrays.toString(ededler));
        Arrays.sort(ededler);
        for (int i = 0; i < ededler.length; i++){
            if (ededler[i]>0){
                System.out.println("Massivin musbet ededleri: " + ededler[i]);


            }
        }




    }
}
