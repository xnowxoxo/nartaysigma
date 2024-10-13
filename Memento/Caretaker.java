package Assignment3.Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<TextMemento> mementoStack;

    public Caretaker() {
        mementoStack = new Stack<>();
    }

    public void save(TextEditor editor) {
        mementoStack.push(editor.save());
    }

    public void restore(TextEditor editor) {
        if (!mementoStack.isEmpty()) {
            editor.restore(mementoStack.pop());
        } else {
            System.out.println("No mementos to restore.");
        }
    }
}
