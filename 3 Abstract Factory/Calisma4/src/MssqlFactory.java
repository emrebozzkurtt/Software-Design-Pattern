public class MssqlFactory implements IFactoryService {

    @Override
    public IConnectionService createConnection() {
        return new MssqlConnection();
    }

    @Override
    public ICommandService createCommand() {
        return new MssqlCommand();
    }
    
}
