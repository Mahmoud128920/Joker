/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokerRMI;

import StockSystem.Item;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Mahmoud
 */
public interface ItemMapperRemoteInterface extends Remote {

    public Item getItem(int id) throws RemoteException;

    public ArrayList<Item> getItem() throws RemoteException;

    public ArrayList<Item> getItem(String manufacturerName) throws RemoteException;

    public boolean updateStock(int itemid, int amount) throws RemoteException;

    public boolean insertItem(Item item) throws RemoteException;

    public boolean removeItem(Item item) throws RemoteException;

    public boolean updateItemDetails(Item item) throws RemoteException;

}
