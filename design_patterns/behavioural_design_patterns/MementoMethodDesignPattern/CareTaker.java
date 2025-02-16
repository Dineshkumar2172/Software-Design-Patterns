package design_patterns.behavioural_design_patterns.MementoMethodDesignPattern;

import java.util.Stack;

// CareTaker Class: Manage mementos (Snapshots of the TextEditor class)
public class CareTaker {
    private final Stack<EditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor){
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.empty()) {
            history.pop();
            editor.restore(history.peek());
        }
    }
}
