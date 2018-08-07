package passionproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class HardQuestions {

    @Id
    @GeneratedValue
    private Long id;

    private String hardQuestions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHardQuestions() {
        return hardQuestions;
    }

    public void setHardQuestions(String easyQuestions) {
        this.hardQuestions = easyQuestions;
    }

}

