package orsegups.com.br.javafxjdbc;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import orsegups.com.br.javafxjdbc.gui.util.Alerts;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
//possivelmente será excluido depois

public class HelloController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;




    @FXML
    public void onMenuItemDepartmentAction(){
        loadView("orsegups.com.br.javafxjdbc.DepartmentList");
        //System.out.println("onMenuItemDepartmentAction");
    }

    @FXML
    public void onMenuItemSellerAction(){

        System.out.println("onMenuItemSellerAction");
    }

    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("Not happy with the result!");
        //loadView("orsegups.com.br.javafxjdbc.About");
    }







    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private synchronized void loadView(String absoluteName) {
     try {


         FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
         VBox newVbox = loader.load();

         Scene mainScene = HelloApplication.getMainScene();

         VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

         Node mainMenu = mainVbox.getChildren().get(0);
         mainVbox.getChildren().clear();
         mainVbox.getChildren().add(mainMenu);
         mainVbox.getChildren().addAll(newVbox.getChildren());
     }
     catch (IOException e){
         Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);

     }
    }

    /*
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }

     */
}