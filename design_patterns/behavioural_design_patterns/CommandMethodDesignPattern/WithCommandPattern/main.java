package design_patterns.behavioural_design_patterns.CommandMethodDesignPattern.WithCommandPattern;

public class main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        BoldCommand boldCommand = new BoldCommand(textEditor);

        Button button = new Button();
        button.setCommand(boldCommand);
        button.click();
    }
}
