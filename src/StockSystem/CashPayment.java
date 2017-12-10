package StockSystem;


public class CashPayment implements Payment
{

    @Override
    public boolean pay(int amount) 
    {
        return cashPay(amount);
    }
    
    private boolean cashPay(int amount)        
    {
        //Assume system interacts with another payment system
        return true;
    }
    
}
