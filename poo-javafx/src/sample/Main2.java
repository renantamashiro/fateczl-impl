package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Insets insets = new Insets(10);
        BorderPane mainPane = new BorderPane();

        Pane calculatorHeader = new Pane();

        TextField calculatorDisplay = new TextField();
        calculatorDisplay.relocate(0, 10);
        calculatorDisplay.setMinSize(210, 30);
        NumberButton buttonCe = new NumberButton("CE");
        buttonCe.relocate(225, 10);
        calculatorHeader.getChildren().add(calculatorDisplay);
        calculatorHeader.getChildren().add(buttonCe);

        mainPane.setTop(calculatorHeader);
        BorderPane.setMargin(calculatorHeader, insets);

        TilePane buttons = new TilePane();
        buttons.setPrefColumns(4);
        buttons.setHgap(15);
        buttons.setVgap(15);

        NumberButton button1 = new NumberButton("1");
        NumberButton button2 = new NumberButton("2");
        NumberButton button3 = new NumberButton("3");
        NumberButton buttonPlus = new NumberButton("+");
        NumberButton button4 = new NumberButton("4");
        NumberButton button5 = new NumberButton("5");
        NumberButton button6 = new NumberButton("6");
        NumberButton buttonMinus = new NumberButton("-");
        NumberButton button7 = new NumberButton("7");
        NumberButton button8 = new NumberButton("8");
        NumberButton button9 = new NumberButton("9");
        NumberButton buttonMult = new NumberButton("*");
        NumberButton buttonComma = new NumberButton(",");
        NumberButton button0 = new NumberButton("0");
        NumberButton buttonEquals = new NumberButton("=");
        NumberButton buttonDiv = new NumberButton("/");

        buttons.getChildren().add(button1);
        buttons.getChildren().add(button2);
        buttons.getChildren().add(button3);
        buttons.getChildren().add(buttonPlus);
        buttons.getChildren().add(button4);
        buttons.getChildren().add(button5);
        buttons.getChildren().add(button6);
        buttons.getChildren().add(buttonMinus);
        buttons.getChildren().add(button7);
        buttons.getChildren().add(button8);
        buttons.getChildren().add(button9);
        buttons.getChildren().add(buttonMult);
        buttons.getChildren().add(buttonComma);
        buttons.getChildren().add(button0);
        buttons.getChildren().add(buttonEquals);
        buttons.getChildren().add(buttonDiv);

        mainPane.setCenter(buttons);
        BorderPane.setMargin(buttons, insets);

        Scene scn = new Scene(mainPane, 305, 250);
        primaryStage.setScene(scn);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

class NumberButton extends Button {
    public NumberButton(String s) {
        super(s);
        setMinSize(60, 30);
    }
}