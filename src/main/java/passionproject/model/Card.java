package passionproject.model;

public class Card {

    private final String front;
    private final String back;

    public Card(String term, String definition){
        this.front = term;
        this.back = definition;
    }

    public String getFront() {
        return front;
    }

    public String getBack() {
        return back;
    }
}
