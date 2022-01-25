public interface IFactoryService {
    IConnectionService createConnection();
    ICommandService createCommand();
}
