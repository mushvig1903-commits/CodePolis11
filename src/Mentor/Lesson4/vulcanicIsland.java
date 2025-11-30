package Mentor.Lesson4;

import java.util.Scanner;

public class vulcanicIsland {
    public static void main(String[] args) {
        System.out.println("\uD83C\uDF0B “Vulkanik Adadan Qaçış” oyununa xoş gəlmisiniz!\n" +
                "\n" +
                "Bir gün gözlərinizi açırsınız... ətraf tamamilə yad bir adadır.\n" +
                "Ayaqlarınızın altında torpaq titrəyir, havada kükürd qoxusu dolaşır.\n" +
                "Uzaqdan gələn gurultu isə sizə bir şeyi xəbər verir:\n" +
                "Adanın mərkəzindəki vulkan tezliklə püskürəcək! \uD83D\uDCA5\n" +
                "\n" +
                "Sizin məqsədiniz:\n" +
                "- 4 təhlükəli zonanı keçmək\n" +
                "- Enerjinizi qorumaq ⚡\n" +
                "- Bal toplamaq ⭐\n" +
                "- Və ən sonda adanın şimalında gözləyən helikopterə çatmaq \uD83D\uDE81\n" +
                "\n" +
                "Əgər bacarsanız, sağ qalacaqsınız.\n" +
                "Əks halda... \uD83C\uDF0B\uD83D\uDC80");
        Scanner sc = new Scanner(System.in);
        System.out.println("🌋 Zona 1 – Coğrafiya Kanyonu Önünüzdə dərin bir kanyon var. Körpünü keçmək üçün bu sualı düzgün cavablamalısınız!");
        System.out.println("Sual: Dünyanın ən hündür zirvəsi olan Comolunqma zirvəsinin hündürlüyü neçə metrdir?: \u26F0\uFE0F");
        int score = 100;

        int question1 = sc.nextInt();
        if (question1 == 8848) {
            score+=10;
            System.out.println("✅Təbriklər Zona 2-yə keçid edə bilərsiz: \uD83D\uDEAA " + score + " ⚡ enerjiniz var");
        }else {
            score-=20;
            System.out.println("❌ Yanlış cavab! Enerjiniz azaldı. " + score + " ⚡ enerjiniz oldu");
        }
        System.out.println(" ⛏️ Zona 2 – Mağaraya girdiniz hər yer qaranlıqdı 5 addımla mağaradan çıxa bilərsiz: \uD83D\uDD73\uFE0F⛰\uFE0F\n");
        System.out.println("⛏️ Addım 1: Mağaraya girdiniz. Qarşınızda böyük bir daş var.");
        System.out.println("Onun üstündən keçmək üçün '1' yazın, əks halda '0' yazın: ");

        int choice = sc.nextInt();
        if (choice == 1) {
            score+=10;
            System.out.println("✅ Daşı aşdınız! Balınız artdı. " + score + " ⚡ enerjiniz oldu");
        }else {
            score-=10;
            System.out.println("❌ Daşa ilişdiniz! Enerjiniz azaldı. " + score + " ⚡ enerjiniz qaldı");
        }
        System.out.println("Yol daralır \uD83C\uDF04 əyilərək keçmək üçün '1' yazın, əks halda '0' yazın: ");
        int choice2 = sc.nextInt();
        if (choice2 == 1) {
            score+=10;
            System.out.println("✅Əyilərək keçdiniz təbriklər " + score + " ⚡ enerjiniz oldu");
        }else  {
            score-=15;
            System.out.println("Sıxışıb qaldınız! Enerjiniz azaldı. " + score + " ⚡ enerjiniz qaldı");
        }
        System.out.println("Birdən ayağının altında gizli bir çuxur \uD83D\uDD73\uFE0F açılır.");
        System.out.println("Çuxurun \uD83D\uDD73\uFE0F üzərindən tullanmaq üçün 1 yaz, dayanmaq üçün 0 yaz.");
        int choice3 = sc.nextInt();
        if (choice3 == 1) {
            score+=10;
            System.out.println("✅ Çuxuru \uD83D\uDD73\uFE0F aşdınız! " + score + " ⚡ enerjiniz oldu");
        }else  {
            score-=15;
            System.out.println("❌ Çuxura \uD83D\uDD73\uFE0F düşdünüz, enerjiniz azaldı! " + score + " ⚡ enerjiniz qaldı");
        }
        System.out.println("Birdən başının üstündən böyük bir yarasa \uD83E\uDD87 sürüsü uçmağa başlayır.");
        System.out.println("Yarasalardan qaçmaq üçün 1 yaz, dayanıb gözləmək üçün 0 yaz.");
        int choice4 = sc.nextInt();
        if (choice4 == 1) {
            score+=10;
            System.out.println("✅ Yarasalardan \uD83E\uDD87 xilas oldunuz! " + score + " ⚡ enerjiniz qaldı");
        }else   {
            score-=20;
            System.out.println("❌ Yarasalar sizi yaraladı, enerjiniz azaldı! " + score + " ⚡ enerjiniz qaldı");
        }
        System.out.println("\uD83C\uDFD4\uFE0F Mağardan çıxmaq üçün kəndirlə dırmanmaq lazımdır. Dırmanmaq üçün 1 yaz, dayanıb gözləmək üçün 0 yaz.");
        int choice5 = sc.nextInt();
        if (choice5 == 1) {
            score+=10;
            System.out.println("✅ Mağaradan çıxdınız! " + score + " ⚡ enerjiniz qaldı");
        }else  {
            score-=20;
            System.out.println("❌ Gücünüz tükəndi, mağarada ilişib qaldınız! "  + score + " ⚡ enerjiniz qaldı");
        }
        if (score == 0) {
            System.out.println("Enerji sıfıra düşdü mağarada gücsüz qaldınız və oyun bitdi. ");
        }
        System.out.println("\uD83C\uDF09 Zona 3 – Qırıq Körpü Məntiqi");
        System.out.println("Mağaradan çıxdın və qarşısında qırılmış bir körpü görünür.");
        System.out.println("Körpü iki yerə ayrılıb: 'L' sol yol və 'R' sağ yol. ");
        System.out.println("Yalnız bir yol təhlükəsizdir, digəri isə uçuruma aparır.");
        char brigde = sc.next().charAt(0);
        if (brigde == 'L') {
            score+=10;
            System.out.println("Doğru yolu seçdin. Hər zaman doğru yolda addımla " + score + " ⚡ enerjiniz oldu.");
        }else   {
            score-=score;
            System.out.println("Körpüdən aşağı yuvarlandınız. xalınız bitdi " + score + " ⚡ enerjiniz.");
            return;
        }
        int choice6;

        do {
            System.out.println("🔥 Qarşınızda 3 qapı var. Hansını seçirsiniz? (1, 2, 3)");
            choice6 = sc.nextInt();

            switch (choice6) {
                case 1:
                    score -= 20;
                    System.out.println("❌ Bu qapı lavaya aparır, enerjiniz azaldı! " + score + " ⚡");
                    break;
                case 2:
                    score += 20;
                    System.out.println("✅ Təbriklər! 🎉✨🥳🎆🎇 🚁 Helikopter meydançasına çıxdınız, xilas oldunuz! " + score + " ⚡ Xalla oyunun qalibi oldunuz.");
                    // burada doğru qapı seçildiyi üçün dövr bitəcək
                    break;
                case 3:
                    score -= 50;
                    System.out.println("❌ Bu qapı sizi yan yollara aparır, vaxt itirdiniz! " + score + " ⚡ Enerjiniz azaldı " );
                    break;
                default:
                    System.out.println("🤔 Yanlış giriş! 📢 Zəhmət olmasa yalnız 1, 2 və ya 3 yazın.");
            }

        } while (choice6 != 2 && score > 0);








    }
}
