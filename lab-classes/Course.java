
/**
 * Write a description of class Course here.
 *
 * @author James Owen
 * @version 0.1
 */
public class Course
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
public void  Courseprint()
    {
        System.out.println("course: \n " + course + " ,course id" + courseid);
    }
    
}

    

    

