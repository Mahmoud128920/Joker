package StockSystem;

import jokerRMI.ShoppingCartRemoteInterface;
import DatabaseManagement.TransactionMapper;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class ShoppingCart extends UnicastRemoteObject implements ShoppingCartRemoteInterface {

    private ArrayList<ItemQuantity> items;
    private Payment payment;

    public ShoppingCart() throws RemoteException {

    }

    //Adds an item to the Shopping cart
    @Override
    public void addItem(Item item, int quantity) {

        items.add(new ItemQuantity(item, quantity));
    }

    //WORK IN PROGRESS
    //Checks out items and creates a transaction
    @Override
    public void checkoutItems(int Client_ID, int Storeclerk_ID) {

        int transactionid = 3;
        TransactionMapper TM = new TransactionMapper();
        TM.insertTransaction(new Transaction(Client_ID, Date.from(Instant.MIN),
                transactionid, this.items, Storeclerk_ID));
    }

    //WORK IN PROGRESS
    //changes the quantity of the an item in the shopping cart
    @Override
    public void changeQuantity(Item item, int quantity) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).item.equals(item)) {
                items.get(i).Quantity = quantity;
            }
        }
    }

    //Removes the item from the shopping cart.
    @Override
    public void removeItem(Item item) {
       // for (int i = 0; i < items.size(); i++) {
        //    if (items.get(i).item.equals(item)) {
       //         items.remove(i)
        //    }
        //}
        items.remove(item);
    }

    //Sets the payment method.
    @Override
    public void setPayment(Payment paymentmethod) {
        this.payment = paymentmethod;
    }

}
