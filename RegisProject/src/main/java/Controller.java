import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.IOException;
import java.util.ArrayList;
public class Controller {

    public void initialize(){
//        ArrayList<Subject> subjects = new ArrayList<>();
        
    }
    @FXML Button register;
    @FXML Button y1;
    @FXML Button y2;
    @FXML Button y3;
    @FXML Button y4;
    @FXML ListView<Subject> subject;
    @FXML Label selectingSubject, subjectDetail;

    @FXML public void handleClickOnRegisterButton (ActionEvent event) throws IOException {
        System.out.println("clickOnregister");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pagetwo.fxml"));
        Stage stage = (Stage) register.getScene().getWindow();
        Scene scene = new Scene((Parent) loader.load());
        stage.setScene(scene);
    }

    @FXML public void handleClickOnYearOneBtn (ActionEvent event){
        
    }

    public ListView<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ListView<Subject> subject) {
        this.subject = subject;
    }
}
