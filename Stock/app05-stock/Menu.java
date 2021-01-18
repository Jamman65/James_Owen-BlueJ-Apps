
/**
 * Write a description of class Menu here.
 *
 * @author (James Owen)
 * @version (1)
 */
public class Menu
{
    private static InputReader reader = new InputReader();
    
    public static int getIntChoice(String [] choices)
    {
        int choice = 0;
        boolean validChoice = false;
        
        while(!validChoice)
        {
            printChoices(choices);
            choice = reader.getInt("\n    Enter choice number > ");
            
            if(choice > 0 && choice <= choices.length)
                validChoice = true;
            else
                System.out.println("\n " + choice + " is not a valid choice!\n");
                
        }

        return choice;
    }
    
    public static String getStringChoice(String [] choices)
    {
        boolean validChoice = false;
        
        while(!validChoice)
        {
            printChoices(choices);
            
            System.out.println("\n    Enter the first 3 letters or first two words");
            String choice = reader.getString("    Enter choice > ");
            choice = choice.toLowerCase();
            
            for(String value : choices)
            {
                value = value.toLowerCase();
                if(value.startsWith(choice))
                {
                    return value;
                }
            }
            
            System.out.println();
            System.out.printf("\n%3s %s", " ", "Choice not recognised!\n");
            System.out.println();
        }
        return null;
    }
    
    private static void printChoices(String [] choices)
    {
        for(int index = 0; index < choices.length; index++)
        {
            System.out.println("    " + (index + 1) + ". " + choices[index]);
        }
    }
}
