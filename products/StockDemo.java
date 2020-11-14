/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        // Add at least 10 products, they do not have to be mobiles
        // Make sure the ids are sequential numbers
        int id = 100;
        manager.addProduct(new Product(id, "Samsung Galaxy S20"));
        id++;
        manager.addProduct(new Product(id, "Apple iPhone 12"));
        id++;
        manager.addProduct(new Product(id, "Google Pixel 4A"));
        id++;
        manager.addProduct(new Product(id, "Xiamoi Mi A2"));
        id++;
        manager.addProduct(new Product(id, "Xiamoi Redmi"));
        id++;
        manager.addProduct(new Product(id, "Google pixel 5"));
        id++;
        manager.addProduct(new Product(id, "Apple iPhone 12 mini"));
        id++;
        manager.addProduct(new Product(id, "Oneplus 8"));
        id++;
        manager.addProduct(new Product(id, "Oppo Find X"));
        id++;
        manager.addProduct(new Product(id, "Google Pixelbook"));
    }
    
    /**
     * Provide a demonstration of how the StockManager meets all
     * the user requirements by making a delivery of each product 
     * re-stocking it by various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        manager.printAllProducts();

        demoDeliverProducts();
        manager.printAllProducts();        

        demoSellProducts();
        manager.printAllProducts();
        
        manager.removeProduct(104);
        
        manager.renameProduct(105, "Test");
        
    }
    
    private void demoDeliverProducts()
    {
       
    }
    
    

    private void demoSellProducts()
    {
        manager.printAllProducts();
        
        for (int id = 100; id < 109; id++)
        {
             manager.sellProduct(id);
            
        }
        manager.printAllProducts();
    }    
}
