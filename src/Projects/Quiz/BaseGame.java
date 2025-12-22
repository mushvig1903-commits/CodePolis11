package Projects.Quiz;

abstract class BaseGame {
    protected Question[] questions;
    public abstract void showWelcomeMessage();//Hər oyun öz xoş gəldin mesajını özü yazsın

    public BaseGame(Question[] questions) {
        this.questions = questions;
    }
}
