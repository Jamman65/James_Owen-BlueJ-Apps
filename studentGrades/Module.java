

/**
 * Write a description of class Course here.
 *
 * @author James Owen
 * @version 0.1
 */
public class Module
{
    // instance variables - replace the example below with your own
    // the course that the student can choose
    public String module;
    public String module1;
    public String module2;
    public String module3;
    // the id of the course that the student has chosen
    public String moduleid;
    public String moduleid1;
    public String moduleid2;
    public String moduleid3;
    
    public String mark;
    
    public String modulemark;



      /**
     * Set the first module for the course.
     */
    public void changemodule1(String replacementmodule1, String id1 )
    {
        module = replacementmodule1;
        moduleid = id1;
        
    }
    
     public void printModule1()
    {
        System.out.println(module);
        System.out.println(moduleid);  
       
        
    }
          /**
     * Set the second module for the course.
     */
    public void changemodule2(String replacementmodule2, String id2)
    {
        module1 = replacementmodule2;
        moduleid1 = id2;
       
    }
    
     public void printModule2()
    {
        System.out.println(module1);
        System.out.println(moduleid1);  
        
        
    }
    
          /**
     * Set the third module for the course.
     */
    public void changemodule3(String replacementmodule3, String id3)
    {
        module2 = replacementmodule3;
        moduleid2 = id3;
       
    }
    
    public void printModule3()
    {
        System.out.println(module2);
        System.out.println(moduleid2);  
        
        
    }
    
          /**
     * Set the fourth module for the course.
     */
    public void changemodule4(String replacementmodule4, String id4)
    {
        module3 = replacementmodule4;
        moduleid3 = id4;
        
    }
    
     public void printModule4()
    {
        System.out.println(module3);
        System.out.println(moduleid3);  
        
        
    }
    
    

    public void insertMark1(int value)
    {
        if(value<=39)
        System.out.println("you achieved a F grade");
        
        else if(value<=49)
        System.out.println("you achieved a D grade");
        
         else if(value<=59)
        System.out.println("you achieved a C grade");
        
        else if(value<=69)
        System.out.println("you achieved a B grade");
        
        else if(value>=70)
        System.out.println("you achieved a A grade");
}

        
    }
    

  
    
  
