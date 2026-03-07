package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application{
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("/view/main.fxml")
		);
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
		
	}

}
