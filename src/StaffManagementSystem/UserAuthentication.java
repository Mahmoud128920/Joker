
package StaffManagementSystem;

import jokerRMI.UserAuthenticationRemoteInterface;
import DatabaseManagement.StaffMapper;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserAuthentication extends UnicastRemoteObject implements UserAuthenticationRemoteInterface
{
    UserAuthentication()throws RemoteException
    {
        
    }

    //Retrieves the user and logs into the system
    @Override
    public Staff Login(String username, String password) throws Exception{
        StaffMapper SM = new StaffMapper();
        if(SM.exists(username, password))
        {
            Staff user = SM.getStaffMemberByUsername(username);
            if(user.getId()==1)
                return SM.getManager("General Manager");
            else if(user.getId()==2)
                return SM.getManager("Warehouse Manager");
           return (StoreClerk)user;
        }
        throw new Exception("User Not Found");
    }

    //Logs out of the System
    @Override
    public void Logout() {

    }
    
}
