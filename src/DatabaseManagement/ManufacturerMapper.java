package DatabaseManagement;

import StockSystem.Manufacturer;
import java.util.ArrayList;

public class ManufacturerMapper {

    public ManufacturerMapper() {
    }
    
    

    //Returns the manufacturer with the specified name
    public Manufacturer getManufacturer(String name) {
        return new Manufacturer();
    }
    //Returns all Manufacturers
    public ArrayList<Manufacturer> getManufacturer() {
        return new ArrayList<>();
    }
    //Inserts a new manufacturer into the Database
    public boolean insertManufacturer(Manufacturer manufacturer) {
        return true;
    }
    //Updates the manufacturer's details. Uses the ID to find the Manufacturer
    public boolean updateManufacturer(Manufacturer manufacturer) {
        return true;
    }
}
