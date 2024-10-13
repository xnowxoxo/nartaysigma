package Assignment3.Memento;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private StringBuilder text;
    private List<TextMemento> mementos;

    public TextEditor() {
        text = new StringBuilder();
        mementos = new ArrayList<>();
    }

    public void addText(String newText) {
        text.append(newText);
    }

    public void showText() {
        System.out.println("Current Text: " + text.toString());
    }

    public TextMemento save() {
        TextMemento memento = new TextMemento(text.toString());
        mementos.add(memento);
        return memento;
    }

    public void restore(TextMemento memento) {
        text = new StringBuilder(memento.getText());
    }
}
