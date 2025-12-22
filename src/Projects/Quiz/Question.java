package Projects.Quiz;

class Question {
   private String questionText; //Sualın öz mətnini saxlamaq üçün
   private String options[]; //Sualın 4 variantını saxlamaq üçün bir Array
   private int correctAnswer; //Düzgün cavabın nömrəsini saxlamaq üçün.
   private double award; //Hər sualın özünəməxsus uduş məbləği

    public Question(String text, String[] options, int correctAnswer, double award) {
        this.questionText = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.award = award;
    }

    public String getQuestionText() {
        return questionText;
    }
    public String[] getOptions(){
        return options;
    }
    public int getCorrectAnswer(){
        return correctAnswer;
    }
    public double getAward(){
        return award;
    }
}
