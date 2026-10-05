package MementoDesignPattern;

public class Memento {
    final private String text;
    public Memento(String text){
        this.text=text;
    }

    public String getText(){
        return text;
    }
}
