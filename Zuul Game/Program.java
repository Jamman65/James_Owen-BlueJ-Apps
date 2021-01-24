
/**
 * This class creates an instance of the Game
 * class and then calls on its run method.
 *
 * @author James Owen
 * @version 1
 */
public class Program
{
    private static Game game;

    /**
     * This class creates and runs an instance of
     * the Game class
     */
    public static void main()
    {
        game = new Game("James");
        game.play();

    }
}
