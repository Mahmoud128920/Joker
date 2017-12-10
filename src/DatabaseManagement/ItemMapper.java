package DatabaseManagement;

import jokerRMI.ItemMapperRemoteInterface;
import StockSystem.Item;
import com.mongodb.DBCollection;
import java.util.ArrayList;
import org.bson.Document;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import org.bson.conversions.Bson;

public class ItemMapper extends UnicastRemoteObject implements ItemMapperRemoteInterface{

    private final DBCollection collection;

    public ItemMapper() throws RemoteException {

        collection = DatabaseClient.getDatabase().getCollection("Item");
    }
    
    //Function to automate id increase in DB
    //public String totalitemcount()
   // {
   //            Gson gson = new Gson();
   //     DBObject filter = new BasicDBObject("id", 1);
   //     DBCursor cursor = collection.find(filter);
   //     return gson.cursor.next().get("count");
   // }

    //Returns all items belonging to the Manufacturer
    @Override
    public ArrayList<Item> getItem(String manufacturerName) {
        //Gson to Convert Json to Java and viceversa
        Gson gson = new Gson();
        //Array to hold items
        ArrayList<Item> items = new ArrayList<>();
        //Filter to get item by Manufacturer
        DBObject filter = new BasicDBObject("manufacturerName", manufacturerName);
        //Get the item
        DBCursor cursor = collection.find(filter);
        //Place every item with the manufacturer in the array
        while (cursor.hasNext()) {
            items.add(gson.fromJson(cursor.next().toString(), Item.class));
        }
        //return the items
        return items;
    }

    //Returns the item by ID
    @Override
    public Item getItem(int id) {
        Gson gson = new Gson();
        //Filter to get item by ID
        DBObject filter = new BasicDBObject("id", id);
        //Get the item
        DBCursor cursor = collection.find(filter);
        DBObject item = cursor.one();
        //return the item
        return gson.fromJson(item.toString(), Item.class);
    }

    //Returns all Items
    @Override
    public ArrayList<Item> getItem() {
        ArrayList<Item> items = new ArrayList<>();
        Gson gson = new Gson();
        DBCursor cursor = collection.find();

        while (cursor.hasNext()) {
            items.add(gson.fromJson(cursor.next().toString(), Item.class));
        }

        return items;
    }

    //Changes the item's stock quantity to the specified amount.
    @Override
    public boolean updateStock(int itemid, int amount) {
        //Filter to select the item with the Item ID
        DBObject filter = new BasicDBObject("id", itemid);
        //The new Amount of stock
        Bson newValue = new Document("stock", amount);
        //Update Operation
        DBObject update = new BasicDBObject("$set", newValue);
        collection.update(filter, update);
        return true;

    }

    //Inserts an Item into the Database
    @Override
    public boolean insertItem(Item item) {
        Gson gson = new Gson();
        String json = gson.toJson(item);
        DBObject DBO = (DBObject) JSON.parse(json);
        collection.insert(DBO);
        return true;
    }

    //Removes an item from the Database
    @Override
    public boolean removeItem(Item item) {
        Gson gson = new Gson();
        String json = gson.toJson(item);
        DBObject DBO = (DBObject) JSON.parse(json);
        collection.remove(DBO);
        return true;
    }

    //Updates an Item's details, Item ID is used to find the Item in the DB.
    @Override
    public boolean updateItemDetails(Item item) {
        Gson gson = new Gson();
        String json = gson.toJson(item);
        DBObject DBO = (DBObject) JSON.parse(json);
        DBObject filter = new BasicDBObject("id", item.getId());
        collection.update(filter, DBO);
        return true;
    }

}
