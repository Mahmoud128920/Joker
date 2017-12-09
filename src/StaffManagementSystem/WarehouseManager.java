package StaffManagementSystem;

public class WarehouseManager extends Staff {

    private WarehouseManager Manager;

    private WarehouseManager() {
        //Manager=Get Manager from DB
    }

    public WarehouseManager getManager() {
        if (Manager == null) {
            Manager = new WarehouseManager();
        }
        return Manager;
    }

}
