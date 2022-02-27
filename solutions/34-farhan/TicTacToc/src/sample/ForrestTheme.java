package sample;

public class ForrestTheme {
    String currentTheme;
    boolean isClassicTheme = false;
    boolean isForrestTheme = true;
    boolean isHighContrastTheme = false;
    ForrestTheme(){
        currentTheme="forrest";
    }

    public String getCurrentTheme() {
        return currentTheme;
    }

    public boolean isClassic(){
        return isClassicTheme;
    }

    public boolean isForrest(){
        return isForrestTheme;
    }

    public boolean isHighContrast(){
        return isHighContrastTheme;
    }
}
