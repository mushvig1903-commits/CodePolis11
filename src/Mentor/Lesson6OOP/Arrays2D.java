package Mentor.Lesson6OOP;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int colm = sc.nextInt();
        int [][] dinamicArrays = new int[rows][colm];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < colm; j++){
                System.out.printf("Element [%d][%d] = ",i,j);
                dinamicArrays[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print(dinamicArrays[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();

    }
}
