package gui.main;

import javafx.fxml.FXML;

import java.io.IOException;

import app.CollegeApp;

public class MainViewController {
	private CollegeApp app;
	
	public void setApp(CollegeApp app) {
		this.app = app;
	}
	
	@FXML
	private void goHome() throws IOException {
		CollegeApp.showMainItems();
	}
}
