package com.example.proyecto1.vistas;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class calculadora extends Stage {

    private Button [] arBtns;
    private TextField txtPantalla;
    private GridPane gdpTeclado;
    private VBox vBox;

    private Scene escena;

    private void CreateUI(){
    arBtns= new Button[16];
    txtPantalla=new TextField("0");
    gdpTeclado =new GridPane();
    vBox =new VBox();
    escena =new Scene();


    }


    public calculadora(){
        this.setTitle("Calculadora");
        this.setScene();
        this.show();


    }
}
