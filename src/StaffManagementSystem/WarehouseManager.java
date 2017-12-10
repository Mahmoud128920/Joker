package StaffManagementSystem;

import DatabaseManagement.StaffMapper;
import java.rmi.RemoteException;

public class WarehouseManager extends Staff {

    private WarehouseManager Manager;

    private WarehouseManager() {
        try{
        StaffMapper SM = new StaffMapper();
        Manager=(WarehouseManager)SM.getManager("Warehouse Manager");
    }
        catch(RemoteException Ex)
        {
            System.out.print(Ex.getMessage());
        }
    }

    public WarehouseManager getManager() {
        if (Manager == null) {
            Manager = new WarehouseManager();
        }
        return Manager;
    }

}
