package DatabaseManagement;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class DatabaseClient {

    private static final String DBname = "JokerDatabase";
    
    private static DatabaseClient DBC;

    private static MongoClient mongoClient;

    private static DB database;

    private DatabaseClient() {
        mongoClient
                = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        database = mongoClient.getDB(DBname);
    }

    static protected DB getDatabase() {
        if(mongoClient==null)
            DBC= new DatabaseClient();
        return database;
    }

}
