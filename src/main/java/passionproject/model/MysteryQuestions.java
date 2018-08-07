package passionproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MysteryQuestions {
    @Id
    @GeneratedValue
    private Long id;

    private String mysteryQuestions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMysteryQuestions() {
        return mysteryQuestions;
    }

    public void setMysteryQuestions(String easyQuestions) {
        this.mysteryQuestions = easyQuestions;
    }

}

