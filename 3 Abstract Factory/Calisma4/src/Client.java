public class Client {
    IFactoryService factoryService;
    ICommandService commandService;
    IConnectionService connectionService;

    public Client(IFactoryService factoryService){
        this.factoryService = factoryService;
        commandService = factoryService.createCommand();
        connectionService = factoryService.createConnection();
    }

    public void run(){
        connectionService.openConnection();
        commandService.ExecuteCommand();
        connectionService.closeConnection();
    }
}
