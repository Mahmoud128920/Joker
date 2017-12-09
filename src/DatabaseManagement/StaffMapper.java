package DatabaseManagement;

import StaffManagementSystem.Staff;
import StaffManagementSystem.StoreClerk;
import java.util.ArrayList;

public class StaffMapper {

    public StaffMapper() {
    }

    //Returns all staff members working in the specified branch
    public ArrayList<StoreClerk> getStaffMember(String branchName) {
        return new ArrayList<>();

    }

    //Returns the Staff member by ID
    public StoreClerk getStaffMember(int id) {
        return new StoreClerk();
    }

    //Returns all staff members
    public ArrayList<StoreClerk> getStaffMember() {
        return new ArrayList<>();
    }

    //Inserts a staff member into the DB , returns true if operation succedes
    public boolean insertStaffMember(Staff staff) {
        return true;
    }

    //Removes a Staf member from the DB, returns true if the operation succedes
   // public boolean removeStaff(Staff staff) {
    //    return true;
    //}

    //Updates the staff member details , uses the ID of the given staff member
    //Returns True if the operation works.
    public boolean updateStaffDetails(Staff staff) {
        return true;
    }
}
