package com.metropolitan.it355.it355.dz01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    public TextField tf1;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String txt = tf1.getText();
        label.setText(isPalindrom(txt));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    
    public String isPalindrom(String string) {
    if (string.length() <= 1){
        return "jeste";
    } 
    else if (string.charAt(0) != string.charAt(string.length() - 1)){
        return "nije";
    } 
    else {
        return isPalindrom(string.substring(1, string.length() - 1));
    }
 

}
    
}
