package sample;

public class AI {
    int xPosition;
    int yPosition;
    int[] AIChosenRandomPosition = new int[3];
    String AI ="random";

    void callAI(Controller controller) {
        int x = (int) (Math.random() * Math.random() * ((3 - 1) + 1));
        int y = (int) (Math.random() * ((3 - 1) + 1));
        controller.checkIfCellAlreadyOccupied(x, y);

        if (AI == "random")
            controller.aiMoveHandler.placeO(AIChosenRandomPosition, controller);
        else {
            controller.checkDefensiveAICondition();
            controller.aiMoveHandler.placeO(AIChosenRandomPosition, controller);
        }
    }
}
