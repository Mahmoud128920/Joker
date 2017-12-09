package StockSystem;

import StaffManagementSystem.StoreClerk;
import java.util.ArrayList;
import java.util.Date;

public class Transaction {

    private Client client;
    private Date date;
    private int id;
    private ArrayList<ItemQuantity> items;
    private StoreClerk storeclerk;

    public Transaction() {
    }

    public Transaction(Client client, Date date, int id, ArrayList<ItemQuantity> items, StoreClerk storeclerk) {
        this.client = client;
        this.date = date;
        this.id = id;
        this.items = items;
        this.storeclerk = storeclerk;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public StoreClerk getStoreclerk() {
        return storeclerk;
    }

    public void setStoreclerk(StoreClerk storeclerk) {
        this.storeclerk = storeclerk;
    }

}
