package StaffManagementSystem;

import DatabaseManagement.StaffMapper;
import java.rmi.RemoteException;


public class GeneralManager extends Staff
{
    GeneralManager Manager;
    private GeneralManager()
    {
        try{
        StaffMapper SM = new StaffMapper();
        Manager=(GeneralManager)SM.getManager("General Manager");
        }
        catch(RemoteException Ex)
        {
            System.out.print(Ex.getMessage());
        }
    }
    
    public GeneralManager getManager()
    {
        if (Manager == null) {
            Manager = new GeneralManager();
        }
        return Manager;
    }
    
}
