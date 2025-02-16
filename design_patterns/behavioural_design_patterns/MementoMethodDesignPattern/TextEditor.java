package design_patterns.behavioural_design_patterns.MementoMethodDesignPattern;

/* A text editor where the user can undo chanegs, such as text addition or formatting. The editor stores snapshot of its state
(text content) after each change, enabling the user to revert to previous states. */

public class TextEditor {
    
    private String content;

    public void write(String text) {
        this.content = text;
    }

    // Save the current state of editor
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    // Restore (Memento -> Update the state of current content)
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
}
