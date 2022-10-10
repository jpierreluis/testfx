package testfx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane panel = FXMLLoader.load(getClass().getResource("/testfx/main/view/LoginView.fxml"));
		Scene scene = new Scene(panel);
		primaryStage.setTitle("Iniciando con Java FX");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
