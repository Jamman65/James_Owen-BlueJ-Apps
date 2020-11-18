import java.util.Random;

/**
 * This Demonstrates the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author James Owen
 * @version 15/11/2020
 */
public class StockDemo
{
    public static final int ID_ONE = 200;
    public static final int ID_TWO = 210;
    
    // The stock manager.
    private StockManager manager;
    
    

    /**
     * Create a StockManager and populate it with
     * 10 sample products.
     */
    public StockDemo(StockManager manager)
    {
        
        this.manager = manager;
        
        int id = ID_ONE;
        manager.addProduct(new Product(id,"Apple iPhone 11"));
        
        id++;
        manager.addProduct(new Product(id,"Samsung Galaxy S10"));
        
        id++; 
        manager.addProduct(new Product(id,"Samsung Galaxy S20"));
        
        id++; 
        manager.addProduct(new Product(id,"Gogle Pixel 4A"));
        
        id++; 
        manager.addProduct(new Product(id,"Motorola G8 Power Lite"));
        
        id++; 
        manager.addProduct(new Product(id,"Motorola G8 Power"));
        
        id++; 
        manager.addProduct(new Product(id,"Huawei Mate 30 Pro"));
        
        id++; 
        manager.addProduct(new Product(id,"Huawei Mate Xs 5G"));
        
        id++; 
        manager.addProduct(new Product(id,"Sony Xperia 5"));
        
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
       
       manager.removeProduct(102);
       
       manager.renameProduct(103, "Google Pixel 4A");
       //manager.restockLowProducts(3);
       manager.searchProducts("Apple");
    }
    
    private void demoDeliverProducts()
    {
       for(int id = ID_ONE; id < ID_TWO; id++)
       {
           int quantity = id;
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
        
        for(int id = ID_ONE; id < ID_TWO; id++ )
        {
            int quantity = id;
            manager.sellProduct(id, quantity);
        }
        
        manager.printAllProducts();
    }
}
