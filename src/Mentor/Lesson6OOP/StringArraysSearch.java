package Mentor.Lesson6OOP;

import java.util.Scanner;

public class StringArraysSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int colm = sc.nextInt();
        String matrix [][] = new String[row][colm];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < colm; j++){
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix[i][j] = sc.next();

            }
        }
        System.out.println("Enter the name to search: ");
        String searchName = sc.next();
        boolean found = false;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < colm; j++){
                if (matrix[i][j].equalsIgnoreCase(searchName)){
                    System.out.println("Name " + searchName +  " found at index [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if (found)break;
        }
        if (!found){
            System.out.println("Name not found in the matrix.");
        }
        sc.close();


    }
}
