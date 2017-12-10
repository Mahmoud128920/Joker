package StockSystem;


public class CreditPayment implements Payment
{

    @Override
    public boolean pay(int amount) 
    {
        return creditPay(amount);
    }
    
    private boolean creditPay(int amount)        
    {
        //Assume it interacts with another system to pay
        return true;
    }
    
    
}
