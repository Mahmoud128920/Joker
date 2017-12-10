package DatabaseManagement;

import StaffManagementSystem.Branch;
import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;

public class BranchMapper {

    private final DBCollection collection;

    public BranchMapper() {
        collection = DatabaseClient.getDatabase().getCollection("Branch");
    }

    //Returns the branch by ID
    public Branch getBranch(String branchID) {
        //Gson to Convert Json to Java and viceversa
        Gson gson = new Gson();
        DBObject filter = new BasicDBObject("id", branchID);
        DBCursor cursor = collection.find(filter);
        DBObject branch = cursor.next();
        return gson.fromJson(branch.toString(), Branch.class);
    }

    //Returns all Branches
    public ArrayList<Branch> getBranch() {
        ArrayList<Branch> branches = new ArrayList<>();
        Gson gson = new Gson();
        DBCursor cursor = collection.find();

        while (cursor.hasNext()) {
            branches.add(gson.fromJson(cursor.next().toString(), Branch.class));
        }
        return branches;
    }

}
