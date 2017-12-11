package StockSystem;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


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
    public void removeItem(ItemQuantity item) {
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

    public ArrayList<ItemQuantity> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemQuantity> items) {
        this.items = items;
    }
    
    

}
