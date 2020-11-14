import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int value)
    {
        Product product = findProduct(id);
        
        product.increaseQuantity(value);
        System.out.println("Restocked products by " + value);
        
    }
    
    /**
     * 
     */
    public Product findProduct(int id)
    {
        int index = 0;
        Product product = null;
        product = stock.get(id);
        
        return product;
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = findProduct(id);
        printProduct(id);
        
        if(product != null) 
        {
            product.sellOne();
        }
        System.out.println("items have been sold");
    }    

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println(" Products Management System");
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public ArrayList<Product> printLowStockProducts(int minimum)
    {
        ArrayList<Product> lowStock = new ArrayList<Product>();
        int count = 0;
        
        System.out.println(" Here are all of the out of stock products");
        System.out.println();
        
        for(Product product : stock)
        {
            if(product.getQuantity() <= minimum)
            {
                count++;
                lowStock.add(product);
                System.out.println(product);
            }
        }
        
        System.out.println();
        System.out.println("There were " + count + 
                           " stock products with less than " + minimum +
                           " items\n");
        return lowStock;
    }
    
     public void restockLowProducts(int minimum)
    {
       ArrayList<Product> lowStock = printLowStockProducts(minimum);
       
       System.out.println("\n Restocking the products as requested " + 
                          minimum + "\n");
                          
       for(Product product : lowStock)
       {
          product.increaseQuantity(minimum - product.getQuantity()); 
       }
    }
    
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        stock.remove(product);
        System.out.println("Product has been removed"+ id);
    }
    
    public void renameProduct(int id, String newProductname)
    {
        Product product = findProduct(id);
        System.out.println(product);
        product.setName(newProductname);
        System.out.println("Product has been renamed successfully");
        System.out.println(product);
        }
}
