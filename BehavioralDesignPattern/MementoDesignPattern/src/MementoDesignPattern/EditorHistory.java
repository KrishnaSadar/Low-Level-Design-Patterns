package MementoDesignPattern;

import java.util.Stack;

public class EditorHistory {
    private Stack<Memento>undo=new Stack<>();
    public void push(Memento memento){
        undo.push(memento);
    }
    public Memento pop(){
        return undo.pop();
    }
}
