package com.mexicacode.app;

import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;

public class MainWindow extends Application{

	public MainWindow() {
		
	}
	
	public void lanzar(String args[]) {
		launch(MainWindow.class,args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Parent root = FXMLLoader.load(getClass().getResource("window.fxml"));
		String strPath = Paths.get("").toAbsolutePath().toString() + "/target/classes/com/mexicacode/fxml/window.fxml";
		//System.out.println(strPath);
		Parent root = FXMLLoader.load(new URL("file:" + strPath));
		System.out.println(strPath);
		System.out.println(System.getProperty("user.dir"));
		Path path = Paths.get("");
		System.out.println(path.toAbsolutePath());
		Scene scene = new Scene(root,400,400);
		primaryStage.setTitle("Titulo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
