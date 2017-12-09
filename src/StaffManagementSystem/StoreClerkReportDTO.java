package StaffManagementSystem;

public class StoreClerkReportDTO {

    private String branch;
    private String branchLocation;
    private int Sales;
    private String storeClerkName;

    public StoreClerkReportDTO(String branch, String branchLocation, int Sales, String storeClerkName) {
        this.branch = branch;
        this.branchLocation = branchLocation;
        this.Sales = Sales;
        this.storeClerkName = storeClerkName;
    }
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSales() {
        return Sales;
    }

    public void setSales(int Sales) {
        this.Sales = Sales;
    }

    public String getStoreClerkName() {
        return storeClerkName;
    }

    public void setStoreClerkName(String storeClerkName) {
        this.storeClerkName = storeClerkName;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }
    

}
