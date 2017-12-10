package StockSystem;


import java.util.ArrayList;
import java.util.Date;

public class Transaction {

    private int clientID;
    private Date date;
    private int id;
    private ArrayList<ItemQuantity> items;
    private int storeClerkID;

    public Transaction() {
    }

    public Transaction(int clientID, Date date, int id, ArrayList<ItemQuantity> items, int storeclerkID) {
        this.clientID = clientID;
        this.date = date;
        this.id = id;
        this.items = items;
        this.storeClerkID = storeclerkID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getStoreClerkID() {
        return storeClerkID;
    }

    public void setStoreClerkID(int storeClerkID) {
        this.storeClerkID = storeClerkID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<ItemQuantity> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemQuantity> items) {
        this.items = items;
    }

}
