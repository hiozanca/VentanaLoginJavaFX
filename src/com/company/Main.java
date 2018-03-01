package com.company;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Bienvenido");



        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("BIENVENIDO");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2,1);

        Label userName = new Label("Usuario");
        grid.add(userName, 0,1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1,1);

        Label pw = new Label("Contraseña");
        grid.add(pw,0,2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox,1,2);

        Button btn = new Button("Registrarse");
        HBox hdBtn = new HBox(10);
        hdBtn.setAlignment(Pos.BOTTOM_CENTER);
        hdBtn.getChildren().add(btn);
        grid.add(hdBtn,1,4);

        final Text actionTarget = new Text();
        grid.add(actionTarget,1,6);

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Botón presionado");
            }
        });

        primaryStage.show();
    }
}
