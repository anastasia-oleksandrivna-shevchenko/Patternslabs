package classes.command;

public class MoveRightCommand implements Command {
    private Player player;
    public MoveRightCommand(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.moveRight();
    }
    @Override
    public void undo() {
        player.moveLeft();
    }
}
