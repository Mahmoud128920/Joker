package StaffManagementSystem;

public interface UserAuthenticationInterface {
    
    public Staff Login(String username, String password);
    public void Logout();
    
}
