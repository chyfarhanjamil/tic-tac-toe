package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;

public class Controller {


    AI ai = new AI();
    GameLogic gameLogic = new GameLogic();
    PlayerMoveHandler playerMoveHandler = new PlayerMoveHandler();
    AIMoveHandler aiMoveHandler = new AIMoveHandler();
    ButtonFunctionDefinition buttonFunctionDefinition = new ButtonFunctionDefinition();
    ClassicTheme classicTheme = new ClassicTheme();
    Button[][] button = new Button[3][3];

    String currentTheme = classicTheme.getCurrentTheme();

    @FXML
    public Button button1, button2, button3, button4,
            button5, button6, button7, button8, button9,
            startWithDefensiveAI, startWithRandomAI;

    @FXML
    private ToggleGroup radioTheme;

    @FXML
    private GridPane border;

    @FXML
    private AnchorPane anchorPane1;

    @FXML
    private RadioButton forrestRadioButton;

    @FXML
    private RadioButton highContrastRadioButton;

    @FXML
    private RadioButton classicRadioButton;

    @FXML
    void buttonPressed(ActionEvent event) {
        button1.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(0, 0, this);
        });
        button2.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(0, 1, this);
        });
        button3.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(0, 2, this);
        });
        button4.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(1, 0, this);
        });
        button5.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(1, 1, this);
        });
        button6.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(1, 2, this);
        });
        button7.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(2, 0, this);
        });
        button8.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(2, 1, this);
        });
        button9.setOnAction(e -> {
            buttonFunctionDefinition.makeMove(2, 2, this);
        });

    }

    void checkIfCellAlreadyOccupied(int x, int y) {
        if (gameLogic.checkIfWon[x][y] == 0) {
            System.out.println("Empty Cell Selected by AI.");
            ai.AIChosenRandomPosition[0] = x;
            ai.AIChosenRandomPosition[1] = y;
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (gameLogic.checkIfWon[i][j] == 0) {
                        ai.AIChosenRandomPosition[0] = i;
                        ai.AIChosenRandomPosition[1] = j;
                        break;
                    }
                }
            }
        }
    }

    void checkDefensiveAICondition() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }
    }

    @FXML
    void startWithRandomAIPressed(ActionEvent event) {
        buttonFunctionDefinition.initializeButton(this);
        ai.AI = "random";
        gameLogic.startNewGame(this);
    }

    @FXML
    void startWithDefensiveAIPressed(ActionEvent event) {
        buttonFunctionDefinition.initializeButton(this);
        ai.AI = "defensive";
        gameLogic.startNewGame(this);
    }

    //Classic theme logic
    @FXML
    void classicThemeRadio() {
        buttonFunctionDefinition.initializeButton(this);
        currentTheme = "classic";
        border.setStyle("-fx-opacity: 1.0;-fx-background-color: black;");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[i][j].setStyle("-fx-opacity: 1.0;-fx-background-color: white;");
            }
        }
        anchorPane1.setStyle("-fx-opacity: 1.0;-fx-background-color: white;");
        startWithDefensiveAI.setStyle("-fx-opacity: 1.0;-fx-background-color: #72736c;");
        startWithRandomAI.setStyle("-fx-opacity: 1.0;-fx-background-color: #72736c;");
        gameLogic.startNewGame(this);
    }

    //Forrest Theme Logic
    @FXML
    void forestThemeRadio() {

        buttonFunctionDefinition.initializeButton(this);
        currentTheme = "forrest";
        border.setStyle("-fx-opacity: 1.0;-fx-background-color: #869606;");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[i][j].setStyle("-fx-opacity: 1.0;-fx-background-color: #e6ff52;");
            }
        }
        anchorPane1.setStyle("-fx-opacity: 1.0;-fx-background-color: #869606;");
        startWithDefensiveAI.setStyle("-fx-opacity: 1.0;-fx-background-color: #e6ff52;");
        startWithRandomAI.setStyle("-fx-opacity: 1.0;-fx-background-color: #e6ff52;");
        gameLogic.startNewGame(this);

    }

    //High Contrast Theme Logic
    @FXML
    void highContrastThemeRadio() {
        buttonFunctionDefinition.initializeButton(this);
        currentTheme = "highContrast";
        border.setStyle("-fx-opacity: 1.0;-fx-background-color: lightgray;");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[i][j].setStyle("-fx-opacity: 1.0;-fx-background-color: darkgray;");
            }
        }
        anchorPane1.setStyle("-fx-opacity: 1.0;-fx-background-color: darkgray;");
        startWithDefensiveAI.setStyle("-fx-opacity: 1.0;-fx-background-color: lightgray;-fx-text-fill: black");
        startWithRandomAI.setStyle("-fx-opacity: 1.0;-fx-background-color: lightgray;-fx-text-fill: black");
        gameLogic.startNewGame(this);
    }

    public void playWon() {

    }
}


