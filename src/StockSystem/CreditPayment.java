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
        return true;
    }
    
    
}
