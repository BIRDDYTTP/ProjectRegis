package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    ArrayList<Subject> subjects = new ArrayList<>();
    @FXML Button register;

    @FXML public void handleClickOnRegisterButton (ActionEvent event) throws IOException {
        System.out.println("clickOnregister");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pagetwo.fxml"));
        Stage stage = (Stage) register.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

}
