package com.mexicacode.app;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainApp app = new MainApp();
		new MainWindow().lanzar(args);
		//app.init();
	}

	private void init() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getResource("window.fxml"));
	}
	
}
