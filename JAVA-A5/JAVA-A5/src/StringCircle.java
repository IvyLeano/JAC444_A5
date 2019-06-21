import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.shape.Circle; 


public class StringCircle extends Application { 
   @Override 
   public void start(Stage stage) { 
      //Drawing a Circle 
      Circle circle = new Circle(); 
         
      //Setting the properties of the circle 
      circle.setCenterX(148.0f); 
      circle.setCenterY(160.0f); 
      circle.setRadius(70.0f); 
      
         
      //Creating a Group object  
      Group root = new Group(circle); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 296, 320);
     
      //Setting title to the Stage 
      stage.setTitle("Welcome to Java"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}