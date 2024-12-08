package util;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ViewHelper {

    public static GridPane createGridPane(Button... buttons) {
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setPadding(new Insets(10));
        gp.setPrefSize(600, 400);
        gp.setVgap(10);
        gp.setHgap(10);

        int row = 0, col = 0;
        for (Button button : buttons) {
            gp.add(button, col, row);
            col++;
            if (col > 4) { // Adjust as needed for your layout
                col = 0;
                row++;
            }
        }
        return gp;
    }
}