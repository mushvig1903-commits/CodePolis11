package Mentor.Lesson6OOP;

import java.lang.constant.ClassDesc;
import java.util.Scanner;

public class PrintArrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massivin sətirlərinin uzunluğunu daxil edin: ");
        int row = sc.nextInt();
        System.out.println("Massivin sütünlarının uzunluğunu daxil edin: ");
        int col = sc.nextInt();
        int matrix [][] = new int[row][col];

        System.out.println("Massivin elementlerini daxil edin: ");
        for (int i = 0; i < row; i++){
            System.out.println();
            for (int j = 0; j < col; j++){
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println("["+i+"]" + "-ci sətrin " + "["+j+"]" + "-ci sütununun aldığı dəyər: " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
