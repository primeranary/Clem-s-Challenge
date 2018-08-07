package passionproject.model;

public class GamePlay  {
    private int score;
    private String question;
    private Account account;

    public GamePlay() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getQuestions() {
        return question;
    }

    public void setQuestions(String questions) {
        this.question = questions;
    }

    public int updateScore(){
        return 0;
    }

    public boolean isGameOver(){return false;}

    public boolean isGameTied(){return false;}

    public boolean isGameWon(){return false;}

    public Account updateAccountStats(){return null;}
}
