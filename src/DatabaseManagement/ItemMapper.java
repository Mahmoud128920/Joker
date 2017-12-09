package DatabaseManagement;

import StockSystem.Item;
import java.util.ArrayList;

public class ItemMapper {

    public ItemMapper() {
    }

    //Returns all items belonging to the Manufacturer
    public ArrayList<Item> getItem(String manufacturerName) {
        return new ArrayList<>();
    }

    //Returns the item by ID
    public Item getItem(int id) {
        return new Item();
    }

    //Returns all Items
    public ArrayList<Item> getItem() {
        return new ArrayList<>();
    }

    //Changes the item's stock quantity to the specified amount.
    public boolean increaseStock(int itemid, int amount) {
        return true;
    }

    //Inserts an Item into the Database
    public boolean insertItem(Item item) {
        return true;
    }

    //REmoves an item from the Database
    public boolean removeItem(Item item) {
        return true;
    }

    //Updates an Item's details, Item ID is used to find the Item in the DB.
    public boolean updateItemDetails(Item item) {
        return true;
    }

}
