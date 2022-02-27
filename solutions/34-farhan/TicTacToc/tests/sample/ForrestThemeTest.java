package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForrestThemeTest {

    @Test
    void getCurrentTheme() {
        ForrestTheme forrestTheme = new ForrestTheme();
        assertEquals("forrest", forrestTheme.getCurrentTheme());
    }

    @Test
    void isClassic() {
        ForrestTheme forrestTheme = new ForrestTheme();
        assertEquals(false, forrestTheme.isClassic());
    }

    @Test
    void isForrest() {
        ForrestTheme forrestTheme = new ForrestTheme();
        assertEquals(true, forrestTheme.isForrest());
    }

    @Test
    void isHighContrast() {
        ForrestTheme forrestTheme = new ForrestTheme();
        assertEquals(false, forrestTheme.isHighContrast());
    }
}