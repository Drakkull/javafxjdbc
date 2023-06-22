package orsegups.com.br.javafxjdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Scene mainScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //If something goes wrong, restore this one down below
        //Scene scene = new Scene(fxmlLoader.load(), 400, 400);

        mainScene = new Scene(fxmlLoader.load(), 400, 400);


        stage.setTitle("Let's Begin!");
        //se der ruim, no lucar de scrollpane, bota scene de volta
        stage.setScene(mainScene);
        stage.show();
    }

    public static Scene getMainScene(){
        return mainScene;
    }

    public static void main(String[] args) {
        launch();
    }
}