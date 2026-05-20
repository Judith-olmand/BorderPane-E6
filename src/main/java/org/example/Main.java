package org.example;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        Button norte = new Button("NORTE");
        Button sur = new Button("SUR");
        Button este = new Button("ESTE");
        Button oeste = new Button("OESTE");
        Button centro = new Button("CENTRO");

        //No lo alinea por defecto
        BorderPane contenedor = new BorderPane();

        //Top ocupa toda la frajna superior
        contenedor.setTop(norte);
        //Bottom ocupa toda la franja inferior
        contenedor.setBottom(sur);
        //Right ocupa la columna derecha
        contenedor.setRight(este);
        //Left ocupa la columna izquierda
        contenedor.setLeft(oeste);
        //Center ocupa el centro
        contenedor.setCenter(centro);

        //Permite colocar cada nodo en su región, CENTER en el centro
        BorderPane.setAlignment(norte, Pos.CENTER);
        BorderPane.setAlignment(sur, Pos.CENTER);
        BorderPane.setAlignment(este, Pos.CENTER);
        BorderPane.setAlignment(oeste, Pos.CENTER);
        BorderPane.setAlignment(centro, Pos.CENTER);

        //Añade un margen, Insets al exterior alrededor de su zona
        BorderPane.setMargin(norte, new Insets(50));
        BorderPane.setMargin(sur, new Insets(50));
        BorderPane.setMargin(este, new Insets(50));
        BorderPane.setMargin(oeste, new Insets(50));
        BorderPane.setMargin(centro, new Insets(50));

        Scene scene = new Scene(contenedor, 500, 450);
        primaryStage.setTitle("Botones colocado, Ejercicio 6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
