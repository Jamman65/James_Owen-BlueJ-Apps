import java.util.Date;
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author James Owen
 * @version 03/10/2020
 */
public class TicketMachine extends Tickets
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Date currentDate = new Date();

    



    /**
     * This shows the customer what tickets they can buy
     */
     public void printTicket()
    {
        System.out.println("the tickets you can buy are");
        System.out.println("Aylesbury Ticket price 220");
        System.out.println("Amersham Ticket price 300");
        System.out.println("High Wycombe Ticket price 330");
    
    }

    

    /**
     * @Return The price of a ticket.
     */
    public int getTicket1()
    {
        return ticket1;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
    /**
     * This is the code which shows the customer which ticket they have bought
     */    
        if(amount == ticket1) {
            balance = balance + amount;
            System.out.println("you have purchased the Aylesbury ticket = ticket1");
        }
       
        
        if(amount == ticket2) {
            balance = balance + amount;
            System.out.println("you have purchased the Amersham ticket = ticket 2");
        }
        
        
        if(amount == ticket3) {
            balance = balance + amount;
            System.out.println("you have purchased the High Wycombe ticket = ticket 3");
        }
      
    }

    

    
    public void insertACoin(int value)
    {
        switch(value)
        {
            case 10: balance = balance + value;
            System.out.println("balance = "+balance);
            break;
            case 20: balance = balance + value;
            break;
            case 100: balance = balance + value;
            break;
            case 200: balance = balance + value;
            break;
           
            default:
                System.out.println(value+" not valid coin");
            }
    }
     /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket1()
    {
        if(balance >= ticket1) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The Aylesbury line");
            System.out.println("# Ticket");
            System.out.println("# " + ticket1 + " cents.");
            System.out.println("##################");
            System.out.println("# 03/10/2020");

            // Update the total collected with the price.
            total = total + ticket1;
            // Reduce the balance by the prince.
            balance = balance - ticket1;
        }
        else {
            System.out.println("You must insert at least: " +
                               (ticket1 - balance) + " more cents.");
                    
        }
    }
    
     /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket2()
    {
        if(balance >= ticket2) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The Amersham line");
            System.out.println("# Ticket");
            System.out.println("# " + ticket2 + " cents.");
            System.out.println("##################");
            System.out.println("# 03/10/2020");

            // Update the total collected with the price.
            total = total + ticket2;
            // Reduce the balance by the prince.
            balance = balance - ticket2;
        }
        else {
            System.out.println("You must insert at least: " +
                               (ticket2 - balance) + " more cents.");
                    
        }
    }
    
     /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket3()
    {
        if(balance >= ticket3) {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The High Wycombe line");
            System.out.println("# Ticket");
            System.out.println("# " + ticket3 + " cents.");
            System.out.println("##################");
            System.out.println("# 03/10/2020");

            // Update the total collected with the price.
            total = total + ticket3;
            // Reduce the balance by the prince.
            balance = balance - ticket3;
        }
        else {
            System.out.println("You must insert at least: " +
                               (ticket3 - balance) + " more cents.");
                    
        }
    }
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
