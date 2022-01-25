public class MssqlConnection implements IConnectionService {

    @Override
    public void openConnection() {
        System.out.println("Mssql open");        
    }

    @Override
    public void closeConnection() {
        System.out.println("Mssql Closer");        
    }
    
}
