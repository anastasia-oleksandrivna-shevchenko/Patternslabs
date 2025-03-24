package classes.memento;

import java.util.Stack;

public class History {
    private Stack<SettingMemento> history = new Stack<>();

    public void saveCheckpoint(SettingMemento settingMemento) {
        history.push(settingMemento);
    }
    public SettingMemento loadCheckpoint() {
        return history.isEmpty()? null: history.pop();
    }
}
