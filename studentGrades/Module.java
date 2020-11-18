
/**
 *This shows the modules of each course that the student takes part in
 *
 * @author (James Owen)
 * @version (06/11/20)
 */
public class Module

{
    public String title;
    
    public String modulecode;
    
    private int mark;
    
    

    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String modulecode)
    {
        mark = 0;
        this.title = title;
        this.modulecode = modulecode;
        
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
        System.out.println("Module: " + modulecode +
            "Course title " + title + " Mark = " + mark);
    }
}
