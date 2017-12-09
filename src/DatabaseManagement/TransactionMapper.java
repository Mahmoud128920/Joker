package DatabaseManagement;

import StaffManagementSystem.StoreClerk;
import StockSystem.Item;
import StockSystem.Transaction;
import java.util.ArrayList;

public class TransactionMapper {

    public TransactionMapper() {
    }

    //Inserts a transaction into the Database. Returns true if operation
    //succedes
    public boolean insertTransaction(Transaction T) {
        return true;
    }

    //Returns a transaction by ID
    public Transaction getTransaction(int transactionId) {
        return new Transaction();
    }

    //Returns all Transactions made ina  branch
    public ArrayList<Transaction> getTransaction(String branch) {
        return new ArrayList<>();
    }

    //returns all Transactions done for a specific Item
    public ArrayList<Transaction> getTransaction(Item item) {
        return new ArrayList<>();
    }

    //Returns all Transactions made by a store Clerk
    public ArrayList<Transaction> getTransaction(StoreClerk clerk) {
        return new ArrayList<>();
    }

    //Returns all tranasctions
    public ArrayList<Transaction> getTransaction() {
        return new ArrayList<>();
    }

}
