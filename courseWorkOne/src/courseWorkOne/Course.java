package courseWorkOne;

import java.util.ArrayList; 

public class Course{


private int NumOfStudents;
	
private String courseName ; 
protected String courseCode;
private ArrayList<String> Student = new ArrayList<>();
int Placement2  =0  ; 






//Getters 
public String  getCourseName(){
	
	
	
	return this.courseName; 
	
}

public String  getcourseCode(){
	
	
	
	return this.courseName;
	
	
	
}


public ArrayList<String>  getListOfStudents(){
	ArrayList<String> tempList = new ArrayList<>();
	tempList.addAll(this.Student); 
	return (tempList); 
	
	
	
	
}


//Setters


public void setArraySize(int size) {
	
	 
	 this.NumOfStudents = size; 
	 
	
	 
	
}



public void setName(String courseName ){

	  this.courseName = courseName; 
	  

	}

	public void setId(String courseCode ){

	  this.courseCode = courseCode;

	}


	public void setCorsesTaken(String StudentCorses){
		
		 this.Student.add(StudentCorses);
		 
		 
		  

		
		
	  

	  }

 


  
}