package sample;

public class AIMoveHandler {

    public void placeO(int[] arr, Controller controller) {
        controller.ai.xPosition = arr[0];
        controller.ai.yPosition = arr[1];
        controller.aiMoveHandler.AIMove(controller.currentTheme, controller.ai.xPosition, controller.ai.yPosition, controller);
    }

    void AIMove(String currentTheme, int x, int y, Controller controller){
        if (currentTheme == "classic") {
            controller.button[x][y].setText("O");
            controller.aiMoveHandler.AIMoveTail(x,y, controller);
        }
        else if
        (currentTheme == "forrest"){
            controller.button[x][y].setText("\uD83E\uDD40");
            controller.aiMoveHandler.AIMoveTail(x,y, controller);

        }
        else{
            controller.button[x][y].setStyle("-fx-opacity: 1.0;-fx-background-color: white;");
            controller.button[x][y].setText("PC");
            controller.aiMoveHandler.AIMoveTail(x,y, controller);
        }
    }

    void AIMoveTail(int x, int y, Controller controller){
        System.out.println("Draw O on cell " + x + y);
        controller.button[x][y].setMouseTransparent(true);
        controller.gameLogic.finishAImove(x, y, controller);
    }
}
