package passionproject.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class LevelTwoMultiChoiceQuestions {

    @Id
    @GeneratedValue()
    private Long id;

    private String flashCardFront;
    private String flashCardBack;

    private boolean flashCardFlipped;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    private List<LevelTwoMultipleChoiceAnswers> answers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlashCardFront() {
        return flashCardFront;
    }

    public void setFlashCardFront(String flashCardFront) {
        this.flashCardFront = flashCardFront;
    }

    public String getFlashCardBack() {
        return flashCardBack;
    }

    public void setFlashCardBack(String flashCardBack) {
        this.flashCardBack = flashCardBack;
    }

    public boolean isFlashCardFlipped() {
        return flashCardFlipped;
    }

    public void setFlashCardFlipped(boolean flashCardFlipped) {
        this.flashCardFlipped = flashCardFlipped;
    }

    public List<LevelTwoMultipleChoiceAnswers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<LevelTwoMultipleChoiceAnswers> answers) {
        this.answers = answers;
    }


}
