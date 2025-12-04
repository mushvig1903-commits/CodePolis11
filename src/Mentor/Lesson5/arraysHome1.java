package Mentor.Lesson5;

import java.util.Arrays;

public class arraysHome1 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 10;
        arr[3] = 6;
        arr[4] = 9;
        int avarage = 0;
        int maxArr = Arrays.stream(arr).sum();
        System.out.println("Massivdeki edelerin cemi: " + maxArr);
        System.out.println("Massivdeki ededlerin ededi ortasi: " + maxArr/arr.length);







    }
}
