package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighContrastThemeTest {

    @Test
    void getCurrentTheme() {
        HighContrastTheme highContrastTheme = new HighContrastTheme();
        assertEquals("highContrast", highContrastTheme.getCurrentTheme());
    }

    @Test
    void isClassic() {
        HighContrastTheme highContrastTheme = new HighContrastTheme();
        assertEquals(false, highContrastTheme.isClassic());
    }

    @Test
    void isForrest() {
        HighContrastTheme highContrastTheme = new HighContrastTheme();
        assertEquals(false, highContrastTheme.isForrest());
    }

    @Test
    void isHighContrast() {
        HighContrastTheme highContrastTheme = new HighContrastTheme();
        assertEquals(true, highContrastTheme.isHighContrast());
    }
}