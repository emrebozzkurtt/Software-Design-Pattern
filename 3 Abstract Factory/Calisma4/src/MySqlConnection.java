public class MySqlConnection implements IConnectionService{

    @Override
    public void openConnection() {
        System.out.println("My Sql Open Connection");        
    }

    @Override
    public void closeConnection() {
        System.out.println("My Sql Close Connection");
    }
    
}
