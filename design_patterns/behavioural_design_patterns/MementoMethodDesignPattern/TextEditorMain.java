package design_patterns.behavioural_design_patterns.MementoMethodDesignPattern;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker careTaker = new CareTaker(); // History / State Mgmt
        editor.write("Hello World!");
        careTaker.saveState(editor);

        editor.write("Good Morning");
        careTaker.saveState(editor);

        // Problem -> Undo the last write!
        careTaker.undo(editor);

        System.out.println(editor.getContent());
    }
}
