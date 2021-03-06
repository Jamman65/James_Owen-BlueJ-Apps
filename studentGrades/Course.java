
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author James Owen 
 * @version 1
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;
    public int credits;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int noOfModules;
    private int totalMark;
    public int totalCredits;
    private int meanMark;
    
    private int finalMark;
    
    private Grades finalGrade;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        noOfModules = 0;
        totalMark = 0;
        totalCredits = 0;
       
    }
    
   private void addMark(Module module)
   {
       totalMark = totalMark + module.getMark();
       totalCredits += module.CREDIT;
           
   }
    
    public void addModule(int modulenumber, Module module)
    {
        if((modulenumber >=1) && (modulenumber <= 4))
        
        switch(modulenumber)
        {
            case 1: module1 = module; break;
            case 2: module2 = module; break;
            case 3: module3 = module; break;
            case 4: module4 = module; break;
        }
    }

   
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - ");
        System.out.println();
        System.out.println("total credits:" + credits);
        
        
    }
    
    private void printModules()
    {
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
    
    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
        
    }
    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }
    
    public void printGrade()
    {
        if(noOfModules == 4)
        {
            totalMark = 0;
            
            addMark(module1);
            addMark(module2);
            addMark(module3);
            addMark(module4);
            
            System.out.println("The final mark for your course is " + meanMark +
                               "final grade: " + calculateGrade());
            System.out.println();                   
        }
    }
    public String calculateGrade()
    {
        meanMark = totalMark / 4;
        if((meanMark >= 0) && (meanMark <= 40))
        {
            return "F";
        }
        
        if((meanMark >= 40) && (meanMark <= 49))
        {
            return "D";
        }
        
        if((meanMark >= 50) && (meanMark <= 59))
        {
            return "C";
        }
        
         if((meanMark >= 60) && (meanMark <= 69))
        {
            return "B";
        }
        
        if((meanMark >= 70) && (meanMark <= 100))
        {
            return "A";
        }
        else return "X";
        
      
    }
    
}
