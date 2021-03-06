package DatabaseManagement;

import StockSystem.Client;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ClientMapperRemoteInterface extends Remote {

    public ArrayList<Client> getClient(String name) throws RemoteException;

    public Client getClient(int id) throws RemoteException;

    public ArrayList<Client> getClient() throws RemoteException;

    public boolean insertNewClient(Client client) throws RemoteException;

    // public boolean removeClient(Client C)throws RemoteException;
    public boolean updateClient(Client C) throws RemoteException;

}
