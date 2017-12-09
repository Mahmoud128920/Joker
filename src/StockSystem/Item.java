package StockSystem;

import DatabaseManagement.TransactionMapper;

public class Item {

    private String name;
    private String description;
    private String manufacturerName;
    private int price;
    private int buyingPrice;
    private int stock;
    private int id;

    public Item() {
    }

    public Item(String name, String description, String manufacturerName, int price, int buyingPrice, int stock, int id) {
        this.name = name;
        this.description = description;
        this.manufacturerName = manufacturerName;
        this.price = price;
        this.buyingPrice = buyingPrice;
        this.stock = stock;
        this.id = id;
    }

    //Calculates the Expense of the item, which is buyingPrice*#ofTransactions
    //with the item.
    public int calculateItemExpense() {
        TransactionMapper TM = new TransactionMapper();
        return TM.getTransaction(this).size() + stock * buyingPrice;
    }

    //Calulates the profit of the item, which is price*#ofTransactions with the
    //item
    public int calculateItemProfit() {
        TransactionMapper TM = new TransactionMapper();
        return TM.getTransaction(this).size() * price;
    }

    //Calculates the net profit. ItemProfit-ItemExpense.
    public int calculateItemNetProfit() {

        return this.calculateItemProfit() + this.calculateItemExpense();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
