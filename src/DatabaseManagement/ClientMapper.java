package DatabaseManagement;

import StockSystem.Client;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ClientMapper extends UnicastRemoteObject implements ClientMapperRemoteInterface{

    private final DBCollection collection;

    public ClientMapper() throws RemoteException {
        collection = DatabaseClient.getDatabase().getCollection("Client");
    }

    //Returns all Client with the specified name
    @Override
    public ArrayList<Client> getClient(String name) {
        //Gson to Convert Json to Java and viceversa
        Gson gson = new Gson();

        ArrayList<Client> Clients = new ArrayList<>();

        DBObject filter = new BasicDBObject("name", name);

        DBCursor cursor = collection.find(filter);

        while (cursor.hasNext()) {

            Clients.add(gson.fromJson(cursor.next().toString(), Client.class));

        }

        return Clients;
    }

    //Returns a CLient by ID
    @Override
    public Client getClient(int id) {
        Gson gson = new Gson();
        DBObject filter = new BasicDBObject("id", id);
        DBCursor cursor = collection.find(filter);
        DBObject client = cursor.one();
        return gson.fromJson(client.toString(), Client.class);
    }

    //Returns All Clients
    @Override
    public ArrayList<Client> getClient() {

        ArrayList<Client> clients = new ArrayList<>();
        Gson gson = new Gson();
        DBCursor cursor = collection.find();

        while (cursor.hasNext()) {
            clients.add(gson.fromJson(cursor.next().toString(), Client.class));
        }

        return clients;
    }

    //inserts a new client into the database, returns true if the operation
    //succedes
    @Override
    public boolean insertNewClient(Client client) {
        Gson gson = new Gson();
        String json = gson.toJson(client);
        DBObject DBO = (DBObject) JSON.parse(json);
        collection.insert(DBO);
        return true;
    }

    //removes a client from the DB , returns true if the operation succedes
    // public boolean removeClient(Client C) {
    //    return true;
    //}
    //Updates the client Details with the CLient C. Retrieves the Client by the
    //ID
    @Override
    public boolean updateClient(Client C) {
        Gson gson = new Gson();
        String json = gson.toJson(C);
        DBObject DBO = (DBObject) JSON.parse(json);
        DBObject filter = new BasicDBObject("id", C.getId());
        collection.update(filter, DBO);
        return true;
    }

}
