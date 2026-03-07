package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private ImageView ImageView_BookCover;

    @FXML
    private Button Button_AddBook;

    @FXML
    private Label Label_NameBook;
    
    @FXML
    void mudarImagem() throws IOException {
    	FXMLLoader loader = new FXMLLoader(
				getClass().getResource("/view/addBook.fxml")
		);
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
    }
}