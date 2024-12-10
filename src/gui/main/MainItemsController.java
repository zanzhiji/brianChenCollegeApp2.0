package gui.main;

import java.io.IOException;

import app.CollegeApp;

import javafx.fxml.FXML;

public class MainItemsController {
    private CollegeApp app;

    public void setApp(CollegeApp app) {
        this.app = app;
    }

    @FXML
    private void goInstructor() throws IOException {
        CollegeApp.showInstructorScene();
    }
}