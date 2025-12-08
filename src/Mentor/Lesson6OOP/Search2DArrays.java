package Mentor.Lesson6OOP;

import java.util.Scanner;

public class Search2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Massivin ölçülərini daxil etmək
        System.out.print("Sətirlərin sayını daxil edin: ");
        int rows = sc.nextInt();
        System.out.print("Sütunların sayını daxil edin: ");
        int cols = sc.nextInt();

        // Dinamik 2D massiv yaradılır
        int[][] matrix = new int[rows][cols];

        // Elementləri daxil etmək
        System.out.println("Massivin elementlərini daxil edin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element [%d][%d] = ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        // Axtarış
        System.out.print("Axtarmaq istədiyiniz ədədi daxil edin: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Ədəd tapıldı! İndeks: [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Ədəd massivdə mövcud deyil.");
        }

        sc.close();
    }
}
