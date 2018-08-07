package passionproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class LevelTwoMultipleChoiceAnswers {
///
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String answer;
    private boolean correct;
    private boolean selected;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="question_id")
    private LevelTwoMultiChoiceQuestions question;

    public LevelTwoMultiChoiceQuestions getQuestion() {
        return question;
    }

    public void setQuestion(LevelTwoMultiChoiceQuestions question) {
        this.question = question;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
