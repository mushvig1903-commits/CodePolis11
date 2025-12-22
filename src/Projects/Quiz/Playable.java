package Projects.Quiz;

public interface Playable {
    void setupQuestions(); //Sualları hazırlamaq üçün.
    void start(); //Oyunu başladan əsas dövr (loop).
    boolean checkAnswer(int userAnswer, int correct); //Cavabı yoxlamaq üçün.
}
