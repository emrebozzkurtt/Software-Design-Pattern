public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");

        CreateFactory createFactory = new CreateFactory();
        CreateService createService = createFactory.CreateApp("Desktop");

        createService.CreateAppMethod();
    }
}
