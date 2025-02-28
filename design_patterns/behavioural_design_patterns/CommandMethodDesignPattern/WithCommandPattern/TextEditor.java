package design_patterns.behavioural_design_patterns.CommandMethodDesignPattern.WithCommandPattern;

// command interface
interface Command {
    void execute();
}

// concrete classes for commands
class BoldCommand implements Command {
    
    private TextEditor editor;

    public BoldCommand(TextEditor editor){
        this.editor = editor;
    }

    public void execute(){
        editor.boldText();
    }
}

// buttons class
class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}

public class TextEditor {
    public void boldText() {
        System.out.println("Text has been bolded");
    }

    public void italicText() {
        System.out.println("Text has been italicized");
    }

    public void underlineText() {
        System.out.println("Text has been underlined");
    }
}
