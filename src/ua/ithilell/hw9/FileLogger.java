package ua.ithilell.hw9;

import ua.ithilell.hw9.exceptions.FileMaxSizeReachedException;

public class FileLogger {

    LoggingLevel loggingLevel;
    FileLoggerConfiguration fileLoggerConfiguration;
    public FileLogger(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
        fileLoggerConfiguration = new FileLoggerConfiguration(loggingLevel);
    }



    public void debug(String message) {
        if (fileLoggerConfiguration.getLoggingLevel() == LoggingLevel.DEBUG) {
            try {
                fileLoggerConfiguration.write(message);
            } catch (FileMaxSizeReachedException e) {
                System.err.println(e);
            }
        } else {
            info(message);
        }

    };
    public void info(String message){
        if (fileLoggerConfiguration.getLoggingLevel() == LoggingLevel.INFO) {
            try {
                fileLoggerConfiguration.write(message);
            } catch (FileMaxSizeReachedException e) {
                System.err.println(e);
            }
        }

    }
}
