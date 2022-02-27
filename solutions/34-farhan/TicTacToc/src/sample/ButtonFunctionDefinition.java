package sample;

import javafx.scene.control.Button;

public class ButtonFunctionDefinition {
    public void makeMove(int x, int y, Controller controller) {
        controller.buttonFunctionDefinition.initializeButton(controller);
        controller.playerMoveHandler.placeX(x, y, controller);
    }

    public void initializeButton(Controller controller) {
        controller.button[0][0] = controller.button1;
        controller.button[0][1] = controller.button2;
        controller.button[0][2] = controller.button3;
        controller.button[1][0] = controller.button4;
        controller.button[1][1] = controller.button5;
        controller.button[1][2] = controller.button6;
        controller.button[2][0] = controller.button7;
        controller.button[2][1] = controller.button8;
        controller.button[2][2] = controller.button9;
    }

    void disableTileButtons(Controller controller) {
        for (Button[] buttons : controller.button) {
            for (Button val : buttons) {
                val.setMouseTransparent(true);
            }
        }
    }

    public void enableTileButtons(Controller controller) {
        for (Button[] buttons : controller.button) {
            for (Button val : buttons) {
                val.setMouseTransparent(false);
            }
        }
    }

    void resetButtonText(Controller controller) {
        for (Button[] buttons : controller.button) {
            for (Button val : buttons) {
                val.setText("");
            }
        }
    }

    void resetButtonColor(Controller controller) {
        for (Button[] buttons : controller.button) {
            for (Button val : buttons) {
                val.setStyle("-fx-opacity: 1.0;-fx-background-color: darkgray;");
            }
        }
    }
}
