package sample;

public class GameLogic {
    boolean isGameWon = false;
    boolean isGameDrawn = false;
    int buttonFilled = 0;
    int cellOccupiedByPlayer = 1;
    int getCellOccupiedByAI = 2;
    int[][] checkIfWon = new int[3][3];

    public void prepareNextMove(int x, int y, Controller controller) {
        buttonFilled++;
        checkIfWon[x][y] = cellOccupiedByPlayer;
        System.out.println("Count: " + buttonFilled);
        controller.gameLogic.checkGameStatus(controller);
        if (!isGameWon && !isGameDrawn) {
            controller.ai.callAI(controller);
        } else controller.buttonFunctionDefinition.disableTileButtons(controller);
    }

    public void finishAImove(int x, int y, Controller controller) {
        buttonFilled++;
        checkIfWon[x][y] = getCellOccupiedByAI;
        System.out.println("Count: " + buttonFilled);
        controller.gameLogic.checkGameStatus(controller);
    }

    public void checkGameStatus(Controller controller) {
        for (int i = 0; i < 3; i++) {
            // Checking for Player Winning Horizontally.
            if (checkIfWon[i][0] == 1 && checkIfWon[i][1] == 1 &&
                    checkIfWon[i][2] == 1) {
                System.out.println("PLAYER WON with " + controller.ai.AI + " AI.");
                isGameWon = true;
                controller.playWon();
                controller.buttonFunctionDefinition.disableTileButtons(controller);
                break;
            }
            // Checking for Player Winning in Vertical.
            else if (checkIfWon[0][i] == 1 && checkIfWon[1][i] == 1 &&
                    checkIfWon[2][i] == 1) {
                System.out.println("PLAYER WON with " + controller.ai.AI + " AI.");
                isGameWon = true;
                controller.playWon();
                controller.buttonFunctionDefinition.disableTileButtons(controller);
                break;
            }
            // Checking for Player Winning Diagonally.
            else if (checkIfWon[0][0] == 1 && checkIfWon[1][1] == 1 &&
                    checkIfWon[2][2] == 1 || checkIfWon[0][2] == 1 &&
                    checkIfWon[1][1] == 1 && checkIfWon[2][0] == 1) {
                System.out.println("PLAYER WON with " + controller.ai.AI + " AI.");
                isGameWon = true;
                controller.playWon();
                controller.buttonFunctionDefinition.disableTileButtons(controller);
                break;
            }
            // Checking for AI Winning in Horizontal.
            else if (checkIfWon[i][0] == 2 && checkIfWon[i][1] == 2 &&
                    checkIfWon[i][2] == 2) {
                System.out.println(controller.ai.AI + " AI WON!");
                isGameWon = true;
                controller.playWon();
                controller.buttonFunctionDefinition.disableTileButtons(controller);
                break;
            }
            // Checking for AI Winning in Vertical.
            else if (checkIfWon[0][i] == 2 && checkIfWon[1][i] == 2 &&
                    checkIfWon[2][i] == 2) {
                System.out.println(controller.ai.AI + " AI WON!");
                isGameWon = true;
                controller.playWon();
                controller.buttonFunctionDefinition.disableTileButtons(controller);
                break;
            }
            // Diagonal Checking for AI Winning in Diagonal.
            else if (checkIfWon[0][0] == 2 && checkIfWon[1][1] == 2 &&
                    checkIfWon[2][2] == 2 || checkIfWon[0][2] == 2 &&
                    checkIfWon[1][1] == 2 && checkIfWon[2][0] == 2) {
                System.out.println(controller.ai.AI + " AI WON!");
                isGameWon = true;
                controller.playWon();
                controller.buttonFunctionDefinition.disableTileButtons(controller);
                break;
            }
            System.out.println("Won: " + isGameWon);
            if (buttonFilled == 9 && !isGameWon) {
                System.out.println("DRAW with " + controller.ai.AI + " AI.");
                isGameDrawn = true;
                controller.buttonFunctionDefinition.disableTileButtons(controller);
            }
        }

    }

    void startNewGame(Controller controller) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                checkIfWon[i][j] = 0;
            }
        }
        controller.buttonFunctionDefinition.enableTileButtons(controller);
        controller.buttonFunctionDefinition.resetButtonText(controller);
        if (controller.currentTheme == "highContrast") {
            controller.buttonFunctionDefinition.resetButtonColor(controller);
        }
        buttonFilled = 0;
        isGameWon = false;
        isGameDrawn = false;
        System.out.println("AI: " + controller.ai.AI);
    }
}
