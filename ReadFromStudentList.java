import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class ReadFromStudentList extends Application {

 //declaring arraylist
	static ArrayList<String> studentList = new ArrayList<String>();

	@Override
	public void start(Stage primaryStage) throws Exception {

//creating listview object
		ListView<String> newList = new ListView<String>();
//creating observable list
    	ObservableList<String> item = FXCollections.observableArrayList(studentList);

    	newList.setItems(item);
    	newList.setPrefWidth(400);
    	newList.setPrefHeight(400);
    	newList.setOrientation(Orientation.VERTICAL);

 //creating stackpane
        StackPane pane = new StackPane();

        pane.getChildren().add(newList);
        primaryStage.setTitle("StudentList.txt");
        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.show();

	}

//method to read from the file
	private static void readStudentList(){
		BufferedReader bR = null;
		try {
			bR = new BufferedReader(new FileReader("c:\\temp\\studentList.txt"));

		} catch (FileNotFoundException e) {
			System.out.println("The File Does Not Exist!");
			System.exit(1);
		}
		try {
			while (bR.ready()) {
	            studentList.add((Student.getInfo(bR)).toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			bR.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//main method
	 public static void main(String[] args) {
		  readStudentList();
		  launch(args);
	  }

}
