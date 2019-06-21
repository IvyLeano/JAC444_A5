

	

	import javafx.application.Application;
	import javafx.geometry.HPos;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;

	public class AddressBook extends Application {
	  @Override 
	  public void start(Stage primaryStage) {
	    // Create a pane and set its properties
	    GridPane pane = new GridPane();
	    pane.setAlignment(Pos.CENTER);
	    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	    pane.setHgap(5.5);
	    pane.setVgap(5.5);
	    
	    //First Name node
	    pane.add(new Label("First Name:"), 0, 0);
	    pane.add(new TextField(), 1, 0, 5, 1);

	    //Last Name node
	    pane.add(new Label("Last Name:"), 0, 1);
	    pane.add(new TextField(), 1, 1, 5, 1);
	    
	    //City node
	    pane.add(new Label("City:"), 0, 2);
	    pane.add(new TextField(), 1, 2);
	    
	    //Province node
	    pane.add(new Label("Province:"), 2, 2);
	    pane.add(new TextField(), 3, 2);
	    
	    //Postal Code node
	    pane.add(new Label("Postal Code:"), 4, 2);
	    pane.add(new TextField(), 5, 2);
	    
	    //Add Button
	    Button btAdd = new Button("Add");
	    pane.add(btAdd, 0, 3);
	   
	    //First Button
	    Button btFirst = new Button("First");
	    pane.add(btFirst, 1, 3);
	    
	    //Next Button
	    Button btNext = new Button("Next");
	    pane.add(btNext, 2, 3);
	    
	    //Previous Button
	    Button btPrevious = new Button("Previous");
	    pane.add(btPrevious, 3, 3);
	    
	    //Last Button
	    Button btLast = new Button("Last");
	    pane.add(btLast, 4, 3);
	    
	    //Update Button
	    Button btUpdate = new Button("Update");
	    pane.add(btUpdate, 5, 3);
	    
	 
	    
	    GridPane.setHalignment(btAdd, HPos.LEFT);
	    GridPane.setHalignment(btFirst, HPos.LEFT);
	    GridPane.setHalignment(btNext, HPos.LEFT);
	    GridPane.setHalignment(btPrevious, HPos.LEFT);
	    GridPane.setHalignment(btLast, HPos.RIGHT);
	    GridPane.setHalignment(btUpdate, HPos.RIGHT);
	    
	 
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("Address Book"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	  
	  /**
	   * The main method is only needed for the IDE with limited
	   * JavaFX support. Not needed for running from the command line.
	   */
	  public static void main(String[] args) {
	    launch(args);
	  }
	} 



