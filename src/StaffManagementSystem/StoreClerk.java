package StaffManagementSystem;

import DatabaseManagement.TransactionMapper;
import StockSystem.ItemQuantity;
import StockSystem.Transaction;
import java.util.ArrayList;

public class StoreClerk extends Staff {

    private String branchId;

    public StoreClerk() {
    }

    public StoreClerk(String branchId, int id, String name, String password, String username) {
        super(id, name, password, username);
        this.branchId = branchId;
    }

    //Returns the total profit gained by this clerk by calculating all transactions
    //performed by him
    public int getClerkProfit() {
        
        int profit=0;
        
        TransactionMapper TM = new TransactionMapper();
        ArrayList<Transaction> transactions = 
                TM.getTransactionForStoreClerk(this.getId());
        
        for(int i=0;i<transactions.size();i++)
        {
            for (ItemQuantity item : transactions.get(i).getItems()) {
                
                profit+=item.item.getPrice()*item.Quantity;
            }
        }
        return profit;
        
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

}
