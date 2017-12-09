package StaffManagementSystem;

public class StoreClerk extends Staff {

    private String branchId;

    public StoreClerk() {
    }

    public StoreClerk(String branchId, int id, String name, String password, String username) {
        super(id, name, password, username);
        this.branchId = branchId;
    }

    //Returns the total profit gained by this clerk by calculating all transactions
    //performed by him
    public int getClerkProfit() {
        return 0;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

}
