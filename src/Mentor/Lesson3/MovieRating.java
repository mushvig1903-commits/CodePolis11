package Mentor.Lesson3;

import java.lang.constant.ClassDesc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Baxdığınız filmə 1-dən 10-a qədər qiymət verin.");
        int reyting = sc.nextInt();
        if (reyting >= 1 && reyting <=4){
            System.out.println("Çox pis qiymətləndirmə. Niyə belə bəyənmədiniz?");
            
        } else if (reyting > 5 && reyting <= 7) {
            System.out.println("Orta qiymətləndirmə. Daha yaxşı filmlər tapaq!");
            
        } else if (reyting >= 8 && reyting <= 10) {
            System.out.println("Əla seçim! Bu filmi dostlarınıza tövsiyə etdiyinizə əmin olun.");

        }else if ( reyting < 1 && reyting > 10) {
            System.out.println("Reytinq 1 ilə 10 arasında olmalıdır. Xahiş edirəm yenidən yoxlayın.");
        }
        System.out.println("Hansı janrda film izləmək istəyirisniz");
        System.out.println("1-Sci-Fi, 2-Drama, 3-Komediya, 4-Qorxu");
        int genre = sc.nextInt();
        List<String> sciFiMovies = Arrays.asList("Interstellar: IMDB 8.7", "The Matrix: IMDB 8.7", "Inception: IMDB 8.8");
        List<String> dramaMovies = Arrays.asList("The Godfather: IMDB 9.2", "Forrest Gump: IMDB 8.8", "Shawshank Redemption: IMDB 9.3");
        List<String> comdeyMovies = Arrays.asList("Step Brothers: IMDB 6.9","The Hangover: IMDB 7.7", "White Chicks: IMDB 8.7");
        List<String> hororMovies = Arrays.asList("he Exorcist IMDb: 8.1","Psycho: IMDB 8.5", "The Shining: IMDB 8.4");

        switch (genre) {
            case 1:
                System.out.println("Sci-Fi filimleri" + sciFiMovies);
                break;
            case 2:
                System.out.println("Drama filmləri: " + dramaMovies);
                break;
            case 3:
                System.out.println("Komediya filmləri: " + dramaMovies);
                break;
            case 4:
                System.out.println("Qorxu filmleri" + comdeyMovies);
            default:
                System.out.println("Belə janr mövcud deyil.");

        }
    }
}
