package courseWorkOne;
import java.util.ArrayList;
import java.util.Scanner; 

public class Main{

  public static void main (String args[]){
    Student student = new Student(); 
    Course course = new Course();
    Grade grade = new Grade(); 
    int numberOfStudentsInCourse = 0 ;
 

    Scanner Scan = new Scanner(System.in);

    boolean studentNotConfirmed = true; 
    boolean CoursesNotConfirmed = true; 
    
    
  
    // Start of Course Info 

    
    while (CoursesNotConfirmed == true) {
    	
    	
    	System.out.print("Enter the name of the course  : ");
        String courseName = Scan.nextLine();
        System.out.print("");
        course.setName(courseName); 
                
        
        
        System.out.print("Enter the Course Code ");
        String courseCode = Scan.nextLine();
        System.out.print("");
        course.setId(courseCode); 
        
        
        
        System.out.print("Enter the number of students taking this course  ");
        int NumberOfStudents = Scan.nextInt();
        System.out.print("");
        course.setArraySize(NumberOfStudents) ; 
        numberOfStudentsInCourse = NumberOfStudents; 
        
       
        String courseTaken = Scan.nextLine();
        for(int i = 0; i<NumberOfStudents; i++){
          System.out.printf("Enter the %d  Student  taken this course name :", i);
           courseTaken = Scan.nextLine();
          System.out.print("\n");     
          course.setCorsesTaken(courseTaken); 

          
          
          }
        
  
        
        CoursesNotConfirmed = false ; 
        break; 
        
   
    	
    }
    
      ArrayList<String> studentsOnCourse = course.getListOfStudents(); 
      System.out.println(studentsOnCourse.size());
      int i = 0 ; 
    while (studentNotConfirmed == true) {
      
     while ( i < numberOfStudentsInCourse ){
       

     
      System.out.println("enter the information for " + studentsOnCourse.get(i));
  // following code allows for the input of StudentId 
   System.out.print("Enter Id of the student : ");
    String ID = Scan.nextLine();
    System.out.print("");
    student.setId(ID);
    grade.setStudenID(ID);
 

  System.out.print("enter the number of course " +studentsOnCourse.get(i)+ " is taking : "); 
   int numOfCour = Scan.nextInt();
    student.setArraySize(numOfCour); 
 
  
  String courseTaken = Scan.nextLine(); // i have put this in since for some reson it fixes a logic error
  for(int e = 0; e<numOfCour; e++){
    System.out.printf("Enter the %d  course taken :", e);
     courseTaken = Scan.nextLine();
    System.out.print("\n");     
    student.setCorsesTaken(courseTaken); 

    
    
    }
  
  String studentGetter[] = new String [10];
  String studentGetterForCourses[] = new String[10]; 
  
  
  studentGetter[1] = student.getId(); 
  studentGetterForCourses = student.GetCoursesTaken(); 
  
  
  System.out.println("the student name is : "+studentsOnCourse.get(i)+ " and the student Id is :"+ studentGetter[1] );
  System.out.println("and the students courses are : "); 
  for (int a =0 ; a< studentGetterForCourses.length ; a++ ) {
    
	  System.out.print(a+ ".");
	  System.out.println(studentGetterForCourses[a]);
	  
  }
  boolean studentNotAdded = true; 
while (studentNotAdded == true) {
	
	
	
	 System.out.print("are these correct (y/n) : ");
	  String userInput = Scan.nextLine();
	  
	  if (userInput.equals("Y") || userInput.equals("y") ) {
		  
      int Test = 0 ;
       ArrayList<Integer> allGrades = grade.getGrade(); 
      float  totalGradeValue = 0;  
      while (Test < studentGetterForCourses.length )
      {

         System.out.println("add Grade for student "+studentsOnCourse.get(i)+ " for course " +studentGetterForCourses[Test]); 

        String gradeInput = Scan.nextLine(); 
        grade.setGrade(gradeInput); 
        System.out.println("Grade added ");
        Test++; 




      }

      System.out.println("Info done for student  "+studentsOnCourse.get(i)+ " all info below " );

      System.out.println("Name : "+studentsOnCourse.get(i));
      System.out.println("Student id  : "+student.getId());


     
       for (int a =0 ; a< studentGetterForCourses.length ; a++ ) {
         
	      System.out.println("Course: "+studentGetterForCourses[a] +" Grade: "+ allGrades.get(a));
        totalGradeValue = totalGradeValue+allGrades.get(a); 
        
	  
  }


		 System.out.println("average grade: "+totalGradeValue/studentGetterForCourses.length); 
      student.clearList(); 
      grade.clearGrade(); 
      i++; 
		  
		  //////////////////////////////
		
		  
		  /////////////////////////////
		  
		  
		  
		  studentNotAdded = false; 
		  break; 
		  
		  
	  }
	  
	  else if (userInput.equals("n") || userInput.equals("N")){
		  
		  System.out.println("Returning "); 
		  studentNotAdded = false; 
      student.clearList(); 
		  
		  
	  }
	  
	  
	  else {
		  
		  // this needs filling 
		  System.out.println("Enter a Valid input "); 
		  
		  
		  
		  
	  }
	  

        


     }
/*
  // following code allows for the student name to be input 
    System.out.print("Enter the name of the student : ");
    String name = Scan.nextLine();
    System.out.print("");
    student.setName(name);
    */

   
	
	
     }
    }
    studentNotConfirmed = false; 
    
  }








}

	
	
	




