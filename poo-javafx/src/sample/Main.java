package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane cadastroPane = new Pane();
        Scene scn = new Scene(cadastroPane, 550, 275);

        primaryStage.setTitle("Cadastro");
        primaryStage.setScene(scn);

        Label lblId = new Label("Id");
        lblId.relocate(20, 50);
        cadastroPane.getChildren().add(lblId);

        TextField textFieldId = new TextField();
        textFieldId.setMinSize(410, 10);
        textFieldId.relocate(120, 45);
        cadastroPane.getChildren().add(textFieldId);

        Label lblNome = new Label("Nome");
        lblNome.relocate(20, 100);
        cadastroPane.getChildren().add(lblNome);

        TextField textFieldNome = new TextField();
        textFieldNome.setMinSize(410, 10);
        textFieldNome.relocate(120, 95);
        cadastroPane.getChildren().add(textFieldNome);

        Label lblTelefone = new Label("Telefone");
        lblTelefone.relocate(20, 150);
        cadastroPane.getChildren().add(lblTelefone);

        TextField textFieldTelefone = new TextField();
        textFieldTelefone.setMinSize(410, 10);
        textFieldTelefone.relocate(120, 145);
        cadastroPane.getChildren().add(textFieldTelefone);

        Button buttonSave = new Button("Salvar");
        buttonSave.relocate(20, 200);
        cadastroPane.getChildren().add(buttonSave);

        Button buttonPesquisar = new Button("Pesquisar");
        buttonPesquisar.relocate(85, 200);
        cadastroPane.getChildren().add(buttonPesquisar);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
