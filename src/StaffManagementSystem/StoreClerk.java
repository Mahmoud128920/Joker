package StaffManagementSystem;

public class StoreClerk extends Staff {

    private String branchId;

    public StoreClerk() {
    }

    public StoreClerk(String branchId, int id, String name, String password, String username) {
        super(id, name, password, username);
        this.branchId = branchId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

}
