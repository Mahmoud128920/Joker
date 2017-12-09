package DatabaseManagement;

import StockSystem.Client;
import java.util.ArrayList;

public class ClientMapper {

    public ClientMapper() {
        
    }
    
    //Returns all Client with the specified name
    public ArrayList<Client> getClient(String name) {
        return new ArrayList<>();
    }

    //Returns a CLient by ID
    public Client getClient(int id) {
        return new Client();
    }

    //Returns All Clients
    public ArrayList<Client> getClient() {    
        return new ArrayList<>();
    }
    //inserts a new client into the database, returns true if the operation
    //succedes
    public boolean insertNewClient(Client C) {
        return true;
    }

    //removes a client from the DB , returns true if the operation succedes
   // public boolean removeClient(Client C) {
    //    return true;
    //}

    //Updates the client Details with the CLient C. Retrieves the Client by the
    //ID
    public boolean updateClient(Client C) {
        return true;
    }

}
