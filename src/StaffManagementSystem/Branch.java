package StaffManagementSystem;

public class Branch {

    private String id;
    private String location;
    private String telephone;

    public Branch() {
    }

    public Branch(String id, String location, String telephone) {
        this.id = id;
        this.location = location;
        this.telephone = telephone;
    }

    //Returns the Branch Sales using all transactions made in the branch
    public int getBranchSales() {
        return 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
