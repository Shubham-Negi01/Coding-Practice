package designPatterns.creationalPattern.singleton.dbExample;

public class DatabaseDemo {

    public static void main(String[] args) {
        DatabaseManager databaseManager = DatabaseManager.getInstance();
        System.out.println(databaseManager);
        DatabaseManager databaseManager2 = DatabaseManager.getInstance();
        System.out.println(databaseManager2);
    }

}
