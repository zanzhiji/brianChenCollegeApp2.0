package app;

import java.io.IOException;

import com.sun.tools.javac.Main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import model.CourseContainer;
import model.DataCenter;
import model.InstructorContainer;
import model.SectionContainer;
import util.ViewHelper;

public class CollegeApp extends Application {
	private Stage stage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		
		DataCenter dc = DataCenter.getInstance();
		CourseContainer couCon = dc.getCouCon();
		SectionContainer secCon = dc.getSecCon();
		InstructorContainer inCon = dc.getInCon();
		
		stage.setTitle("College App");
		showMainView();
		showMainItems();
	}
	
	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(CollegeApp.class.getResource("/gui/main/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void showMainItems() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(CollegeApp.class.getResource("/gui/main/MainItems.fxml"));
		BorderPane mainItems = loader.load();
		mainLayout.setCenter(mainItems);		
	}
	
	public static void showInstructorScene() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(CollegeApp.class.getResource("/gui/instructor/InstructorView.fxml"));
		BorderPane instView = loader.load();
		mainLayout.setCenter(instView);
	}
	
	public static void showAddInst() {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeApp.launch(args);
	}

}
