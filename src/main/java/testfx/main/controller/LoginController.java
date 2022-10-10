package testfx.main.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{
	@FXML 
	TextField txtusername;
	@FXML 
	PasswordField txtpassword;
	@FXML 
	Button btnacceder;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/*
		btnacceder.setOnAction((event)->{
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
		    alert.setHeaderText(null);
		    alert.setTitle("Info");
		    alert.setContentText("Acceso concedido");
		    alert.showAndWait();
		});
		*/
	}
	@FXML 
	public void logIn(ActionEvent evt) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    alert.setHeaderText(null);
	    alert.setTitle("Info");
	    alert.setContentText("Acceso concedido");
	    alert.showAndWait();
	}
	
	
}
