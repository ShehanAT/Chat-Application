package client;

import java.io.IOException;
import java.net.ConnectException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ClientApplication extends Application{
//	private ArrayList<Thread> threads;
//	public static void main(String[] args) {
//		launch();
//	}
//	
//	@Override
//	public void stop() throws Exception{
//		super.stop();
//		for(Thread thread: threads) {
//			thread.interrupt();
//		}
//	}
//	
//	@Override
//	public void start(Stage primaryStage) throws Exception{
//		threads = new ArrayList<Thread>();
//		primaryStage.setTitle("JavaFX Chat Client");
//		primaryStage.setScene(makeInitScene(primaryStage));
//		primaryStage.show();
//	}
	
//	public Scene makeInitScene(Stage primaryStage){
//		GridPane rootPane = new GridPane();
//		rootPane.setPadding(new Insets(20));
//		rootPane.setVgap(10);
//		rootPane.setHgap(10)
//		rootPane.setAlignment(Pos.CENTER);
//		
//		TextField nameField = new TextField();
//		TextField hostNameField = new TextField();
//		TextField portNumberField = new TextField();
//		
//		Label nameLabel = new Label("Name ");
//		Label hostNameLable = new Label("Host Name: ");
//		Label portNumberLabel = new Label("Port Number: ");
//		Label errorLabel = new Label();
//		
//		Button submitClientInfoButton = new Button("Done");
//		submitClientInfoButton.setOnAction(new EventHandler<ActionEvent>() {
//			
//			@Override 
//			public void handle(ActionEvent Event) {
//				Client client;
//				try {
//					client = new Client 
//				}
//			}
//		});
//	}
	

}
