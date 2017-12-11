package DatabaseManagement;


import StockSystem.Manufacturer;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ManufacturerMapper extends UnicastRemoteObject implements ManufacturerMapperRemoteInterface{

    private final DBCollection collection;

    public ManufacturerMapper() throws RemoteException{
        collection = DatabaseClient.getDatabase().getCollection("Manufacturer");

    }

    

    //Returns the manufacturer with the specified name
    @Override
    public Manufacturer getManufacturer(String name) {
        
        Gson gson = new Gson();
        DBObject filter = new BasicDBObject("name", name);
        DBCursor cursor = collection.find(filter);
        DBObject man = cursor.one();
        return gson.fromJson(man.toString(), Manufacturer.class);
    }

    //Returns all Manufacturers
    @Override
    public ArrayList<Manufacturer> getManufacturer() {
        
        ArrayList<Manufacturer> manufacturer = new ArrayList<>();
        
        Gson gson = new Gson();
        
        DBCursor cursor = collection.find();
        
        while (cursor.hasNext()) {
            
            manufacturer.add(gson.fromJson(cursor.next().toString(),
                    Manufacturer.class));
        }

        return manufacturer;
    }

    //Inserts a new manufacturer into the Database
    @Override
    public boolean insertManufacturer(Manufacturer manufacturer) {
        Gson gson = new Gson();
        String json = gson.toJson(manufacturer);
        DBObject DBO = (DBObject) JSON.parse(json);
        collection.insert(DBO);
        return true;
    }

    //Updates the manufacturer's details. Uses the ID to find the Manufacturer
    @Override
    public boolean updateManufacturer(Manufacturer manufacturer) {
        Gson gson = new Gson();
        String json = gson.toJson(manufacturer);
        DBObject DBO = (DBObject) JSON.parse(json);
        DBObject filter = new BasicDBObject("name", manufacturer.getName());
        collection.update(filter, DBO);
        return true;
    }
}
