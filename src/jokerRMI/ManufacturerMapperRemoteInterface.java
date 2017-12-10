package jokerRMI;

import StockSystem.Manufacturer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ManufacturerMapperRemoteInterface extends Remote{

    public Manufacturer getManufacturer(String name) throws RemoteException;

    public ArrayList<Manufacturer> getManufacturer() throws RemoteException;

    public boolean insertManufacturer(Manufacturer manufacturer) throws RemoteException;

    public boolean updateManufacturer(Manufacturer manufacturer) throws RemoteException ;
    
}
