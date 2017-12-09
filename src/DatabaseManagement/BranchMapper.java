package DatabaseManagement;

import StaffManagementSystem.Branch;
import java.util.ArrayList;

public class BranchMapper {

    //Returns the branch by ID
    public Branch getBranch(String branchID) {
        return new Branch();
    }

    //Returns all Branches
    public ArrayList<Branch> getBranch() {
        return new ArrayList<>();
    }

}
