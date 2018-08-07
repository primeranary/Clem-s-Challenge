package passionproject.model;

import javax.persistence.*;

@Entity
@Table
public class LevelOneFlashCardQuestions {
    @Id
    @GeneratedValue
    private Long id;
    private  String front;
    private  String back;

    public LevelOneFlashCardQuestions(){}
    public LevelOneFlashCardQuestions(String term, String definition, Long id){
        this.front = term;
        this.back = definition;
        this.id = id;
    }

    public String getFront() {
        return front;
    }

    public String getBack() {
        return back;
    }

    public Long getId(){
        return id;
    }


}
