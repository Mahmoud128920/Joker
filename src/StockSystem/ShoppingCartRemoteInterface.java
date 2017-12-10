/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StockSystem;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Mahmoud
 */
public interface ShoppingCartRemoteInterface extends Remote {

    public void addItem(Item item, int quantity) throws RemoteException;

    public void checkoutItems(int Client_ID, int Storeclerk_ID) throws RemoteException;

    public void changeQuantity(Item item, int quantity) throws RemoteException;

    public void removeItem(Item item) throws RemoteException;

    public void setPayment(Payment paymentmethod) throws RemoteException;

}
