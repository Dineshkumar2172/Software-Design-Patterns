package design_patterns.behavioural_design_patterns.CommandMethodDesignPattern.WithCommandPattern;

public class main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        
        // Decoupling -> one button can do many types of actions, decoupled from the text
        Button button = new Button();
        button.setCommand(new BoldCommand(textEditor));
        button.click();
    }
}
