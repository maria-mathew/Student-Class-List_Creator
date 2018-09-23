import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class StudentListEditor extends Application{

//labels
	Label heading = new Label("STUDENT LIST FOR FAST EDITOR");
	Label studentId = new Label("Student ID: ");
	Label firstName = new Label("First Name: ");
	Label lastName = new Label("Last Name: ");
	Label course = new Label("Course: ");
	Label campus = new Label("Campus");
	Label gpa = new Label("GPA: ");
	Label notify = new Label();
	Label rightHeading = new Label("GPA Calculator");
	Label subject1 = new Label("Subject 1");
	Label subject2 = new Label("Subject 2");
	Label subject3 = new Label("Subject 3");
	Label subject4 = new Label("Subject 4");
	Label subject5 = new Label("Subject 5");
	Label subject6 = new Label("Subject 6");
	Label A = new Label("90 - 100");
	Label B = new Label("85 - 89");
	Label C = new Label("80 - 84");
	Label D = new Label("75 -79");
	Label E = new Label("70 - 74");
	Label F = new Label("65 - 69");
	Label G = new Label("60 - 64");
	Label H = new Label("55 - 59");
	Label I = new Label("50 - 54");
	Label J = new Label("0 - 49");
	Label a = new Label("4");
	Label b = new Label("3.8");
	Label c = new Label("3.6");
	Label d = new Label("3.3");
	Label e = new Label("3.0");
	Label f = new Label("2.5");
	Label g = new Label("2.0");
	Label h = new Label("1.5");
	Label i = new Label("1.0");
	Label j = new Label("0");
	Label grades = new Label("Grades");
	Label gradeCredit = new Label ("Credits");
	Label points = new Label("Points");
	Label pointss = new Label("Points");
	Label GPA = new Label ("GPA: ");
	Label notifyRight = new Label ();
	Label result = new Label();



//Text fields
	TextField tfStudentId = new TextField();
	TextField tffirstName = new TextField();
	TextField tflastName = new TextField();
	TextField tfGpa = new TextField();


//Radio Button
	RadioButton male = new RadioButton("Male");
	RadioButton female = new RadioButton("Female");

//Check Boxes
	CheckBox davis = new CheckBox("Davis");
	CheckBox trafalger = new CheckBox("Trafalger");
	CheckBox hazelMcCallion = new CheckBox("Hazel McCallion");

//Button
	Button btn = new Button("Submit");
	Button clear = new Button("Clear");
	Button calculate = new Button("Calculate");
	Button clearCalculator = new Button ("Clear");

//combo box
	final ComboBox courses = new ComboBox();
	final ComboBox sub1Grade = new ComboBox();
	final ComboBox sub2Grade = new ComboBox();
	final ComboBox sub3Grade = new ComboBox();
	final ComboBox sub4Grade = new ComboBox();
	final ComboBox sub5Grade = new ComboBox();
	final ComboBox sub6Grade = new ComboBox();

	final ComboBox sub1Credits = new ComboBox();
	final ComboBox sub2Credits = new ComboBox();
	final ComboBox sub3Credits = new ComboBox();
	final ComboBox sub4Credits = new ComboBox();
	final ComboBox sub5Credits = new ComboBox();
	final ComboBox sub6Credits = new ComboBox();


	@Override
	public void start(Stage primaryStage) throws Exception {

//setting combo boxes
		//courses
	      courses.getItems().addAll(
	          "Software Engineering",
	          "Computer Programmer",
	          "Network Engineering",
	          "System Analyst"
	    		  );
	      courses.setPromptText("Select a course");

	      //sub1Grade
	      sub1Grade.getItems().addAll(
	          "4",
	          "3.8",
	          "3.6",
	          "3.3",
	          "3.0",
	          "2.5",
	          "2.0",
	          "1.5",
	          "1.0",
	          "0"
	    		  );
	      sub1Grade.setPromptText("---");

	      //sub2Grade
	      sub2Grade.getItems().addAll(
	    		  "4",
		          "3.8",
		          "3.6",
		          "3.3",
		          "3.0",
		          "2.5",
		          "2.0",
		          "1.5",
		          "1.0",
		          "0"

	    		  );
	      sub2Grade.setDisable(true);
	      sub2Grade.setPromptText("---");

	      	//sub3Grade
		      sub3Grade.getItems().addAll(
		    		  "4",
			          "3.8",
			          "3.6",
			          "3.3",
			          "3.0",
			          "2.5",
			          "2.0",
			          "1.5",
			          "1.0",
			          "0"

			    		  );
		      sub3Grade.setDisable(true);
		      sub3Grade.setPromptText("---");

		      //sub4Grade
			      sub4Grade.getItems().addAll(
			    		  "4",
				          "3.8",
				          "3.6",
				          "3.3",
				          "3.0",
				          "2.5",
				          "2.0",
				          "1.5",
				          "1.0",
				          "0"

				    		  );
			      sub4Grade.setDisable(true);
			      sub4Grade.setPromptText("---");

			      //sub5Grade
				      sub5Grade.getItems().addAll(
				    		  "4",
					          "3.8",
					          "3.6",
					          "3.3",
					          "3.0",
					          "2.5",
					          "2.0",
					          "1.5",
					          "1.0",
					          "0"

					    		  );
				      sub5Grade.setDisable(true);
				      sub5Grade.setPromptText("---");

				      //sub6Grade
					      sub6Grade.getItems().addAll(
					    		  "4",
						          "3.8",
						          "3.6",
						          "3.3",
						          "3.0",
						          "2.5",
						          "2.0",
						          "1.5",
						          "1.0",
						          "0"

						    		  );
					      sub6Grade.setDisable(true);
					      sub6Grade.setPromptText("---");

					      //sub1Credits
					      sub1Credits.getItems().addAll(
						          "6.0",
						          "4.0",
						          "3.0"

						    		  );

					      sub1Credits.setPromptText("---");
					      sub1Credits.setDisable(true);

					      //sub2Credits
					      sub2Credits.getItems().addAll(
						          "6.0",
						          "4.0",
						          "3.0"

						    		  );
					      sub2Credits.setDisable(true);
					      sub2Credits.setPromptText("---");

					      //sub3credits
					      sub3Credits.getItems().addAll(
						          "6.0",
						          "4.0",
						          "3.0"

						    		  );
					      sub3Credits.setDisable(true);
					      sub3Credits.setPromptText("---");

					      //sub4Credits
					      sub4Credits.getItems().addAll(
						          "6.0",
						          "4.0",
						          "3.0"

						    		  );
					      sub4Credits.setDisable(true);
					      sub4Credits.setPromptText("---");

					      //sub5Credits
					      sub5Credits.getItems().addAll(
						          "6.0",
						          "4.0",
						          "3.0"

						    		  );
					      sub5Credits.setDisable(true);
					      sub5Credits.setPromptText("---");

					      //sub6Credits
					      sub6Credits.getItems().addAll(
						          "6.0",
						          "4.0",
						          "3.0"

						    		  );
					      sub6Credits.setDisable(true);
					      sub6Credits.setPromptText("---");


//border pane
		BorderPane pane = new BorderPane();
		pane.setPadding(new Insets(15, 15, 15, 15));



//declaring grid panes
		GridPane leftpane = new GridPane();
		GridPane toppane = new GridPane();
		GridPane bottompane = new GridPane();
		GridPane rightpane = new GridPane();
		GridPane centerpane = new GridPane();
		GridPane bottomright = new GridPane();


//top pane
		 pane.setTop(new CustomPane(toppane));
		 toppane.setHgap(40);
		 toppane.setAlignment(Pos.CENTER);
		 toppane.add(heading,0 ,1);
		 toppane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));


//center pane
		 pane.setCenter(new CustomPane(centerpane));
		 centerpane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		 centerpane.setHgap(50);
		 centerpane.setVgap(20);
		 centerpane.setAlignment(Pos.CENTER);
		 centerpane.add(studentId , 0, 0);
		 centerpane.add(tfStudentId , 1, 0);
		 centerpane.add(firstName, 0, 1);
		 centerpane.add(tffirstName, 1, 1);
		 centerpane.add(lastName, 0, 2);
		 centerpane.add(tflastName, 1, 2);
		 centerpane.add(gpa, 0, 3);
		 centerpane.add(tfGpa, 1, 3);
		 centerpane.add(male, 0, 4);
		 centerpane.add(female, 1, 4);
		 centerpane.add(course, 0, 5);
		 centerpane.add(courses, 1, 5);
		 centerpane.add(campus, 0, 6);
		 centerpane.add(davis, 1, 6);
		 centerpane.add(trafalger, 1, 7);
		 centerpane.add(hazelMcCallion, 1, 8);
		 centerpane.add(notify, 1, 9);
		 centerpane.add(btn, 1, 10);
		 centerpane.add(clear, 1, 11);

//right pane
		 pane.setRight(new CustomPane(rightpane));
		 rightpane.setPadding(new Insets(50, 50, 50, 50));
		 rightpane.setHgap(20);
		 rightpane.setVgap(20);
		 rightpane.add(pointss, 1, 0);
		 rightpane.add(gradeCredit, 2, 0);
		 rightpane.add(subject1, 0, 1);
		 rightpane.add(sub1Grade, 1, 1);
		 rightpane.add(sub1Credits, 2, 1);
		 rightpane.add(subject2, 0, 2);
		 rightpane.add(sub2Grade, 1, 2);
		 rightpane.add(sub2Credits, 2, 2);
		 rightpane.add(subject3, 0, 3);
		 rightpane.add(sub3Grade, 1, 3);
		 rightpane.add(sub3Credits, 2, 3);
		 rightpane.add(subject4, 0, 4);
		 rightpane.add(sub4Grade, 1, 4);
		 rightpane.add(sub4Credits, 2, 4);
		 rightpane.add(subject5, 0, 5);
		 rightpane.add(sub5Grade, 1, 5);
		 rightpane.add(sub5Credits, 2, 5);
		 rightpane.add(subject6, 0, 6);
		 rightpane.add(sub6Grade, 1, 6);
		 rightpane.add(sub6Credits, 2, 6);
		 rightpane.add(calculate, 1, 7);
		 rightpane.add(clearCalculator, 2, 7);
		 rightpane.add(GPA, 1, 8);
		 rightpane.add(result, 1, 9);
		 rightpane.add(notifyRight, 2, 8);

//left pane
		 pane.setLeft(new CustomPane(leftpane));
		 leftpane.setPadding(new Insets(80,80, 80, 80));
		 leftpane.setHgap(50);
		 leftpane.setVgap(20);
		 leftpane.add(grades, 0, 0);
		 leftpane.add(points, 1, 0);
		 leftpane.add(A, 0, 1);
		 leftpane.add(B, 0, 2);
		 leftpane.add(C, 0, 3);
		 leftpane.add(D, 0, 4);
		 leftpane.add(E, 0, 5);
		 leftpane.add(F, 0, 6);
		 leftpane.add(G, 0, 7);
		 leftpane.add(H, 0, 8);
		 leftpane.add(I, 0, 9);
		 leftpane.add(J, 0, 10);
		 leftpane.add(a, 1, 1);
		 leftpane.add(b, 1, 2);
		 leftpane.add(c, 1, 3);
		 leftpane.add(d, 1, 4);
		 leftpane.add(e, 1, 5);
		 leftpane.add(f, 1, 6);
		 leftpane.add(g, 1, 7);
		 leftpane.add(h, 1, 8);
		 leftpane.add(i, 1, 9);
		 leftpane.add(j, 1, 10);




//creating scene
		Scene scene = new Scene(pane, 1090, 660);
		primaryStage.setTitle("Student List Editor");
		primaryStage.setScene(scene);
		primaryStage.show();

//event handlers
		 EventHandler<ActionEvent> subject1Grade = e -> {
			 sub1Credits.setDisable(false);
	      };
	      EventHandler<ActionEvent> subject2Grade = e -> {
				 sub2Credits.setDisable(false);
		      };
		      EventHandler<ActionEvent> subject3Grade = e -> {
					 sub3Credits.setDisable(false);
			      };
			      EventHandler<ActionEvent> subject4Grade = e -> {
						 sub4Credits.setDisable(false);
				      };
				      EventHandler<ActionEvent> subject5Grade = e -> {
							 sub5Credits.setDisable(false);
					      };
					      EventHandler<ActionEvent> subject6Grade = e -> {
								 sub6Credits.setDisable(false);
						      };
						      EventHandler<ActionEvent> subject1Credits = e -> {
									 sub2Grade.setDisable(false);
							      };

							      EventHandler<ActionEvent> subject2Credits = e -> {
							    	  sub3Grade.setDisable(false);
								      };

								      EventHandler<ActionEvent> subject3Credits = e -> {
								    	  sub4Grade.setDisable(false);
									      };

									      EventHandler<ActionEvent> subject4Credits = e -> {
									    	  sub5Grade.setDisable(false);
										      };
										      EventHandler<ActionEvent> subject5Credits = e -> {
										    	  sub6Grade.setDisable(false);
											      };
											      EventHandler<ActionEvent> actionForCampus = e -> {
											    	  if(!davis.isSelected() && !trafalger.isSelected() && !hazelMcCallion.isSelected()){
											    		  davis.setDisable(false);
											    		  trafalger.setDisable(false);
											    		  hazelMcCallion.setDisable(false);
											    	  }
											    	  if(davis.isSelected()){
											    		  trafalger.setDisable(true);
											    		  hazelMcCallion.setDisable(true);
											    	  }
											    	  if(trafalger.isSelected()){
											    		  davis.setDisable(true);
											    		  hazelMcCallion.setDisable(true);
											    	  }
											    	  if(hazelMcCallion.isSelected()){
											    		  trafalger.setDisable(true);
											    		  davis.setDisable(true);
											    	  }
												      };


//set on action for buttons/combo boxes/checkboxes
	   btn.setOnAction(e -> submit());
	   clear.setOnAction(e -> clear());
	   calculate.setOnAction(e -> calculate());
	   clearCalculator.setOnAction(e -> clearCalculator());
	   davis.setOnAction(actionForCampus);
	   trafalger.setOnAction(actionForCampus);
	   hazelMcCallion.setOnAction(actionForCampus);
	   sub1Grade.setOnAction(subject1Grade);
	   sub2Grade.setOnAction(subject2Grade);
	   sub3Grade.setOnAction(subject3Grade);
	   sub4Grade.setOnAction(subject4Grade);
	   sub5Grade.setOnAction(subject5Grade);
	   sub6Grade.setOnAction(subject6Grade);
	   sub1Credits.setOnAction(subject1Credits);
	   sub2Credits.setOnAction(subject2Credits);
	   sub3Credits.setOnAction(subject3Credits);
	   sub4Credits.setOnAction(subject4Credits);
	   sub5Credits.setOnAction(subject5Credits);



//background
		BackgroundImage paneBG= new BackgroundImage(new Image("image/123.png",700,700,false,true),
		        BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		pane.setBackground(new Background(paneBG));

//Toggle group
		 ToggleGroup gender = new ToggleGroup();
		    male.setToggleGroup(gender);
		    female.setToggleGroup(gender);

//properties


		 heading.setFont(Font.font("Goudy Stout",FontWeight.BOLD, FontPosture.ITALIC, 15));
		 heading.setStyle("-fx-underline: true");
		 heading.setAlignment(Pos.CENTER);
		 studentId.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 firstName.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 lastName.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 course.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 campus.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 gpa.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 male.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 female.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 notify.setFont(Font.font("Times New Roman",FontWeight.BOLD, 15));
		 female.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 subject1.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 subject2.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 subject3.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 subject4.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 subject5.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 subject6.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 GPA.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 rightHeading.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 grades.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 gradeCredit.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 points.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 pointss.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 result.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 grades.setStyle("-fx-underline: true");
		 points.setStyle("-fx-underline: true");
		 pointss.setStyle("-fx-underline: true");
		 gradeCredit.setStyle("-fx-underline: true");
		 A.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 B.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 C.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 D.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 E.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 F.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 G.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 H.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 I.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 J.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 a.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 b.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 c.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 d.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 e.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 f.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 g.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 h.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 i.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 j.setFont(Font.font("Times New Roman",FontWeight.BOLD, 14));
		 notifyRight.setFont(Font.font("Times New Roman",FontWeight.BOLD, 13));
		 heading.setTextFill(Color.MAROON);
		 studentId.setTextFill(Color.MIDNIGHTBLUE);
		 firstName.setTextFill(Color.MIDNIGHTBLUE);
		 lastName.setTextFill(Color.MIDNIGHTBLUE);
		 studentId.setTextFill(Color.MIDNIGHTBLUE);
		 course.setTextFill(Color.MIDNIGHTBLUE);
		 gpa.setTextFill(Color.MIDNIGHTBLUE);
		 male.setTextFill(Color.MIDNIGHTBLUE);
		 female.setTextFill(Color.MIDNIGHTBLUE);
		 campus.setTextFill(Color.MIDNIGHTBLUE);
		 notify.setTextFill(Color.DARKRED);
		 notifyRight.setTextFill(Color.DARKRED);
		 subject1.setTextFill(Color.MIDNIGHTBLUE);
		 subject2.setTextFill(Color.MIDNIGHTBLUE);
		 subject3.setTextFill(Color.MIDNIGHTBLUE);
		 subject4.setTextFill(Color.MIDNIGHTBLUE);
		 subject5.setTextFill(Color.MIDNIGHTBLUE);
		 subject6.setTextFill(Color.MIDNIGHTBLUE);
		 rightHeading.setTextFill(Color.MIDNIGHTBLUE);

//button style


		  btn.setStyle(" -fx-font-family: magneto; -fx-pref-width: 200px; -fx-font-size: 1.45em;"
		  		+ "-fx-text-fill: maroon;  -fx-background-color: #D3D3D3;");
		  clear.setStyle(" -fx-font-family: magneto; -fx-pref-width: 200px; -fx-font-size: 1.45em;"
		  		+ "-fx-text-fill: maroon;  -fx-background-color: darkgrey;");
		  calculate.setStyle(" -fx-font-family: magneto; -fx-pref-width: 80px; -fx-font-size: 1.05em;"
			  		+ "-fx-text-fill: maroon;  -fx-background-color: darkgrey;");
		  clearCalculator.setStyle(" -fx-font-family: magneto; -fx-pref-width: 80px; -fx-font-size: 1.25em;"
			  		+ "-fx-text-fill: maroon;  -fx-background-color: darkgrey;");

//text field/check boxes styles
		  tffirstName.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  tfGpa.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  tflastName.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  tfStudentId.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  courses.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  davis.setStyle("-fx-font-weight:bold");
		  trafalger.setStyle("-fx-font-weight:bold");
		  hazelMcCallion.setStyle("-fx-font-weight:bold");
		  sub1Grade.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub2Grade.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub3Grade.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub4Grade.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub5Grade.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub6Grade.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub1Credits.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub2Credits.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub3Credits.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub4Credits.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub5Credits.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");
		  sub6Credits.setStyle("-fx-background-color: none; -fx-border-color: darkgrey; -fx-font-weight: bold");

	}

//method to submit the form
	public void submit(){

//declaring variables
		String firstName;
		String lastName;
		long id;
		double gpa;
		String gender = "";
		String course;
		String campus = "";

//********************************************************************************************************

//checking if any text fields are empty
		if(tfStudentId.getText().trim().isEmpty() || tffirstName.getText().trim().isEmpty() ||
				tflastName.getText().trim().isEmpty() || tfGpa.getText().trim().isEmpty() ){
			notify.setText("Enter all the fields");
			return;
		}

//checking if a valid ID format is entered
		try{
			 id = Long.parseLong(tfStudentId.getText());
			 if(id>999999999 || id<100000000){
				 notify.setText("Enter a valid ID of 9 digits!");
				 return;
			 }
		}
			catch(Exception ex){
				notify.setText("Enter a valid ID number!");
				return;
			}

//setting values for variables firstName and lastName
	 firstName = tffirstName.getText();
	 lastName = tflastName.getText();

//checking if a valid GPA format is entered
		try{
		 gpa = Double.parseDouble(tfGpa.getText());
		 if(gpa>4 || gpa<0){notify.setText("Enter a valid GPA");
		 return;}
		 }
		catch(Exception e){
			notify.setText("Enter a double Value for GPA!");
			return;
		}

//checking if gender is specified
		if(!male.isSelected() && !female.isSelected()){
			notify.setText("Please choose the gender!");
			return;
		}

//checking if a course is chosen
		if(courses.getSelectionModel().isEmpty()){
			notify.setText("Please choose a course");
			return;
		}

//checking if a campus is chosen
		if(!davis.isSelected() && !trafalger.isSelected() && !hazelMcCallion.isSelected()){
			notify.setText("Please choose a campus");
			return;
		}

		notify.setText(" ");;
//*********************************************************************************************************

//setting value for variable gender
			if(male.isSelected()){
				gender = male.getText();
			}
			if(female.isSelected()){
				gender = female.getText();
			}

//setting value for variable course
			course = (String)courses.getValue();

//setting value for campus
			if(davis.isSelected()){
				campus = davis.getText();
			}
			if(trafalger.isSelected()){
				campus = trafalger.getText();
			}
			if(hazelMcCallion.isSelected()){
				campus = hazelMcCallion.getText();
			}

//declaring student object
			Student student1 = null;
		try{
//Initializing Student object
			 student1 = new Student(tffirstName.getText(), tflastName.getText(),
					Long.parseLong(tfStudentId.getText()), Double.parseDouble(tfGpa.getText()),
					gender,course, campus);
		} catch(NullPointerException e){
			System.out.println(e);
		} catch(NumberFormatException e){
			System.out.println(e);
		}

//writing to the file
		FileOutputStream file = null;
		PrintWriter pw = null;

		try {
			 file = new FileOutputStream("c:\\temp\\StudentList.txt", Boolean.TRUE);
			 pw = new PrintWriter(file);}
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

//creating alert box
		 Alert alert = new Alert(AlertType.INFORMATION);
		    alert.setTitle("Done!");
		    alert.setContentText("The Changes Have Been Saved!");
		    alert.showAndWait();
		    clear();

// call method from student class to save to file
			student1.saveTo(pw);
			pw.close();

	}

//clear method to clear the form
	public void clear()
		{
		tfStudentId.clear();
		tflastName.clear();
		tffirstName.clear();
		tfGpa.clear();
		male.setSelected(false);
		female.setSelected(false);
		davis.setSelected(false);
		trafalger.setSelected(false);
		hazelMcCallion.setSelected(false);
		courses.getSelectionModel().clearSelection();
		davis.setDisable(false);
		trafalger.setDisable(false);
		hazelMcCallion.setDisable(false);
		notify.setText(" ");
		}

//calculate method to calculate GPA
	public void calculate(){
		result.setText(" ");
		double totalGradePoints = 0;
		double totalCredits = 0;
		if(!sub1Grade.getSelectionModel().isEmpty()){
			if(sub1Credits.getSelectionModel().isEmpty()){
				notifyRight.setText("Enter the \ncredits for \nsubject 1");
				return;
			}
			double grade1 = Double.parseDouble((String)sub1Grade.getValue());
			double credits1 = Double.parseDouble((String)sub1Credits.getValue());
			double gradePoint1 = grade1 * credits1;
			totalGradePoints += gradePoint1;
			totalCredits += credits1;

		}
		if(!sub2Grade.getSelectionModel().isEmpty()){
			if(sub2Credits.getSelectionModel().isEmpty()){
				notifyRight.setText("Enter the \ncredits for \nsubject 2");
				return;
			}
			double grade2 = Double.parseDouble((String)sub2Grade.getValue());
			double credits2 = Double.parseDouble((String)sub2Credits.getValue());
			double gradePoint2 = grade2 * credits2;
			totalGradePoints += gradePoint2;
			totalCredits += credits2;

		}
		if(!sub3Grade.getSelectionModel().isEmpty()){
			if(sub3Credits.getSelectionModel().isEmpty()){
				notifyRight.setText("Enter the \ncredits for \nsubject 3");
				return;
			}
			double grade3 = Double.parseDouble((String)sub3Grade.getValue());
			double credits3 = Double.parseDouble((String)sub3Credits.getValue());
			double gradePoint3 = grade3 * credits3;
			totalGradePoints += gradePoint3;
			totalCredits += credits3;

		}
		if(!sub4Grade.getSelectionModel().isEmpty()){
			if(sub4Credits.getSelectionModel().isEmpty()){
				notifyRight.setText("Enter the \ncredits for \nsubject 4");
				return;
			}
			double grade4 = Double.parseDouble((String)sub4Grade.getValue());
			double credits4 = Double.parseDouble((String)sub4Credits.getValue());
			double gradePoint4 = grade4 * credits4;
			totalGradePoints += gradePoint4;
			totalCredits += credits4;

		}
		if(!sub5Grade.getSelectionModel().isEmpty()){
			if(sub5Credits.getSelectionModel().isEmpty()){
				notifyRight.setText("Enter the \ncredits for \nsubject 5");
				return;
			}
			double grade5 = Double.parseDouble((String)sub5Grade.getValue());
			double credits5 = Double.parseDouble((String)sub5Credits.getValue());
			double gradePoint5 = grade5 * credits5;
			totalGradePoints += gradePoint5;
			totalCredits += credits5;

		}
		if(!sub6Grade.getSelectionModel().isEmpty()){
			if(sub6Credits.getSelectionModel().isEmpty()){
				notifyRight.setText("Enter the \ncredits for \nsubject 6");
				return;
			}
			double grade6 = Double.parseDouble((String)sub6Grade.getValue());
			double credits6 = Double.parseDouble((String)sub6Credits.getValue());
			double gradePoint6 = grade6 * credits6;
			totalGradePoints += gradePoint6;
			totalCredits += credits6;

		}
		notifyRight.setText(" ");

		double finalGPA = totalGradePoints / totalCredits;
		if (!sub1Grade.getSelectionModel().isEmpty()){
		result.setText(String.format("%.2f", finalGPA));}
		if(sub1Grade.getSelectionModel().isEmpty()){
			notifyRight.setText("Enter the \nvalues!");
		}
	}

//clear method for calculator
	public void clearCalculator(){
		sub1Grade.getSelectionModel().clearSelection();
		sub2Grade.getSelectionModel().clearSelection();
		sub3Grade.getSelectionModel().clearSelection();
		sub4Grade.getSelectionModel().clearSelection();
		sub5Grade.getSelectionModel().clearSelection();
		sub6Grade.getSelectionModel().clearSelection();
		sub1Credits.getSelectionModel().clearSelection();
		sub2Credits.getSelectionModel().clearSelection();
		sub3Credits.getSelectionModel().clearSelection();
		sub4Credits.getSelectionModel().clearSelection();
		sub5Credits.getSelectionModel().clearSelection();
		sub6Credits.getSelectionModel().clearSelection();
		sub2Grade.setDisable(true);
		sub3Grade.setDisable(true);
		sub4Grade.setDisable(true);
		sub5Grade.setDisable(true);
		sub6Grade.setDisable(true);
		sub1Credits.setDisable(true);
		sub2Credits.setDisable(true);
		sub3Credits.setDisable(true);
		sub4Credits.setDisable(true);
		sub5Credits.setDisable(true);
		sub6Credits.setDisable(true);
		notifyRight.setText(" ");
		result.setText(" ");

	}


}
//class custom pane
	class CustomPane extends StackPane {
	  public CustomPane(GridPane pane) {
	    getChildren().add(pane);
	    pane.setStyle("-fx-border-color: #606060; -fx-border-width: 3px");


	  }
	}