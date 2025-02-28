package design_patterns.behavioural_design_patterns.CommandMethodDesignPattern.WithoutCommandPattern;

class BoldButton {
    private TextEditor textEditor;

    public BoldButton(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    public void click() {
        textEditor.boldText();
    }

}

public class main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        BoldButton boldButton = new BoldButton(textEditor);
        boldButton.click();
    }
}
