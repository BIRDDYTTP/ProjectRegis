import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private ArrayList<Subject> subjects;
    private ObservableList<Subject> subjectsObservableList;
    private ArrayList<Subject> yearOneSubject ;
    private ArrayList<Subject> yearTwoSubject ;
    private ArrayList<Subject> yearThreeSubject ;
    private ArrayList<Subject> yearFourSubject ;

    @FXML Button register;
    @FXML Button y1;
    @FXML Button y2;
    @FXML Button y3;
    @FXML Button y4;
    @FXML Button save;
    @FXML ListView<Subject> subject;
    @FXML Label selectingSubject;
    @FXML TextArea subjectDetail;

    public Controller(){
        subjects = FileJsonReader.getInstance().readJsonToSubject("subject.json");
        subjectsObservableList = FXCollections.observableArrayList();
        yearOneSubject = new ArrayList<>();
        yearTwoSubject = new ArrayList<>();
        yearThreeSubject = new ArrayList<>();
        yearFourSubject = new ArrayList<>();
        addSubjectToArrays();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void addSubjectToArrays(){
        for (Subject subject1 : subjects) {
            if (subject1.getSubject().equals("CalculusI") || subject1.getSubject().equals("Introduction to computer science")
                    || subject1.getSubject().equals("Digital computer logic") || subject1.getSubject().equals("Knowledge of the land")
                    || subject1.getSubject().equals("Fundamentals of Computing") || subject1.getSubject().equals("Thai Language for Communication")
                    || subject1.getSubject().equals("Fundamentals programming concept") || subject1.getSubject().equals("CalculusII")
                    || subject1.getSubject().equals("Computer programming")){
                yearOneSubject.add(subject1);
            }
            else if (subject1.getSubject().equals("Basic linear algebra") || subject1.getSubject().equals("Software construction")
                    || subject1.getSubject().equals("Data structures") || subject1.getSubject().equals("Principles of statistics")
                    || subject1.getSubject().equals("Fundamentals of database systems") || subject1.getSubject().equals("Algorithm Design and Analysis")
                    || subject1.getSubject().equals("Assembly language and computer architecture")){
                yearTwoSubject.add(subject1);
            }
            else if (subject1.getSubject().equals("System analysis and design") || subject1.getSubject().equals("Operating systems")
                    || subject1.getSubject().equals("Intellectual property for software and digital contents") || subject1.getSubject().equals("Seminar")
                    || subject1.getSubject().equals("Information system security") || subject1.getSubject().equals("Formal language and automata theory")
                    || subject1.getSubject().equals("Compiler techniques") || subject1.getSubject().equals("Cooperative education preparation")){
                yearThreeSubject.add(subject1);
            }
            else if (subject1.getSubject().equals("Cooperative education") || subject1.getSubject().equals("Computer science project")){
                yearFourSubject.add(subject1);
            }

        }

    }
    @FXML public void handleClickOnRegisterButton (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pagetwo.fxml"));
        Stage stage = (Stage) register.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

    @FXML public void handleClickOnYearOneBtn (ActionEvent event){
        subject.getItems().clear();
        subjectsObservableList.removeAll(subjectsObservableList);
        subjectsObservableList = FXCollections.observableArrayList(yearOneSubject);
        subject.getItems().addAll(subjectsObservableList);
        subject.setCellFactory(param -> new ListCell<Subject>(){
            @Override
            protected void updateItem(Subject item, boolean empty) {
                super.updateItem(item, empty);
                if(empty || item == null || item.getSubject() == null){
                    setText(null);
                }else{
                    setText(item.getSubject());
                    if(item.isPassing())
                        setStyle("-fx-background-color: green");
                }
            }
        });
        subject.refresh();


    }
    @FXML public void handleClickOnYearTwoBtn (ActionEvent event){
        subject.getItems().clear();
        subjectsObservableList.removeAll(subjectsObservableList);
        subjectsObservableList = FXCollections.observableArrayList(yearTwoSubject);
        subject.getItems().addAll(subjectsObservableList);
        subject.setCellFactory(param -> new ListCell<Subject>(){
            @Override
            protected void updateItem(Subject item, boolean empty) {
                super.updateItem(item, empty);
                if(empty || item == null || item.getSubject() == null){
                    setText(null);
                }else{
                    setText(item.getSubject());
                    if(item.isPassing())
                        setStyle("-fx-background-color: green");
                }
            }
        });
        subject.refresh();
    }


    @FXML public void handleClickOnYearThreeBtn(ActionEvent event){
        subject.getItems().clear();
        subjectsObservableList.removeAll(subjectsObservableList);
        subjectsObservableList = FXCollections.observableArrayList(yearThreeSubject);
        subject.getItems().addAll(subjectsObservableList);
        subject.setCellFactory(param -> new ListCell<Subject>(){
            @Override
            protected void updateItem(Subject item, boolean empty) {
                super.updateItem(item, empty);
                if(empty || item == null || item.getSubject() == null){
                    setText(null);
                }else{
                    setText(item.getSubject());
                    if(item.isPassing())
                        setStyle("-fx-background-color: green");
                }
            }
        });
        subject.refresh();
    }

    @FXML public void handleClickOnYearFourBtn(ActionEvent event){
        subject.getItems().clear();
        subjectsObservableList.removeAll(subjectsObservableList);
        subjectsObservableList = FXCollections.observableArrayList(yearFourSubject);
        subject.getItems().addAll(subjectsObservableList);
        subject.setCellFactory(param -> new ListCell<Subject>(){
            @Override
            protected void updateItem(Subject item, boolean empty) {
                super.updateItem(item, empty);
                if(empty || item == null || item.getSubject() == null){
                    setText(null);
                }else{
                    setText(item.getSubject());
                    if(item.isPassing())
                        setStyle("-fx-background-color: green");
                }
            }
        });
        subject.refresh();
    }

    @FXML public void handleOnClickListview(MouseEvent event){
        Subject s = subject.getSelectionModel().getSelectedItem();
        String presub = "";
        for (String s1 : s.getPresubject()) {
            presub+=s1+"\n";
        }
        if (presub.equals("")){
            presub = "ไม่มีวิชาที่ต้องผ่านก่อนลงทะเบียน";
        }
        selectingSubject.setText(s.getSubject());
        subjectDetail.setText("รหัสวิชา : " + s.getSubID() + "\nหน่วยกิต : " + s.getCredit() +
                "\nรายละเอียดวิชา : " + s.getDescription() + "\nวิชาที่ต้องผ่านก่อน : " +presub);


    }

    @FXML public void handleClickOnSaveBtn(ActionEvent event){
            Subject s = subject.getSelectionModel().getSelectedItem();
            if (s.getPresubject().isEmpty()){
                s.setPassing(true);
                System.out.println("you pass");
            }
            else{
            int target = s.getPresubject().size();
            for (String s1 : s.getPresubject()) {
                for (Subject subject1 : subjects) {
                    if (subject1.getSubject().equals(s1)){
                        if(subject1.isPassing()){
                            target--;
                        }
                    }
                }
            }
            if (target == 0){
                s.setPassing(true);
            }
            else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setHeaderText("You can't register this subject");
                alert.showAndWait();
            }
        }
        if (s.isPassing()){
            subject.setCellFactory(param -> new ListCell<Subject>(){
                @Override
                protected void updateItem(Subject item, boolean empty) {
                    super.updateItem(item, empty);
                    if(empty || item == null || item.getSubject() == null){
                        setText(null);
                    }else{
                        setText(item.getSubject());
                        if(item.isPassing())
                            setStyle("-fx-background-color: green");
                    }
                }
            });
        }
    }

    public ListView<Subject> getSubject() {
        return subject;
    }

    public void setSubject(ListView<Subject> subject) {
        this.subject = subject;
    }


}
