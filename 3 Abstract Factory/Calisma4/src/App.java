public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println();
        

        Client client = new Client(new MySqlFactory());
        client.run();

        System.out.println();

        Client client1 = new Client(new MssqlFactory());
        client1.run();

    }
}
