/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockSystem;

import StockSystem.Item;
import StockSystem.Payment;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Mahmoud
 */
public interface ShoppingCartRemoteInterface extends Remote {

    public void addItem(Item item, int quantity) throws RemoteException;

    public void changeQuantity(Item item, int quantity) throws RemoteException;

    public void removeItem(ItemQuantity item) throws RemoteException;

    public void setPayment(Payment paymentmethod) throws RemoteException;

    public ArrayList<ItemQuantity> getItems() throws RemoteException;

}
