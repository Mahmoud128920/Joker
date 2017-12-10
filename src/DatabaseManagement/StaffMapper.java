package DatabaseManagement;

import StaffManagementSystem.Staff;
import StaffManagementSystem.StoreClerk;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.util.ArrayList;

public class StaffMapper {

    private final DBCollection collection;

    public StaffMapper() {
        collection = DatabaseClient.getDatabase().getCollection("Branch");
    }

    public boolean exists(String username,String password)
    {
       //Gson to Convert Json to Java and viceversa
        Gson gson = new Gson();
        ArrayList<StoreClerk> staff = new ArrayList<>();
        DBObject filter = new BasicDBObject("username", username);
        DBCursor cursor = collection.find(filter);
        if(cursor.hasNext())
        {
            if(cursor.next().get("password").equals(password))
                return true;
        }
        return false;
    }
    //Returns all staff members working in the specified branch
    public ArrayList<StoreClerk> getStaffMember(String branchId) {
        //Gson to Convert Json to Java and viceversa
        Gson gson = new Gson();
        ArrayList<StoreClerk> staff = new ArrayList<>();
        DBObject filter = new BasicDBObject("branchId", branchId);
        DBCursor cursor = collection.find(filter);
        while (cursor.hasNext()) {
            staff.add(gson.fromJson(cursor.next().toString(), StoreClerk.class));
        }
        return staff;

    }

    //Returns the Staff member by ID
    public StoreClerk getStaffMember(int id) {
        
        Gson gson = new Gson();
        DBObject filter = new BasicDBObject("id", id);
        DBCursor cursor = collection.find(filter);
        DBObject storeclerk = cursor.one();
        return gson.fromJson(storeclerk.toString(), StoreClerk.class);
    }

    //Returns all staff members
    public ArrayList<StoreClerk> getStaffMember() {
        ArrayList<StoreClerk> storeclerks = new ArrayList<>();
        Gson gson = new Gson();
        DBCursor cursor = collection.find();

        while (cursor.hasNext()) {
            storeclerks.add(gson.fromJson(cursor.next().toString(),
                    StoreClerk.class));
        }

        return storeclerks;
    }

    //Inserts a staff member into the DB , returns true if operation succedes
    public boolean insertStaffMember(Staff staff) {
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        DBObject DBO = (DBObject) JSON.parse(json);
        collection.insert(DBO);
        return true;
    }

    //Removes a Staff member from the DB, returns true if the operation succedes
    // public boolean removeStaff(Staff staff) {
    //    return true;
    //}

    //Updates the staff member details , uses the ID of the given staff member
    //Returns True if the operation works.
    public boolean updateStaffDetails(Staff staff) {
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        DBObject DBO = (DBObject) JSON.parse(json);
        DBObject filter = new BasicDBObject("id", staff.getId());
        collection.update(filter, DBO);
        return true;
    }
}
