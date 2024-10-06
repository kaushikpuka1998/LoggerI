import Entities.ConsoleLogSink;
import Entities.FileLogSink;
import Entities.LogLevel;
import Entities.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Logger logger = Logger.getInstance();
        logger.setLogSink(new ConsoleLogSink());

        logger.setLogLevel(LogLevel.INFO);

        logger.log(LogLevel.INFO, "This is an info message");
        logger.log(LogLevel.WARN, "This is a warning message");
        logger.log(LogLevel.ERROR, "This is an error message");

        // Using FileLogSink
        logger.setLogSink(new FileLogSink("log.txt"));

        logger.log(LogLevel.INFO, "Logging to a file");

    }
}