
/**
 * Enumeration class ItemTypes - write a description of the enum class here
 *
 * @author (James Owen)
 * @version (1)
 */
public enum ItemTypes
{
    NONE("none"), KEY("keys"), BOTTLE("bottle"), WATER("water"), 
    FOOD("apples"), TREASURE("treasure");
    
    private String itemString;
    
    ItemTypes(String itemString)
    {
        this.itemString = itemString;
    }
    
    public String toString()
    {
        return itemString;
    }
}
