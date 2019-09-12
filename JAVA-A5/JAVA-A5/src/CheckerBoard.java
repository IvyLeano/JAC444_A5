/**********************************************
Workshop # 5 - CheckerBoard.java
Course: JAC444SAB - Summer
Date: Friday, June 21, 2019
**********************************************/

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.stage.Stage; 
import javafx.scene.shape.Rectangle;

public class CheckerBoard extends Application { 
   @Override 
   public void start(Stage stage) { 
      //Creating an array of rectangles: 8 by 8
	   Rectangle rectangles[][] = new Rectangle[8][8];
	   float x; //will be used to set the x-value
	   float y = 0.0f; // will be used to set the y-value
	   
	   //create rectangles and store to 2D array
	   for(int i = 0; i < 8; i++) {
		   x = 0.0f; //before starting each row, set the x value equal to 0.0f
		   for(int j = 0; j < 8; j++) {
			   rectangles[i][j] = new Rectangle(); 
			   rectangles[i][j].setX(x); 
			   rectangles[i][j].setY(y); 
			   rectangles[i][j].setWidth(37.0f); // I chose 37.0f and 40.0f since my stage is 296 by 320 and if you divide each by 8 equal rectangles 
			   rectangles[i][j].setHeight(40.0f); // you get a 37.0f by 40.0f dimension
			   x = x + 37.0f;	// if each rectangle is 37.0f wide then x will increment at 37.0f until row is complete   
		   }
		   y = y + 40.0f; // if each rectangle is 40.0f wide then x will increment at 40.0f 
	   }		
	   
	      //Creating a Group object of alternating rectangles
	       Group root = new Group(
	    		   rectangles[0][1], rectangles[0][3], rectangles[0][5], rectangles[0][7],
	    		   rectangles[1][0], rectangles[1][2], rectangles[1][4], rectangles[1][6],
	    		   rectangles[2][1], rectangles[2][3], rectangles[2][5], rectangles[2][7],
	    		   rectangles[3][0], rectangles[3][2], rectangles[3][4], rectangles[3][6],
	    		   rectangles[4][1], rectangles[4][3], rectangles[4][5], rectangles[4][7],
	    		   rectangles[5][0], rectangles[5][2], rectangles[5][4], rectangles[5][6],
	    		   rectangles[6][1], rectangles[6][3], rectangles[6][5], rectangles[6][7],
	    		   rectangles[7][0], rectangles[7][2], rectangles[7][4], rectangles[7][6]
	    		  );
	         
	      //Creates a scene based on the root, and specifying it to be 296 by 320
	      Scene scene = new Scene(root, 296, 320);  
	         
	      //Adds the scene to the stage
	      stage.setScene(scene); 
	         
	      //Displays all contents and sets the title to "Chess Board"
	      stage.show(); 
	      stage.setTitle("Chess Board");
	     
   }     
   //main 
   public static void main(String args[]){ 
      launch(args); 
   } 
} 
