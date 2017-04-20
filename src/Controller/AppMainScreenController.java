package Controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sun.applet.Main;

public class AppMainScreenController extends Application implements Initializable{
	@FXML ImageView doorButton;
	@FXML ImageView antiThiefButton;
	@FXML ImageView packingButton;
	
	private boolean activeDoor = false;
	private boolean activeAntiThief = false;
	private boolean activePacking = false;
	
	public static Stage primaryStage;
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
	
	public void activeFingerPrint() {
		System.out.println("Active Finger Print");
		Image img;
		if(activeDoor) {
			img = new Image("file:images/icons/icon_hand-pointer-o.png");	
			activeDoor = false;
		} else {
			img = new Image("file:images/green_hand.png");
			activeDoor = true;
		}
        doorButton.setImage(img);
	}
	
	public void activeAntiThief() {
		System.out.println("Active Anti Thief");
		Image img;
		if(activeAntiThief) {
			img = new Image("file:images/icons/icon_user-times.png");	
			activeAntiThief = false;
		} else {
			img = new Image("file:images/green_anti_thief.png");
			activeAntiThief = true;
		}
        antiThiefButton.setImage(img);
	}
	
	public void activePacking() {
		System.out.println("Active Packing");
		Image img;
		if(activePacking) {
			img = new Image("file:images/icons/icon_automobile.png");	
			activePacking = false;
		} else {
			img = new Image("file:images/green_car.png");
			activePacking = true;
		}
        packingButton.setImage(img);
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
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
