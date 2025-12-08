package Mentor.Lesson6OOP;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArrays {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int colums = sc.nextInt();
        int matrix [][] = new int[row][colums];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < colums; j++){
                System.out.printf("Elements [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < row; i++){ maxRow = i;
            for (int j = 0; j < colums; j++){ maxCol = j;
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Massivin ən böyük ədədi: " + max +
                " İndeks: [" + maxRow + "][" + maxCol + "]");
        sc.close();
    }
}
