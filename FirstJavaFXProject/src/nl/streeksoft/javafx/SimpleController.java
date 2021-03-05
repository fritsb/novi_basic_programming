package nl.streeksoft.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SimpleController {

    @FXML
    public Label helloLabel;
    @FXML
    public Button helloButton;


    public void sayHelloWorld(ActionEvent actionEvent) {
        Student student1 = new Student("Piet","Bietjes",3);
        helloLabel.setText("Hello " + student1.getFirstName() + " " + student1.getLastName());
    }
}
