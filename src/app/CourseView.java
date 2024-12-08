package app;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.CourseContainer;
import model.DataCenter;
import model.Major;
import util.ViewHelper;

public class CourseView {
    private CourseContainer cc;
    private DataCenter dc;
    private Stage stage;

    public CourseView(DataCenter dc, CourseContainer cc, Stage stage) {
        this.dc = dc;
        this.cc = cc;
        this.stage = stage;
    }

    public Pane getMainView() {
        Button btn1 = new Button("Generate Course");
        btn1.setOnMouseReleased(e->{
        	Stage stg = new Stage();
        	Scene gen = new Scene(genCou());
        	stg.setScene(gen);
        	stg.show();
        });
        Button btn2 = new Button("Remove Course");
        Button btn3 = new Button("Edit Course");
        Button btn4 = new Button("Display Courses");
        Button btn5 = new Button("Return");
        btn5.setOnMouseReleased(e -> stage.close());

        return ViewHelper.createGridPane(btn1, btn2, btn3, btn4, btn5);
    }
    
    public Pane genCou() {
    	VBox vb = new VBox();
    	vb.setPadding(new Insets(20));
    	vb.setSpacing(10);
    	
    	HBox title = new HBox();
    	Label couTitle = new Label("Enter the course title: ");
    	TextField titleField = new TextField();
    	title.getChildren().addAll(couTitle,titleField);
    	
    	HBox desc = new HBox();
    	Label couDesc = new Label("Enter the description: ");
    	TextField descField = new TextField();
    	desc.getChildren().addAll(couDesc,descField);
    	
    	HBox cred = new HBox();
    	Label couCred = new Label("Enter course credits: ");
    	TextField credField = new TextField();
    	cred.getChildren().addAll(couCred,credField);
    	
    	HBox maj = new HBox();
    	Label couMaj = new Label("Select major: ");
    	ComboBox<Major> majBox = new ComboBox<Major>();
    	majBox.getItems().addAll(Major.values());
    	maj.getChildren().addAll(couMaj, majBox);

    	HBox code = new HBox();
    	Label couCode = new Label("Enter 3 digit course code: ");
    	TextField codeField = new TextField();
    	codeField.setPromptText("Leave blank to randomly generate a code");
    	code.getChildren().addAll(couCode,codeField);
    	
    	vb.getChildren().addAll(title,desc,cred,maj,code);
    	
    	return vb;
    }
}