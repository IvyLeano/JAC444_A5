import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
import javafx.scene.shape.Rectangle;

public class CheckerBoard extends Application { 
   @Override 
   public void start(Stage stage) { 
      //Drawing a Rectangle 
	   Rectangle rectangles[][] = new Rectangle[8][8];
	   float x;
	   float y = 0.0f;
	   
	   //create rectangles and store to 2D array
	   for(int i = 0; i < 8; i++) {
		   x = 0.0f;
		   for(int j = 0; j < 8; j++) {
			   rectangles[i][j] = new Rectangle();
			   rectangles[i][j].setX(x); 
			   rectangles[i][j].setY(y); 
			   rectangles[i][j].setWidth(37.0f); 
			   rectangles[i][j].setHeight(40.0f);
			   x = x + 37.0f;	   
		   }
		   y = y + 40;
	   }		
	   
	      //Creating a Group object  
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
	         
	      //Creating a scene object 
	      Scene scene = new Scene(root, 296, 320);  
	  
	         
	      //Adding scene to the stage 
	      stage.setScene(scene); 
	  
	         
	      //Displaying the contents of the stage 
	      stage.show(); 
	      stage.setTitle("Chess Board");
	     
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
} 