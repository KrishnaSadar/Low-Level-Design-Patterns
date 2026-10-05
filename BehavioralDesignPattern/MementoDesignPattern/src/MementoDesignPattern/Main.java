package MementoDesignPattern;

public class Main {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();
        // Initial text
        editor.setText("Hello");
        System.out.println("Current text: " + editor.getText());
        history.push(editor.save());
        // User types something new
        editor.setText("Hello, World!");
        System.out.println("Current text: " + editor.getText());
        history.push(editor.save());
        // Another change
        editor.setText("Hello, World! Welcome to Memento Pattern.");
        System.out.println("Current text: " + editor.getText());
        // Undo the last change
        Memento previousState = history.pop();
        editor.restore(previousState);
        System.out.println("After undo, text: " + editor.getText());
        // Undo to the initial state
        previousState = history.pop();
        editor.restore(previousState);
        System.out.println("After second undo, text: " + editor.getText());
    }
}
