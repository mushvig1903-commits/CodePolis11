package Mentor.Lesson5;

import java.util.Arrays;

public class ArraySingle {
    public static void main(String[] args) {
        //Array Single

        // data_Type [] variable = new data_Type [3];

        int [] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("Indeks : " + i + " - " + arr[i]);
        }
        System.out.println(arr.length);

        String [] strArr = new String[4];

        strArr [0] = "A";
        strArr [1] = "B";
        strArr [2] = "C";
        strArr [3] = "D";
        for (String str : strArr){
            System.out.println(str);
        }

        String [] strArray = {"Murad", "Elmar", "Mushviq", "Ali"};

        Arrays.stream(strArray).forEach(System.out::println);
        System.out.println(Arrays.toString(strArray));
        Arrays.sort(strArray);
        for (String str : strArray){
            System.out.println(str);
        }
    }
}
