package StaffManagementSystem;

import java.rmi.Remote;

public interface UserAuthenticationRemoteInterface extends Remote{
    
    public Staff Login(String username, String password) throws Exception;
    public void Logout();
    
}
