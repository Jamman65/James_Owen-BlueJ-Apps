import java.util.Date;
/**
 * Write a description of class Tickets here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tickets
{
    // instance variables - replace the example below with your own
        // The tickets that the machine provides
    public int tickets;
    // The Aylesbury Ticket
    public int ticket1;
    // The Amersham Ticket
    public int ticket2;
    // The High Wycombe Ticket
    public int ticket3;
    
    public Date currentDate;
    
    

    /**
     * Constructor for objects of class Tickets
     */
    public Tickets()
    {
     ticket1 = 220;
     ticket2 = 300;
     ticket3 = 330;
    

    

}

    public Date findCurrentDate()
    { 
        return currentDate;
    }
}
