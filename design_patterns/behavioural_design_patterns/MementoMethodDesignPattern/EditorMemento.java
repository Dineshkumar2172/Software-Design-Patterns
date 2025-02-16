package design_patterns.behavioural_design_patterns.MementoMethodDesignPattern;

// Memento Class: Stores the internal state of the text editor.
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
