package app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.CourseContainer;
import model.DataCenter;

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

		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setPadding(new Insets(10));
		gp.setPrefSize(600, 400);
		gp.setVgap(10);
		gp.setHgap(10);


		Button btn1 = new Button("Generate Course");
		Button btn2 = new Button("Remove Course");
		Button btn3 = new Button("Edit Course");
		Button btn4 = new Button("Display Courses");
		Button btn5 = new Button("Return");

		gp.add(btn1, 0, 0);
		gp.add(btn2, 2, 0);
		gp.add(btn3, 4, 0);
		gp.add(btn4, 1, 1);
		gp.add(btn5, 3, 1);


		return gp;
	}
}
