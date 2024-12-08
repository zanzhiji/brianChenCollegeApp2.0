package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CollegeApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		root.setPrefSize(1080, 800);
		root.setPadding(new Insets(10));
		TextArea ta1 = new TextArea("Placeholder");
		ta1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		TextArea ta2 = new TextArea("Placeholder");
		ta2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		TextArea ta3 = new TextArea("Placeholder");
		ta3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		Button btn1 = new Button("Manage Courses");
		Button btn2 = new Button("Manage Sections");
		Button btn3 = new Button("Manage Instructors");
		Button btn4 = new Button("Generate Schedule");
		Button btn5 = new Button("Exit");

		VBox vb1 = new VBox();
		VBox.setMargin(btn1, new Insets(15));
		VBox.setMargin(btn2, new Insets(15));
		VBox.setMargin(btn3, new Insets(15));
		VBox.setMargin(btn4, new Insets(15));
		VBox.setMargin(btn5, new Insets(15));

		vb1.setPrefSize(540,Double.MAX_VALUE);
		vb1.getChildren().addAll(btn1,btn2,btn3,btn4,btn5);
		VBox vb2 = new VBox();
		vb2.setPrefSize(540,Double.MAX_VALUE);


//		BorderPane top = new BorderPane();
//		top.setLeft(vb1);
//		vb1.getChildren().add(ta2);
//		top.setRight(vb2);
//		vb2.getChildren().add(ta3);
		BorderPane bot = new BorderPane();
		bot.setCenter(ta1);
		SplitPane sp = new SplitPane();
		sp.setPrefSize(1080, 400);
		sp.setOrientation(Orientation.HORIZONTAL);
		sp.getItems().addAll(vb1,vb2);
		
		root.setTop(sp);
		root.setBottom(bot);
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeApp.launch(args);
	}

}
