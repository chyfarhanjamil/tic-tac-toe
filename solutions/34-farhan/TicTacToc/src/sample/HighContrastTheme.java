package sample;

public class HighContrastTheme {
    String currentTheme;
    boolean isClassicTheme = false;
    boolean isForrestTheme = false;
    boolean isHighContrastTheme = true;
    HighContrastTheme(){
        currentTheme="highContrast";
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
