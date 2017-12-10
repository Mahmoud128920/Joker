package DatabaseManagement;

import StockSystem.ItemQuantity;
import StockSystem.Transaction;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.util.ArrayList;

public class TransactionMapper {

    private final DBCollection collection;

    public TransactionMapper() {
        collection = DatabaseClient.getDatabase().getCollection("Branch");
    }

    //Inserts a transaction into the Database. Returns true if operation
    //succedes
    public boolean insertTransaction(Transaction T) {
        Gson gson = new Gson();
        String json = gson.toJson(T);
        DBObject DBO = (DBObject) JSON.parse(json);
        collection.insert(DBO);
        return true;
    }

    //Returns a transaction by ID
    public Transaction getTransaction(int transactionId) {
        Gson gson = new Gson();
        DBObject filter = new BasicDBObject("id", transactionId);
        DBCursor cursor = collection.find(filter);
        DBObject transaction = cursor.one();
        return gson.fromJson(transaction.toString(), Transaction.class);
    }

    //returns all Transactions done for a specific Item
    public ArrayList<Transaction> getTransactionForItem(int itemid) {
        ArrayList<Transaction> transactions = new ArrayList<>();
        ArrayList<Transaction> result = new ArrayList<>();
        Gson gson = new Gson();
        DBCursor cursor = collection.find();

        while (cursor.hasNext()) {
            transactions.add(gson.fromJson(cursor.next().toString(),
                    Transaction.class));
        }
        for (int i = 0; i < transactions.size(); i++) {
            for (ItemQuantity item : transactions.get(i).getItems()) {
                if (item.item.getId() == itemid) {
                    result.add(transactions.get(i));
                }
            }
        }
        return result;
    }

    //Returns all Transactions made by a store Clerk
    public ArrayList<Transaction> getTransactionForStoreClerk(int storeclerkid) {
        //Gson to Convert Json to Java and viceversa
        Gson gson = new Gson();
        ArrayList<Transaction> transactions = new ArrayList<>();
        DBObject filter = new BasicDBObject("storeClerkID", storeclerkid);
        DBCursor cursor = collection.find(filter);
        while (cursor.hasNext()) {
            transactions.add(gson.fromJson(cursor.next().toString(),
                    Transaction.class));
        }
        return transactions;
    }

    //Returns all tranasctions
    public ArrayList<Transaction> getTransaction() {
        ArrayList<Transaction> transactions = new ArrayList<>();
        Gson gson = new Gson();
        DBCursor cursor = collection.find();

        while (cursor.hasNext()) {
            transactions.add(gson.fromJson(cursor.next().toString(),
                    Transaction.class));
        }

        return transactions;
    }

}
