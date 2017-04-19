package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AppScreenController extends Application implements Initializable{
	@FXML Image doorButton;
	
	public static Stage primaryStage;
	public static BorderPane mainLayout;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void btnDoorClickedNotify() {
		System.out.println("Door!");
	}


	public void showAppScreen() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/Screen/AppScreen.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	



	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
//		this.primaryStage.setTitle("AppScreen");
		showAppScreen();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
