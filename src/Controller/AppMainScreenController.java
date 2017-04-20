package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AppMainScreenController extends Application implements Initializable{
	@FXML ImageView doorButton;
	
	public static Stage primaryStage;
	public static Stage secondStage;
	public static BorderPane mainLayout;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void btnDoorClickedNotify() {
		System.out.println("Door!");
	}
	
	public void fingerPrintSettingAction() {
		System.out.println("Finger Print is not available right now.");
	}
	
	public void seatPositionsSettingAction() {
		System.out.println("Seat Positions is not available right now.");
	}
	
	public void voiceSettingAction() {
		System.out.println("Voice Setting is not available right now.");
	}
	
	public void cameraSettingAction() {
		System.out.println("Camera setting is not available right now.");
	}
	
	public void userSettingAction() {
		System.out.println("User setting is not available right now.");
	}


	public void showAppScreen() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/Screen/AppMainScreen.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void showSettingScreen() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/Screen/AppSettingScreen.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void showVoiceScreen() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/Screen/VoiceScreen.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
//		this.primaryStage.setTitle("AppScreen");
		showAppScreen();
		showCarScreen();
	}
	
	private void showCarScreen() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/Screen/CarScreen.fxml"));
		Scene scene = new Scene((Parent) loader.load());
		secondStage = new Stage();
		secondStage.initStyle(StageStyle.UNDECORATED);
		secondStage.setScene(scene);
		secondStage.show();
		secondStage.setX(100);
		secondStage.setY(100);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
