package sample;

import javafx.scene.control.Button;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButtonFunctionDefinitionTest {

    Button[][] button = new Button[3][3];
    Button button1;
    @Test
    void makeMove() {
    }

    @Test
    void initializeButton() {
        ButtonFunctionDefinition buttonFunctionDefinition = new ButtonFunctionDefinition();

        assertEquals(1,1);
    }

    @Test
    void disableTileButtons() {
    }

    @Test
    void enableTileButtons() {
    }

    @Test
    void resetButtonText() {
    }

    @Test
    void resetButtonColor() {
    }
}