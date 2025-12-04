package Mentor.Lesson5;
import java.util.Arrays;
import java.util.Scanner;
public class massivScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Massivin uzunluğunu soruşuruq
        System.out.print("Massivin uzunluğunu daxil edin: ");
        int n = sc.nextInt();

        int[] qiymetler = new int[n];
        int[] yeniQiymetler = new int[n];

        // Massivin elementlərini daxil edirik
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "-ci elementi daxil edin: ");
            qiymetler[i] = sc.nextInt();
        }

        // Hər elementi 5 vahid artırırıq
        for (int i = 0; i < n; i++) {
            yeniQiymetler[i] = qiymetler[i] + 5;
        }

        System.out.println("Massivin əvvəlki dəyərləri: " + Arrays.toString(qiymetler));
        System.out.println("Massivin yeni dəyərləri: " + Arrays.toString(yeniQiymetler));
    }
}
