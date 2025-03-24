package classes.memento;

public class SettingMemento {
    private String theme;
    private String language;

    public  SettingMemento(String theme, String language) {
        this.theme = theme;
        this.language = language;
    }

    public String getTheme() {
        return theme;
    }
    public String getLanguage() {
        return language;
    }
}
