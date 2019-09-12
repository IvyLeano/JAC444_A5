/**********************************************
Workshop # 5 - StringCircle.java
Course: JAC444SAB - Summer
Date: Friday, June 21, 2019
**********************************************/

import javafx.application.Application;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class StringCircle extends Application {

	@Override
	public void start(Stage stage) {
		//Creates a new pane and sets the dimensions to 400 by 400
		Pane pane = new Pane();
		pane.setPrefSize(400, 400);
		
		//The string we'll be working with
		String welcome = "Welcome to Java ";
		
		//Setting the font styles
		Font font = Font.font("Times New Roman", FontWeight.BOLD, 30);
		
		//letter rotation begins at 0, or 12 O'Clock
		double rotation = 0;
		
		//finds the center of the pane
		//determines the x/y point for the center
		//for the position around the circle
		double center = pane.getPrefWidth() / 2;
		double radius = 100;
		double x = center + Math.cos(rotation) * radius;
		double y = center + Math.sin(rotation) * radius;
		
		Text text = null;

		//Here I incremented the rotation by 22.5, since there's 360 degrees in a circle
		//and there are 16 characters in the string (360 / 16 = 22.5 degree increments).
		//For each letter I also had to rotate it by 90 degrees so that they were all facing upwards.
		for (int i = 0; i < welcome.length(); i++) {
			x = center + Math.cos(Math.toRadians(rotation)) * radius;
			y = center + Math.sin(Math.toRadians(rotation)) * radius;

			text = new Text(x, y, welcome.charAt(i) + "");

			text.setFont(font);
			text.setRotate(rotation + 90);

			pane.getChildren().add(text);
			rotation += 22.5;

		}

		Scene scene = new Scene(pane);
		stage.setTitle("Welcome to Java");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
