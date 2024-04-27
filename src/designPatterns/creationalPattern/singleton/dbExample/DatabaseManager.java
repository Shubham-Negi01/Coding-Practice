package designPatterns.creationalPattern.singleton.dbExample;

//this is the singleton class
public class DatabaseManager {

    private static DatabaseManager dbManager = null;
    private static String connectionUrl;

    private DatabaseManager(String connectionUrl){
        this.connectionUrl = connectionUrl;
    }

    public static DatabaseManager getInstance(){
        if(dbManager == null){
            dbManager = new DatabaseManager("https://www.testdb.com");
        }
        return dbManager;
    }

    public static String getConnectionUrl() {
        return connectionUrl;
    }
}
