package com.example.proyecto1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;



public class HelloApplication extends Application {

    private Button btn1, btn2, btn3;

    private VBox vBox;
    private HBox hBox;
void CreateUI() {
        btn1 = new Button("Boton 1");
        btn2 = new Button("Boton 2");
        btn3 = new Button("Boton 3");
        vBox=new VBox(btn1,btn2,btn3);
    hBox=new HBox(btn1,btn2,btn3);
    }

    public void start(Stage stage) throws IOException {
        CreateUI();
             Scene scene = new Scene(hBox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();

    }

    public static void main(String[] args) {
launch();
    }
    }