
/**
 *This shows the modules of each course that the student takes part in
 *
 * @author (James Owen)
 * @version (06/11/20)
 */
public class Module

{
    public String title;
    
    public String moduleCode;
    
    private int mark;
    
    public int totalCredits;
    
    public static final int CREDIT = 30;

    

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String moduleCode)
    {
        mark = 0;
        this.title = title;
        this.moduleCode = moduleCode;
        
    }
    

    public int getMark()
    {
        // put your code here
        return mark;
    }
    
    public void rewardMark(int mark)
    {
        if((mark >= 0) && (mark <= 100))
        {
            this.mark = mark;
        }
        else
        {
            System.out.print("That mark is invalid");
        }
        
    }
 
        public void print()
    {
        System.out.println("Module: " + moduleCode +
            "Course title " + title + " Mark = " + mark);
    }
}
