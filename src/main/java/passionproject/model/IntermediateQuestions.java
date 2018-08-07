package passionproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class IntermediateQuestions {
    @Id
    @GeneratedValue
    private Long id;

    private String levelTwoQuestions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevelTwoQuestions() {
        return levelTwoQuestions;
    }

    public void setLevelTwoQuestions(String levelTwoQuestions) {
        this.levelTwoQuestions = levelTwoQuestions;
    }
}

