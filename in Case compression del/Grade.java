package courseWorkOne;
import java.util.ArrayList; 
public class Grade extends Course  {
    private ArrayList<Integer> allGrade = new ArrayList<>();
    private int gradeValue ; 
    private String CourseCode = courseCode; 
    private String studentID ; 
     




    public void setStudenID(String studentID){

         this.studentID = studentID; 

        
    }


    public void setGrade(String Grade){

        int tempGrade = Integer.parseInt(Grade); 
        this.gradeValue = tempGrade; 
        allGrade.add(tempGrade); 

    }


     public void clearGrade(){

            allGrade.clear();
        

    }


   public ArrayList<Integer>  getGrade(){
	
	
	
	return this.allGrade; 
	
}





  
}
