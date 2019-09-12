/**********************************************
Workshop # 5 - AddressBook.java
Course: JAC444SAB - Summer
Date: Friday, June 21, 2019
**********************************************/
	
	import javafx.application.Application;
	import javafx.scene.control.ComboBox;
	import javafx.geometry.Insets;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
    	import javafx.scene.layout.GridPane;
	import javafx.stage.Stage;
	import javafx.scene.layout.ColumnConstraints;;

	
	public class AddressBook extends Application {
	  @Override 
	  public void start(Stage stage) {
		  
		//Creating a grid pane with six columns of equal width (70)  
	    GridPane pane = new GridPane();
	    pane.getColumnConstraints().add(new ColumnConstraints(70));
	    pane.getColumnConstraints().add(new ColumnConstraints(70));
	    pane.getColumnConstraints().add(new ColumnConstraints(70));
	    pane.getColumnConstraints().add(new ColumnConstraints(70));
	    pane.getColumnConstraints().add(new ColumnConstraints(70));
	    pane.getColumnConstraints().add(new ColumnConstraints(70));
	    
	    pane.setPadding(new Insets(12, 13, 14, 15));
	    pane.setHgap(6);
	    pane.setVgap(6);
	    
	    //First Name node
	    pane.add(new Label("First Name:"), 0, 0);
	    pane.add(new TextField(), 1, 0, 5, 1);

	    //Last Name node
	    pane.add(new Label("Last Name:"), 0, 1);
	    pane.add(new TextField(), 1, 1, 5, 1);
	    
	    //City node
	    pane.add(new Label("      City: "), 0, 2);
	    pane.add(new TextField(), 1, 2);
	    
	    //Combo drop down menu for provinces
	    ComboBox<String> myComboBox = new ComboBox<String>();
	    myComboBox.getItems().addAll(
	    		"AB","BC","MB","NB","NL",
	    		"NS","NT", "NU", "ON",
	    		"PE","QC","SK","YT"
	    		);
	    
	    //Province node
	    pane.add(new Label("   Province: "), 2, 2);
	    pane.add(myComboBox, 3, 2);
	    
	    //Postal Code node
	    pane.add(new Label("Postal Code:"), 4, 2);
	    pane.add(new TextField(), 5, 2);
	     
	    //Add Button
	    Button btAdd = new Button("Add");
	    pane.add(btAdd, 0, 3);
	    btAdd.setMaxWidth(Double.MAX_VALUE);
	   
	    //First Button
	    Button btFirst = new Button("First");
	    pane.add(btFirst, 1, 3);
	    btFirst.setMaxWidth(Double.MAX_VALUE); //
	    
	    //Next Button
	    Button btNext = new Button("Next");
	    pane.add(btNext, 2, 3);
	    btNext.setMaxWidth(Double.MAX_VALUE);
	    
	    //Previous Button
	    Button btPrevious = new Button("Previous");
	    pane.add(btPrevious, 3, 3);
	    btPrevious.setMaxWidth(Double.MAX_VALUE);
	    
	    //Last Button
	    Button btLast = new Button("Last");
	    pane.add(btLast, 4, 3);
	    btLast.setMaxWidth(Double.MAX_VALUE);
	    
	    //Update Button
	    Button btUpdate = new Button("Update");
	    pane.add(btUpdate, 5, 3);
	    btUpdate.setMaxWidth(Double.MAX_VALUE);
	    
	    Scene scene = new Scene(pane);
	   
	    stage.setTitle("Address Book"); // Set the stage title
	    stage.setScene(scene); // Place the scene in the stage
	    stage.show(); // Display the stage
	   
	  }
	  
	  public static void main(String[] args) {
	    launch(args);
	  }
	} 



