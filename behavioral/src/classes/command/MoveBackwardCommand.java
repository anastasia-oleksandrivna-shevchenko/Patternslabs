package classes.command;

public class MoveBackwardCommand implements Command {
    private Player player;
    public MoveBackwardCommand(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.moveBackward();
    }
    @Override
    public void undo() {
        player.moveForward();
    }

}
