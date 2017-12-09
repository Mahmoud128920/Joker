package StockSystem;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<ItemQuantity> items;
    private Payment payment;

    //Adds an item to the Shopping cart
    public void addItem(Item item, int quantity) {
    }

    //Checks out items and creates a transaction
    public void checkoutItems() {
    }

    //changes the quantity of the an item in the shopping cart
    public void changeQuantity(Item item, int quantity) {
    }

    //Removes the item from the shopping cart.
    public void removeItem(Item item) {

    }

    //Sets the payment method.
    public void setPayment(Payment paymentmethod) {
        this.payment = paymentmethod;
    }

}
