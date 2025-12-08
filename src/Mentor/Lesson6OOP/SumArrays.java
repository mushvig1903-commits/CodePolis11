package Mentor.Lesson6OOP;

import java.util.zip.Checksum;

public class SumArrays {
    static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matrix.length; i++){
            int sum = 0;
            for (int j = 0; j < matrix.length; j++ ){
                sum += matrix[i][j];
            }
            System.out.println("Colum: " + i + " = Cem: " + sum);
        }
    }
}
