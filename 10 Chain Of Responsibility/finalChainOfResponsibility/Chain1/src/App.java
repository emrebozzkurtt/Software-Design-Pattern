public class App {

    public static void main(String[] args) throws Exception {
        System.out.println();

        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        infoLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(errorLogger);

        infoLogger.logMessage(AbstractLogger.INFO, "info logger");
        infoLogger.logMessage(AbstractLogger.DEBUG, "debug logger");
        infoLogger.logMessage(AbstractLogger.ERROR, "error logger");

    }
}