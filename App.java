package com.mycompany.calcuperson;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class App extends Application {

    private static Scene scene;

    /**
     * Esta función lo que hace es inicializar todo el programa
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Calcu"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Esta función lo que hace es poner la escena
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Inicia todo el programa, es la función main
     */
    public static void main(String[] args) {
        launch();
    }

}