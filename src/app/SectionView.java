package app;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.SectionContainer;
import model.DataCenter;
import util.ViewHelper;

public class SectionView {
    private SectionContainer sc;
    private DataCenter dc;
    private Stage stage;

    public SectionView(DataCenter dc, SectionContainer sc, Stage stage) {
        this.dc = dc;
        this.sc = sc;
        this.stage = stage;
    }

    public Pane getMainView() {
        Button btn1 = new Button("Generate Section");
        Button btn2 = new Button("Remove Section");
        Button btn3 = new Button("Edit Section");
        Button btn4 = new Button("Display Section");
        Button btn5 = new Button("Return");
        btn5.setOnMouseReleased(e -> stage.close());

        return ViewHelper.createGridPane(btn1, btn2, btn3, btn4, btn5);
    }
}