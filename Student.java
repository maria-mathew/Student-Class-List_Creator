import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Student {

//Declaring variables
	String firstName;
	String lastName;
	long id;
	double gpa;
	String gender;
	String course;
	String campus;

//default constructor
	public Student(){}

//constructor with parameters
	public Student(String firstName, String lastName, long id, double gpa, String gender, String course,
			String campus){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.gpa = gpa;
		this.gender = gender;
		this.course = course;
		this.campus = campus;

	}

//getter for firstName
	public String getFirstName() {
		return firstName;
	}

//setter for firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

//getter for lastName
	public String getLastName() {
		return lastName;
	}

//setter for lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//getter for id
	public long getId() {
		return id;
	}

//setter for id
	public void setId(long id) {
		this.id = id;
	}

//getter for gpa
	public double getGpa(){
		return gpa;
	}

//setter for gpa
	public void setGpa(int gpa){
		this.gpa = gpa;
	}

//getter for gender
	public String getGender() {
		return gender;
	}

//setter for gender
	public void setGender(String gender) {
		this.gender = gender;
	}

//getter for course
	public String getCourse() {
		return course;
	}

//setter for course
	public void setCourse(String course) {
		this.course = course;
	}

//getter for campus
	public String getCampus() {
		return campus;
	}

//setter for campus
	public void setCampus(String campus) {
		this.campus = campus;
	}

//toString
	public String toString(){
		return 	"ID: "+getId()+
				"\nNAME: "+getFirstName()+" "+getLastName()+
				"\nGENDER: "+getGender()+
				"\nGPA: "+getGpa()+
				"\nCOURSE: "+getCourse()+
				"\nCAMPUS: "+ getCampus();
	}

//method to save information to the file
 public void saveTo(PrintWriter aFile) {
		 aFile.println(firstName);
		 aFile.println(lastName);
		 aFile.println(id);
		 aFile.println(gpa);
		 aFile.println(gender);
		 aFile.println(course);
		 aFile.println(campus);
		}

//method to read from the file
public static Student getInfo(BufferedReader br) throws IOException{
		 Student studentInfo = new Student();

		 studentInfo.firstName = br.readLine();
		 studentInfo.lastName = br.readLine();
		 studentInfo.id = Long.parseLong(br.readLine());
		 studentInfo.gpa = Double.parseDouble(br.readLine());
		 studentInfo.gender = br.readLine();
		 studentInfo.course = br.readLine();
		 studentInfo.campus = br.readLine();
		 return studentInfo;
		}

}
