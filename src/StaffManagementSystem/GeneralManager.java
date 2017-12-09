package StaffManagementSystem;


public class GeneralManager extends Staff
{
    GeneralManager Manager;
    private GeneralManager()
    {
        //manager = get from DB
    }
    
    public GeneralManager getManager()
    {
        if (Manager == null) {
            Manager = new GeneralManager();
        }
        return Manager;
    }
    
}
