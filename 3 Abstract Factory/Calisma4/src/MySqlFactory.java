public class MySqlFactory implements IFactoryService {

    @Override
    public IConnectionService createConnection() {
        return new MySqlConnection();
    }

    @Override
    public ICommandService createCommand() {
        return new MySqlCommand();
    }
    
}
