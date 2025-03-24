package classes.command;

import java.util.Stack;

public class GameController {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }
    public void undoCommand() {
        if(!history.isEmpty()) {
            history.pop().undo();
        }
        else{
            System.out.println("No command has been undone");
        }
    }
}
