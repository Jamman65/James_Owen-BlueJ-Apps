
/**
 * Write a description of class Course here.
 *
 * @author James Owen
 * @version 0.1
 */
public class Course extends Module
{
    // instance variables - replace the example below with your own
    // the course that the student can choose
    public String course;
    // the id of the course that the student has chosen
    public String courseid;

    /**
     * Set a new course for this student.
     */
   public class changeCourse {
       public String newcourse() {
    System.out.println("Computing G400");
    return course;
    
  }
}

      /**
     * Set a new course for this student.
     */
    public void changecourse(String replacementcourse, String id1)
    {
        course = replacementcourse;
        courseid = id1;
    }
    

   public void printCourse()
    {
        System.out.println(course);
        System.out.println("Module1 ="+module);
        System.out.println(moduleid);  
        System.out.println("Module2 ="+module1);
        System.out.println(moduleid1);  
        System.out.println("Module3 ="+module2);
        System.out.println(moduleid2); 
        System.out.println("Module4 ="+module3);
        System.out.println(moduleid3);  
    }
    
}
