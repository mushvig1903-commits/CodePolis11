package Mentor.Lesson6OOP;

import java.util.*;

public class ArraysSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numers [][] = {
                {7,10,15},
                {27,1,22},
                {13,5,0}
        };
        List<Integer> list = new ArrayList<>();
        for (int[] row : numers){
            for (int val : row){
                list.add(val);
            }
        }
        Collections.sort(list);
        System.out.println("This is a sorted 1D list: " + list);

        }
    }
