package courseWorkOne;

public class Student extends Course {
	 
	 private String name ; 
	 protected String studentID ; 
	 protected int numberOfCourses ; 
	 private String studentCorses[] = new String[0];
	 
	
	 int Placement = 0; 
	 
	 
	 
	// getters are methods used to return the values of the private strings  

	 public String getName(){

	  return name; 


	 }

	  public String getId(){

	  return studentID; 


	 }
	  
	  
	  
	  
	 public String[] GetCoursesTaken() {
			
			
		 return studentCorses ; 
			
		}

	 // setters 

	public void setName(String name ){

	  this.name = name; 

	}

	public void setId(String studentID ){

	  this.studentID = studentID; 

	}


	public void setCorsesTaken(String StudentCorses){

	  

	    this.studentCorses[Placement] = StudentCorses ; 
	    Placement++; 


	  }
	


	 public void setArraySize(int size){
		 
		

	  studentCorses = new String[size]; 
	  
	 }

	 public void setArraySize(double size){

	  int converToInt = (int)size;
	  studentCorses = new String[converToInt]; 
	  
	 }
	  public void setArraySize(float size){

	  int converToInt = (int)size;
	  studentCorses = new String[converToInt]; 
	  
	 }

	 
	public void clearList(){

		studentCorses = new String[0];
		this.Placement=0; 
}




	}

	