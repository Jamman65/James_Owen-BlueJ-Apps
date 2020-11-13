
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author 
 * @version 
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;
    
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int noofmodules;
    private int totalmark;
    private int meanmark;
    
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
        
        noofmodules = 0;
        totalmark = 0;
        
       
    }
    
       private void addMark(Module module)
   {
       
 
           totalmark = totalmark + module.getMark();
           
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
        
        printModules();
    }
    
    private void printModules()
    {
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
    public void printGrade()
    {
        if(noofmodules == 4)
        {
            totalmark = 0;
            
            addMark(module1);
            addMark(module2);
            addMark(module3);
            addMark(module4);
            
            System.out.println("The final mark for your course is " + meanmark +
                               "final grade: " + calculateGrade());
            
        }
    }
     public String calculateGrade()
    {
        meanmark = totalmark / 4;
        if((meanmark >= 0) && (meanmark <= 40))
        {
            return "F";
        }
        
        if((meanmark >= 40) && (meanmark <= 49))
        {
            return "D";
        }
        
         if((meanmark >= 50) && (meanmark <= 59))
        {
            return "C";
        }
        
         if((meanmark >= 60) && (meanmark <= 69))
        {
            return "B";
        }
        
        if((meanmark >= 70) && (meanmark <= 100))
        {
            return "A";
        }
        else return "X";
        
      
    }
    
}
