public class Application {
    public static void main(String[] arg){
        DBManager dbManager = DBManager.getDBManager();
        System.out.println(dbManager);

        DBManager dbManager1 = DBManager.getDBManager();
        System.out.println(dbManager1);
    }
    
}


