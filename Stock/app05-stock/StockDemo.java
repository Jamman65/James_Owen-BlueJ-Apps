import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author James Owen
 */
public class StockDemo
{
   public static final int ID_ONE = 200;
   public static final int ID_TWO = 210;
    
    // The stock manager.
    private StockManager manager;
    
    private Random randomGenerator;

    /**
     * Create a StockManager and populate it with
     * 10 sample products.
     */
    public StockDemo(StockManager manager)
    {
        randomGenerator = new Random();
        this.manager = manager;
        
        addTestData();
        demoDeliverProducts();
    }
    
    public void addTestData()
    {
        int id =ID_ONE;
        manager.addProduct(new Product(id,"Apple iPhone 11"));
        
        id++;
        manager.addProduct(new Product(id,"Samsung Galaxy S10"));
        
        id++; 
        manager.addProduct(new Product(id,"Samsung Galaxy S20"));
        
        id++; 
        manager.addProduct(new Product(id,"Gogle Pixeeeel 4A"));
        
        id++; 
        manager.addProduct(new Product(id,"Xiaomi mi 11"));
        
        id++; 
        manager.addProduct(new Product(id,"Poco X3 "));
        
        id++; 
        manager.addProduct(new Product(id,"Oneplus 8T"));
        
        id++; 
        manager.addProduct(new Product(id,"Oneplus Nord"));
        
        id++; 
        manager.addProduct(new Product(id,"Oppo Find X"));
        
        id++; 
        manager.addProduct(new Product(id,"Apple iPhone 12"));
    }
    
    public void runDemo()
    {
       manager.printAllProducts();
       demoDeliverProducts();
       manager.printAllProducts();
       demoSellProducts();
       manager.printAllProducts();
       
       manager.removeProduct(202);
       
       manager.renameProduct(203, "Google Pixel 4A");
       //manager.restockLowProducts(3);
       manager.searchProducts("Apple");
    }
    
    private void demoDeliverProducts()
    {
       for(int id = ID_ONE; id < ID_TWO; id++)
       {
           int quantity = randomGenerator.nextInt(6) + 1;
           manager.takeDelivery(id, quantity);
       }
    }
   
   
    /**
     * Demonstrate that the StockManager can sell all
     * different quantities of all of the products
     */
    private void demoSellProducts()
    {
        manager.printAllProducts();
        
        for(int id = ID_ONE; id <ID_TWO; id++ )
        {
            int quantity = randomGenerator.nextInt(6) + 1;
            manager.sellProduct(id, quantity);
        }
        
        manager.printAllProducts();
    }
}
