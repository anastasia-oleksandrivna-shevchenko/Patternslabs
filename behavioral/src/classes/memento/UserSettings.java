package classes.memento;

public class UserSettings {
    private String theme;
    private String language;

    public void setSettings(String theme, String language) {
        this.theme = theme;
        this.language = language;
        System.out.println("Setting theme " + theme + " and language " + language);
    }
    public SettingMemento save(){
        return new SettingMemento(theme, language);
    }
    public void load(SettingMemento memento){
        theme = memento.getTheme();
        language = memento.getLanguage();
        System.out.println("Previous version of settings loaded");
    }
}
