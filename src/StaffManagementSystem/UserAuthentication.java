
package StaffManagementSystem;

public class UserAuthentication implements UserAuthenticationInterface
{

    //Retrieves the user and logs into the system
    @Override
    public Staff Login(String username, String password) {
        return new Staff();

    }

    //Logs out of the System
    @Override
    public void Logout() {

    }
    
}
