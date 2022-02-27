package sample;

public class PlayerMoveHandler {
    public void placeX(int x, int y, Controller controller) {
        controller.playerMoveHandler.playerMove(controller.currentTheme, x,y, controller);
    }

    public void playerMove(String currentTheme, int x, int y, Controller controller){
        if (currentTheme == "classic") {
            controller.button[x][y].setText("X");
            controller.playerMoveHandler.playerMoveTail(x,y, controller);
        }
        else if
            (currentTheme == "forrest"){
                controller.button[x][y].setText("\uD83C\uDF38");
                controller.playerMoveHandler.playerMoveTail(x,y, controller);

        }
        else{
            controller.button[x][y].setStyle("-fx-opacity: 1.0;-fx-background-color: black;");
            controller.button[x][y].setText("P");
            controller.playerMoveHandler.playerMoveTail(x,y, controller);
        }
    }

    public void playerMoveTail(int x, int y, Controller controller){
        System.out.println("Draw X on cell " + x + y);
        controller.button[x][y].setMouseTransparent(true);
        controller.gameLogic.prepareNextMove(x, y, controller);
    }
}
