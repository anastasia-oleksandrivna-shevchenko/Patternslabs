package classes.command;

public class MoveForwardCommand implements Command {
    private Player player;
    public MoveForwardCommand(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.moveForward();
    }
    @Override
    public void undo() {
        player.moveBackward();
    }
}


