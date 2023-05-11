package ua.ithilell.hw9;

public class HomeWorkMain {

    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger(LoggingLevel.DEBUG);
        fileLogger.debug("Test 1");

    }

}
