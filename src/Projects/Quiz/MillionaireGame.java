package Projects.Quiz;

import java.util.Scanner;
import java.util.Random;

public class MillionaireGame extends BaseGame implements Playable{
    Scanner sc = new Scanner(System.in);
    private JokerManager jokerManager = new JokerManager();

    public MillionaireGame() {
        super(new Question[15]);//Sualları BaseGame-ə göndəririk
        setupQuestions();
    }

    private class JokerManager{
        private boolean canUse5050 = true;
        private boolean canUsePhone = true;
        private boolean canUseAudience = true;
        private Random random = new Random();

        public void use5050(Question q ){
            if (canUse5050==false){
                System.out.println("❌ Siz artıq 50/50 jokerini istifadə etmisiniz!");
                return;
            }
            System.out.println("\n[JOKER 50/50]: İki yanlış variant çıxarılır...");
            int correct = q.getCorrectAnswer();
            int count = 0;
            for (int i = 1; i <= 4; i++){
                if (i != correct && count < 2){
                    System.out.println("Variant " + i + " səhvdir.");
                    count++;
                }
            }
            this.canUse5050 = false;
        }
        public void usePhone(Question q){
            if (!canUsePhone){
                System.out.println("❌ Siz artıq Dosta Zəng jokerini istifadə etmisiniz!");
                return;
            }
            System.out.println("\n[JOKER DOSTA ZƏNG]: Dostunuz deyir ki, düzgün cavab " + q.getCorrectAnswer() + " ola bilər.");
            canUsePhone = false;
        }
        public void useAudience(Question q){
            if (!canUseAudience){
                System.out.println("❌ Siz artıq Auditoriya jokerini istifadə etmisiniz!");
                return;
            }
            System.out.println("\\n[JOKER AUDİTORİYA]: Səsvermə nəticəsi:");
            int correct = q.getCorrectAnswer();
            for (int i = 1; i <= 4; i++){
                int percent = (i == correct) ? random.nextInt(30) + 55 :  random.nextInt(15);
                System.out.println("Variant " + i + ": " + percent + "%");
            }
            canUseAudience = false;
        }
    }

    @Override
    public void setupQuestions(){
        questions[0] = new Question("Atalar sözünü tamamlayın: \"Dama-dama göl olar, axa-axa...\"", new String[]{"1) Çay olar", "2) Yol olar", "3) Sel olar", "4) Bənd olar"}, 3,100);
        questions[1] = new Question("Hansı meyvənin qurusu \"kişmiş\" adlanır?", new String[]{"1) Alma","2) Üzüm", "3) Ərik", "4) Heyva"},2, 200);
        questions[2] = new Question("Şahmat taxtasında cəmi neçə xana var?", new String[]{"1) 32", "2) 48", "3) 64","4) 81"}, 3,300);
        questions[3] = new Question("Azərbaycanın dövlət bayrağındakı yaşıl rəng nəyi təmsil edir?", new String[]{"1) Müasirlik", "2) Demokratiya", "3) İslam", "4) Azadlıq"},3,500);
        questions[4] = new Question("Hansı okean ən böyük sahəyə malikdir?", new String[]{"1) Atlantik", "2) Hind", "3) Şimal Buzlu", "4) Sakit"},4,1000);
        questions[5] = new Question("Azərbaycanın ilk paytaxtı haradır?",new String[]{"1) Bakı", "2) Şəki", "3) Gəncə", "4) Bərdə"},3,2000);
        questions[6] = new Question("Java proqramlaşdırma dilinin rəsmi loqosunda nə təsvir olunub?", new String[]{"1) Kompüter", "2) Qəhvə fincanı", "3) Pələng", "4) Yarpaq"},2,4000);
        questions[7] = new Question("Hansı planet \"Qırmızı planet\" olaraq adlandırılır?", new String[]{"1) Yupiter", "2) Saturn", "3) Mars", "4) Venera"},3,8000);
        questions[8] = new Question("\"Mona Liza\" əsərinin müəllifi kimdir?", new String[]{"1) Pikasso", "2) Leonardo da Vinçi", "3) Van Qoq", "4) Salvador Dali"},2,16000);
        questions[9] = new Question("Dünyada ən uzun çay hansıdır?", new String[]{"1) Amazon", "2) Nil", "3) Missisipi", "4) Dunay"},2,32000);
        questions[10] = new Question("Kimyəvi elementlərin dövri cədvəlini (periodik cədvəl) kim hazırlayıb?", new String[]{"1) Eynşteyn", "2) Nyuton", "3) Mendeleyev", "4) Nobel"},3 ,64000);
        questions[11] = new Question("ABŞ-ın ilk prezidenti kim olub?", new String[]{"1) Avraam Linkoln", "2) Tomas Cefferson", "3) Corc Vaşinqton", "4) Franklin Ruzvelt"},3,125000);
        questions[12] = new Question("\"Hərb və Sülh\" romanının müəllifi kimdir?", new String[]{"1) Dostoyevski", "2) Lev Tolstoy", "3) Puşkin", "4) Çexov"},2,250000);
        questions[13] = new Question("İnsan bədənində ən böyük daxili orqan hansıdır?", new String[]{"1) Ürək", "2) Ağciyər", "3) Qaraciyər", "4) Böyrək"},3,500000);
        questions[14] = new Question("İşıq sürəti saniyədə təxminən neçə kilometrdir?", new String[]{"1) 150,000 km", "2) 200,000 km", "3) 300,000 km", "4) 450,000 km"},3,1000000);

    }


    @Override
    public void showWelcomeMessage() {
        System.out.println("--- Milyonçu Oyununa Xoş Gəlmisiniz! ---");
        System.out.println("Hər suala 1-4 arası rəqəm daxil edərək cavab verin.\n");
    }
    @Override
    public void start(){
        showWelcomeMessage();
        double currentWallet = 0;
        // 1. Dövürlər (Loops): 15 sual üçün dövr
        for (int i = 0; i < questions.length; i++){
            Question current = questions[i];
            boolean nextQuestion = false;

            while (!nextQuestion){
                System.out.println("\n========================================");
                System.out.println("Sual " + (i + 1) + " | Məbləğ: " + current.getAward() + " AZN");
                System.out.println("Cari Balans: " + currentWallet + " AZN");
                System.out.println("========================================");
                System.out.println(current.getQuestionText());

                for (String opt : current.getOptions()){ System.out.println(opt);}

                System.out.println("Seçim (1-4) və ya Joker (50, DZ, AK): ");
                String input = sc.next().toUpperCase();
                switch (input) {
                    case "50": jokerManager.use5050(current); break;
                    case "DZ": jokerManager.usePhone(current); break;
                    case "AK": jokerManager.useAudience(current); break;
                    case "1": case "2": case "3": case "4":
                        int choice = Integer.parseInt(input);
                        if (checkAnswer(choice, current.getCorrectAnswer())) {
                            System.out.println("✅ Doğrudur!");
                            currentWallet = current.getAward();
                            nextQuestion = true;
                            if (i == 14) System.out.println("🏆 MÖHTƏŞƏM! ARTIQ MİLYONÇUSUNUZ!");
                        }else {
                            String correctText = current.getOptions()[current.getCorrectAnswer() - 1];
                            System.out.println("❌ Səhv! Düzgün cavab idi: " + correctText);
                            System.out.println("Oyun bitdi. Qazancınız: " + currentWallet + " AZN");
                            return;

                        }
                        break;
                    default:
                        System.out.println("⚠️ Keçərsiz giriş! Zəhmət olmasa 1-4 və ya Joker kodlarını yazın.");
                }
            }
        }

    }
    @Override
    public boolean checkAnswer(int userAnswer, int correct){
        return userAnswer == correct;
    }
}
