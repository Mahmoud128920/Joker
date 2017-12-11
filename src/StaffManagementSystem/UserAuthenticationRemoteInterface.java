package StaffManagementSystem;

import StaffManagementSystem.Staff;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserAuthenticationRemoteInterface extends Remote{
    
    public Staff Login(String username, String password) throws RemoteException;
    //public void Logout();
    
}
