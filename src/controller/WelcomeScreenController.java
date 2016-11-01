package controller;

import fxapp.MainFXApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.WaterQualityReport;
import model.WaterSourceReport;

import java.io.IOException;

public class WelcomeScreenController {
    @FXML private Button loginButton, registerButton;
    private static ObservableList<WaterSourceReport> sourceReports = FXCollections.observableArrayList();
    private static ObservableList<WaterQualityReport> qualityReports = FXCollections.observableArrayList();
    private MainFXApplication mainApp = new MainFXApplication();

    @FXML
    private void initialize() {
        mainApp.setSourceReports(sourceReports);
        mainApp.setQualityReports(qualityReports);
    }

    /**
     * handles login screen button press
     * @param e button press event
     * @throws IOException unable to access initial login data (esp. while accessing user database)
     */
    @FXML
    protected void handleLoginScreenButtonAction(ActionEvent e) throws IOException {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../view/LoginScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    /**
     * opens registration screen upon button press
     * @param event select register
     */
    @FXML
    protected void launchRegisterScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("../view/RegistrationScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}